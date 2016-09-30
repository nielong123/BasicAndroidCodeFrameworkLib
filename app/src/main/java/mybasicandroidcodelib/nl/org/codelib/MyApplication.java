package mybasicandroidcodelib.nl.org.codelib;

import android.app.Application;

import com.orhanobut.logger.Logger;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.log.LoggerInterceptor;

import java.util.concurrent.TimeUnit;

import mybasicandroidcodelib.nl.org.codelib.utils.PreferenceUtils;
import okhttp3.OkHttpClient;


/**
 * Created by nl on 2016/9/29.
 */
public class MyApplication extends Application {

    private static MyApplication myApplication;

    public static MyApplication getInstance() {
        if (myApplication == null) {
            synchronized (MyApplication.class) {
                if (myApplication == null) {
                    myApplication = new MyApplication();
                }
            }
        }
        return myApplication;
    }


    @Override
    public void onCreate() {
        super.onCreate();
        Logger.init("tag");
        PreferenceUtils.init(getApplicationContext());
        initOkHttp();
    }


    private void initOkHttp() {

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(new LoggerInterceptor("TAG"))
                .connectTimeout(10000L, TimeUnit.MILLISECONDS)
                .readTimeout(10000L, TimeUnit.MILLISECONDS)
                //其他配置
                .build();
        OkHttpUtils.initClient(okHttpClient);
    }


}
