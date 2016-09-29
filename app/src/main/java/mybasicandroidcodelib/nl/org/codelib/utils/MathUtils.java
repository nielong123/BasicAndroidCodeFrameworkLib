package mybasicandroidcodelib.nl.org.codelib.utils;

import android.content.Context;

public class MathUtils {

    /**
     * 根据手机的分辨率从 dp 的单位 转成为 px(像素)
     */
    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }


    /**
     * 根据手机的分辨率从 px(像素) 的单位 转成为 dp
     */
    public static int px2dip(Context context, float pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }

    /*
    * 功能：判断字符串是否为空或者是空格
    */
    public static boolean isStringLegal(String str) {
        if (null == str) {
            return false;
        }

        if (str.equals("null")) {
            return false;
        }

        if (str.isEmpty()) {
            return false;
        }

        if (str.trim().isEmpty()) {
            return false;
        }

        return true;
    }

}
