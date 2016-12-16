package mybasicandroidcodelib.nl.org.codelib.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

import mybasicandroidcodelib.nl.org.mybasicandroidcodelib.R;

/**
 * Created by Administrator on 2016/12/16.
 */

public final class SearchView extends FrameLayout {
    public SearchView(Context context) {
        super(context);
        initView(context);
    }

    public SearchView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context);
    }


    void initView(Context context) {
        LayoutInflater.from(context).inflate(R.layout.search_layout, this);
    }
}
