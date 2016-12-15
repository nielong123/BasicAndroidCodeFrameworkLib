package mybasicandroidcodelib.nl.org.codelib;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.jaydenxiao.common.base.BaseActivity;

import butterknife.Bind;
import butterknife.ButterKnife;
import mybasicandroidcodelib.nl.org.codelib.utils.ToastCommonUtil;
import mybasicandroidcodelib.nl.org.codelib.widget.TitleView;
import mybasicandroidcodelib.nl.org.mybasicandroidcodelib.R;

public class MainActivity extends BaseActivity {

    @Bind(R.id.text)
    TextView text;
    @Bind(R.id.titleview)
    TitleView titleview;

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        text.setText("hi~~~~~~~~~~~~~~~~");
        titleview.setTitle_text("标题");
        titleview.setTitle_right_text("帮助");
        titleview.setRightOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastCommonUtil.showCommonToast(MainActivity.this, "Hi~");
            }
        });
    }

    @Override
    protected void initData() {
        sayHello();
    }

    private void sayHello() {
//        OkHttpUtils.get().url(HttpConfig.URL + APP_LOGIN)
//                .build()
//                .execute(new Callback() {
//                    @Override
//                    public Object parseNetworkResponse(Response response, int id) throws Exception {
//                        return null;
//                    }
//
//                    @Override
//                    public void onError(Call call, Exception e, int id) {
//                        Logger.d("e = " + e.getMessage());
//                    }
//
//                    @Override
//                    public void onResponse(Object response, int id) {
//                        String str = response.toString();
//                        Logger.d("str = " + str);
//                    }
//                });
    }

}
