package mybasicandroidcodelib.nl.org.codelib.ui.detail;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import com.bigkoo.alertview.AlertView;
import com.jaydenxiao.common.base.BaseActivity;
import com.jaydenxiao.common.commonutils.TimeUtil;
import com.jaydenxiao.common.commonwidget.NormalTitleBar;

import butterknife.Bind;
import mybasicandroidcodelib.nl.org.codelib.bean.CarListBean;
import mybasicandroidcodelib.nl.org.codelib.ui.MapActivity;
import mybasicandroidcodelib.nl.org.mybasicandroidcodelib.R;

public class DetailInfotActivity extends BaseActivity {

    CarListBean.DataBean data;


    @Bind(R.id.title)
    NormalTitleBar title;
    @Bind(R.id.carno)
    TextView carno;
    @Bind(R.id.carsstate)
    TextView carsstate;
    @Bind(R.id.location)
    TextView location;
    @Bind(R.id.coachname)
    TextView coachname;
    @Bind(R.id.stuname)
    TextView stuname;
    @Bind(R.id.gpstime)
    TextView gpstime;
    @Bind(R.id.longitudenew)
    TextView longitudenew;
    @Bind(R.id.latitudenew)
    TextView latitudenew;

    @Override
    protected int getLayoutId() {
        return R.layout.detail_info_list;
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void initView() {
        title.setTitleText("车辆详情");
        title.setBackGroundColor(R.color.colorPrimary);
        title.setOnBackListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        carno.append(data.getCarno() == null ? "无车牌" : data.getCarno());
        carsstate.append(data.getCarsstate() == null ? "无" : data.getCarsstate());
        location.append(data.getLocation() == null ? "未定位" : data.getLocation());
        coachname.append(data.getCoachname() == null ? "未签到" : data.getCoachname());
        stuname.append(data.getStuname() == null ? "无" : data.getStuname());
        gpstime.setText(data.getGpstime());
        carno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(data.getLatitudenew()) || TextUtils.isEmpty(data.getLocation())) {
                    AlertView.Builder builder = new AlertView.Builder();
                    builder.setCancelText("确  认");
                    builder.setContext(DetailInfotActivity.this);
                    builder.setStyle(AlertView.Style.Alert);
                    builder.setTitle("该车辆没有定位信息");
                    AlertView alertView = new AlertView(builder);
                    alertView.show();
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("data", data);
                    startActivity(MapActivity.class, bundle);
                }
            }
        });
    }

    @Override
    protected void initData() {
        Bundle bundle = getIntent().getExtras();
        data = (CarListBean.DataBean) bundle.getSerializable("data");
    }

}
