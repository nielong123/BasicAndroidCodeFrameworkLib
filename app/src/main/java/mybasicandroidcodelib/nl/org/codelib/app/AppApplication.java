package mybasicandroidcodelib.nl.org.codelib.app;

import android.content.Context;
import android.widget.Toast;

import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.amap.api.navi.logger.Logger;
import com.jaydenxiao.common.BuildConfig;
import com.jaydenxiao.common.baseapp.BaseApplication;
import com.jaydenxiao.common.commonutils.LogUtils;
import com.jaydenxiao.common.commonutils.PreferenceUtils;
import com.jaydenxiao.common.commonutils.ToastUitl;
import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;
import com.tencent.bugly.Bugly;

import java.text.SimpleDateFormat;
import java.util.Date;

import mybasicandroidcodelib.nl.org.codelib.config.Config;

/**
 * APPLICATION
 */
public class AppApplication extends BaseApplication {

    public static Context mApplicationContext;
    public static AppApplication myApp;
    private AMapLocation mAMLocation = null;
    private AMapLocationListener mLocListener = new MyLocationListener();
    private OnLocationReceiveListener mOnLocationReceiveListener;
    private RefWatcher mRefWatcher;


    public static AppApplication getInstance() {
        return myApp;
    }

    @Override
    public void onCreate() {
        super.onCreate();
//        initWatcher();
        initLog();
        initData();
        initModel();
    }

    void initData() {
        myApp = this;
        mApplicationContext = getApplicationContext();
    }

    void initModel() {
        PreferenceUtils.init(this);
        LogUtils.logInit(BuildConfig.LOG_DEBUG);
        ToastUitl.initToast("hello", Toast.LENGTH_SHORT);
        initLocation();
        Bugly.init(getApplicationContext(), Config.BuglyID, false);
    }

    void initLog() {
        Logger.init();
    }

    void initWatcher() {
        if (LeakCanary.isInAnalyzerProcess(this)) {
            return;
        }
        mRefWatcher = LeakCanary.install(this);
    }


    //初始化定位
    private void initLocation() {
        AMapLocationClient mLocationClient = new AMapLocationClient(this);
        mLocationClient.setLocationListener(mLocListener);
        AMapLocationClientOption option = new AMapLocationClientOption();
        option.setLocationMode(AMapLocationClientOption.AMapLocationMode.Hight_Accuracy);
        option.setInterval(40000l);
        mLocationClient.setLocationOption(option);
        mLocationClient.startLocation();
    }


    public AMapLocation getAppDBLocation() {
        return mAMLocation;
    }

    public interface OnLocationReceiveListener {
        void onLbsReceive(AMapLocation location);
    }

    public class MyLocationListener implements AMapLocationListener {

        @Override
        public void onLocationChanged(AMapLocation amapLocation) {
            if (amapLocation == null) {
                return;
            }
            mAMLocation = amapLocation;
            if (mOnLocationReceiveListener != null) {
                mOnLocationReceiveListener.onLbsReceive(amapLocation);
            }
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = new Date(mAMLocation.getTime());
            df.format(date);
        }
    }
}
