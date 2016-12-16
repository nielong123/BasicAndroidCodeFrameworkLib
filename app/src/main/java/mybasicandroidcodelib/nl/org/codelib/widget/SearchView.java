package mybasicandroidcodelib.nl.org.codelib.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import mybasicandroidcodelib.nl.org.mybasicandroidcodelib.R;

/**
 * Created by Administrator on 2016/12/16.
 */

public final class SearchView extends FrameLayout {

    TextView search_edit;

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
        search_edit = (TextView) findViewById(R.id.search_edit);
    }

    public void setSearchHint(String str) {
        search_edit.setHint(str);
    }

    public void setSearchText(String str) {
        search_edit.setText(str);
    }

    public void setSearch_Drawable() {
//        search_edit.setDrawa
    }


    public void setSearch_OnClickListener(View.OnClickListener onClickListener) {
        search_edit.setOnClickListener(onClickListener);
    }


}
