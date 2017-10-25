package mybasicandroidcodelib.nl.org.codelib.ui.main;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.jaydenxiao.common.base.BaseActivity;

import butterknife.Bind;
import mybasicandroidcodelib.nl.org.mybasicandroidcodelib.R;

public class MainActivity extends BaseActivity {

    @Bind(R.id.titleview)
    TextView titleview;
    @Bind(R.id.recyclerview)
    RecyclerView recyclerview;

//    @Bind(R.id.searchview)
//    SearchView searchview;

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
//        RecyclerView.LayoutManager layoutManager =
//        recyclerViewAdapter = new BaseRecyclerViewAdapter(this);
//        recyclerview.setAdapter(recyclerViewAdapter);

//        titleview.setTitle_text("车辆列表");
//        titleview.setTitle_right_text("帮助");
//        titleview.setRightOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ToastCommonUtil.showCommonToast(MainActivity.this, "Hi Title~");
//            }
//        });
//        searchview.setSearch_OnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ToastCommonUtil.showCommonToast(MainActivity.this, "Hi Search~");
//            }
//        });
    }

    @Override
    protected void initData() {

    }




}
