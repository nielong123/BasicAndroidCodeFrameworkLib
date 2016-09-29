package mybasicandroidcodelib.nl.org.codelib.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;

/**
 * Created by Sherlock on 2016/7/27.
 */
abstract public class BaseFragment extends Fragment {

    protected abstract void initView(View view,Bundle savedInstanceState);

    protected abstract void initData();

    protected abstract void initEvent();
}
