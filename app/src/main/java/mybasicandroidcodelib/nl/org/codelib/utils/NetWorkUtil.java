package mybasicandroidcodelib.nl.org.codelib.utils;


import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import mybasicandroidcodelib.nl.org.codelib.MyApplication;



public class NetWorkUtil {

    /***
     * 判断网络是否可用
     */
	public static boolean isNetworkAvailable() {  
        ConnectivityManager cm = (ConnectivityManager) MyApplication.getInstance().getApplicationContext()
                .getSystemService(Context.CONNECTIVITY_SERVICE);   
        if (cm == null) {  
        	return false;
        } else {
            NetworkInfo[] info = cm.getAllNetworkInfo();
            if (info != null) {   
                for (int i = 0; i < info.length; i++) {   
                    if (info[i].getState() == NetworkInfo.State.CONNECTED) {   
                        return true;   
                    }   
                }   
            }   
        }   
        return false;   
    } 
}
