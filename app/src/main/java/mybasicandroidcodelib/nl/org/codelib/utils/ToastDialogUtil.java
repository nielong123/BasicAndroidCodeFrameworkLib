package mybasicandroidcodelib.nl.org.codelib.utils;

import android.app.Dialog;
import android.content.Context;
import android.os.Handler;
import android.os.Message;

public class ToastDialogUtil extends Dialog {
    private int FLAG_DISMISS = 1;
    private boolean flag = true;
    private String titleString;

    public ToastDialogUtil(Context context, String title) {
        super(context);
        titleString = title;
    }

    @Override
    public void show() {
        super.show();
        setTitle(titleString);
        mThread.start();
    }

    @Override
    public void dismiss() {
        super.dismiss();
        flag = false;
    }

    private Thread mThread = new Thread() {
        @Override
        public void run() {
            super.run();
            while (flag) {
                try {
                    Thread.sleep(5000);
                    Message msg = mHandler.obtainMessage();
                    msg.what = FLAG_DISMISS;
                    mHandler.sendMessage(msg);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };

    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what == FLAG_DISMISS)
                dismiss();
        }
    };

}




