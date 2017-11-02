package mybasicandroidcodelib.nl.org.codelib.api.webServices;

/**
 * Created by Administrator on 2017/10/27.
 */

public interface RequestCallBack {
    void onSueecss(String msg);

    void onError(String msg);

    void onStart();

    void onFinish();
}
