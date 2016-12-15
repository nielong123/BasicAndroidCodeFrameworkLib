package mybasicandroidcodelib.nl.org.codelib.widget;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import mybasicandroidcodelib.nl.org.mybasicandroidcodelib.R;


/**
 * Created by Administrator on 2016/12/15.
 */

public class TitleView extends FrameLayout {

    RelativeLayout title_back;
    TextView title_text, title_right_text;
    ImageView title_right_iv;

    public TitleView(Context context) {
        super(context);
        initView(context);
    }

    public TitleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context);
    }


    public void setRightTextShow() {
        title_right_text.setVisibility(VISIBLE);
        title_right_iv.setVisibility(GONE);
    }

    public void setRightImageViewShow() {
        title_right_text.setVisibility(GONE);
        title_right_iv.setVisibility(VISIBLE);
    }

    public void setTitle_text(String str) {
        title_text.setText(str);
    }

    public void setTitle_right_text(String str) {
        title_right_text.setText(str);
    }

    public void setRightOnClickListener(View.OnClickListener onClickListener) {
        title_right_text.setOnClickListener(onClickListener);
        title_right_iv.setOnClickListener(onClickListener);
    }

    public void setRightImageViewSrc() {

    }


    void initView(Context context) {
        LayoutInflater.from(context).inflate(R.layout.title_layout, this);
        title_text = (TextView) findViewById(R.id.title_text);
        title_right_iv = (ImageView) findViewById(R.id.title_right_iv);
        title_right_text = (TextView) findViewById(R.id.title_right_text);
        title_back = (RelativeLayout) findViewById(R.id.title_back);
        title_back.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                ((Activity) getContext()).finish();
            }
        });
    }

}
