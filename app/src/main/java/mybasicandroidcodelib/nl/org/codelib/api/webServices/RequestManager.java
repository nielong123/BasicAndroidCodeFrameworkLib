package mybasicandroidcodelib.nl.org.codelib.api.webServices;

import android.text.TextUtils;
import android.util.Log;

import com.jaydenxiao.common.baseapp.BaseApplication;
import com.jaydenxiao.common.commonutils.NetWorkUtils;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.convert.AnnotationStrategy;
import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.strategy.Strategy;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.CacheControl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.ResponseBody;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;
import rx.Observable;
import rx.Observer;
import rx.schedulers.Schedulers;


/**
 * Created by Administrator on 2017/10/27.
 */

public class RequestManager {

    final String TAG = RequestManager.class.toString();
    public final static int CONNECT_TIMEOUT = 10;
    public final static int READ_TIMEOUT = 20;
    public final static int WRITE_TIMEOUT = 10;

    public Retrofit mRetrofit;
    protected Map params;

    private static RequestManager manager;//管理者实例

    public OkHttpClient mClient;//OkHttpClient实例
    private Interceptor.Chain chain;


    public static RequestManager getInstance() {
        if (manager == null) {
            synchronized (RequestManager.class) {
                if (manager == null) {
                    manager = new RequestManager();
                }
            }
        }
        return manager;
    }

    public RequestManager() {
        Strategy strategy = new AnnotationStrategy();
        Serializer serializer = new Persister(strategy);
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        File httpCacheDirectory = new File(BaseApplication.getAppContext().getCacheDir(), "retrofit");

        int cacheSize = 32 * 1024 * 1024;
        Cache cache = new Cache(httpCacheDirectory, cacheSize);
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.readTimeout(READ_TIMEOUT, TimeUnit.SECONDS);
        builder.writeTimeout(WRITE_TIMEOUT, TimeUnit.SECONDS);
        builder.connectTimeout(CONNECT_TIMEOUT, TimeUnit.SECONDS);
        builder.retryOnConnectionFailure(true);
        builder.addInterceptor(interceptor);
        builder.addInterceptor(getInterceptor);
        builder.addNetworkInterceptor(getInterceptor);
        builder.cache(cache);

        mClient = builder.build();
        mRetrofit = new Retrofit.Builder()
                .baseUrl(WebServicesConstants.WEBSERVICE_URL)
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .addConverterFactory(SimpleXmlConverterFactory.create(serializer))
                .client(mClient)
                .build();
    }


    public void execute(Call<ResponseBody> call, final RequestCallBack callBack) {
        callBack.onStart();
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    if (response.body() == null) {
                        callBack.onError("请求发送错误");
                        return;
                    }
                    String res = response.body().string();
                    if (res.contains("{") && res.contains("}")) {
                        int startIndex = res.indexOf("{");
                        int endIndex = res.indexOf("{");
                        String subStr = res.substring(startIndex, endIndex);
                        doRequest(subStr, callBack);
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                callBack.onError(t.toString());
            }

        });
    }

    private void doRequest(final String string, final RequestCallBack callBack) {
        Observable.from(new String[]{string}).subscribeOn(Schedulers.io())
                .subscribe(new Observer<Object>() {
                    @Override
                    public void onCompleted() {
                        callBack.onFinish();
                    }

                    @Override
                    public void onError(Throwable e) {
                        callBack.onError(e.getMessage());
                    }

                    @Override
                    public void onNext(Object o) {
                        callBack.onSueecss((String) o);
                    }

                });
    }

    /**
     * 云端响应头拦截器，用来配置缓存策略
     * Dangerous interceptor that rewrites the server's cache-control header.
     */
    private final Interceptor getInterceptor = new Interceptor() {
        @Override
        public okhttp3.Response intercept(Chain chain) throws IOException {
            Request request = chain.request();
            String cacheControl = request.cacheControl().toString();
            int maxAge = 1 * 60;
            if (!NetWorkUtils.isNetConnected(BaseApplication.getAppContext())) {
                Log.e(TAG, "没有网络连接");
                request = request.newBuilder()
                        .cacheControl(TextUtils.isEmpty(cacheControl) ? CacheControl.FORCE_NETWORK : CacheControl.FORCE_CACHE)
                        .build();
            }
            okhttp3.Response originalResponse = chain.proceed(request);
            if (NetWorkUtils.isNetConnected(BaseApplication.getAppContext())) {
                //有网的时候读接口上的@Headers里的配置，你可以在这里进行统一的设置

                return originalResponse.newBuilder()
                        .header("Cache-Control", cacheControl)
                        .removeHeader("Pragma")
                        .build();
            } else {
                return originalResponse.newBuilder()
                        .header("Cache-Control", "public, only-if-cached, max-stale=" + maxAge)
                        .removeHeader("Pragma")
                        .build();
            }
        }
    };
}
