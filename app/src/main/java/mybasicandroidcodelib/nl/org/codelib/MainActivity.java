package mybasicandroidcodelib.nl.org.codelib;

import android.os.Bundle;

import mybasicandroidcodelib.nl.org.codelib.app.BaseActivity;
import mybasicandroidcodelib.nl.org.mybasicandroidcodelib.R;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initView();
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }
}
