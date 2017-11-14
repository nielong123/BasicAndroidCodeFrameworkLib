package mybasicandroidcodelib.nl.org.codelib.ui.detail;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.aspsine.irecyclerview.widget.LoadMoreFooterView;
import com.bigkoo.alertview.AlertView;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jaydenxiao.common.base.BaseActivity;
import com.jaydenxiao.common.commonutils.TimeUtil;
import com.jaydenxiao.common.commonutils.ToastUitl;
import com.jaydenxiao.common.commonwidget.NormalTitleBar;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import java.util.List;

import butterknife.Bind;
import mybasicandroidcodelib.nl.org.codelib.api.webServices.ServiceConfig;
import mybasicandroidcodelib.nl.org.codelib.bean.CarDetailBean;
import mybasicandroidcodelib.nl.org.codelib.bean.CarListBean;
import mybasicandroidcodelib.nl.org.codelib.config.Config;
import mybasicandroidcodelib.nl.org.codelib.ui.CarListActivity;
import mybasicandroidcodelib.nl.org.codelib.ui.MapActivity;
import mybasicandroidcodelib.nl.org.mybasicandroidcodelib.R;

import static mybasicandroidcodelib.nl.org.codelib.config.Config.encryption;

public class DetailInfotActivity extends BaseActivity {

    private static final String TAG = DetailInfotActivity.class.getName();

    public static final int RELOAD = 1;
    public static final int ERROR = 0;

    String carId;


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

    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case ERROR:
                    DetailInfotActivity.this.stopProgressDialog();
                    ToastUitl.show("获取列表失败", Toast.LENGTH_SHORT);
                    break;
                case RELOAD:
                    DetailInfotActivity.this.stopProgressDialog();
                    CarDetailBean detailBean = (CarDetailBean) msg.getData().getSerializable("detail");
                    final CarDetailBean.DataBean data = detailBean.getData().get(0);
                    carno.append(detailBean.getData().get(0).getCarno() == null ? "无车牌" : data.getCarno());
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
                    break;
            }
        }
    };

    @Override
    protected int getLayoutId() {
        return R.layout.detail_info_list;
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void initView() {
        title.setTitleText("车 辆 详 情");
        title.setBackGroundColor(this.getResources().getColor(R.color.wheel_item_text_color_selected));
        title.setOnBackListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Override
    protected void initData() {
        carId = getIntent().getStringExtra("carId");
        getCarDetail();
    }

    private void getCarDetail() {
        this.startProgressDialog();
        new Thread(new Runnable() {

            @Override
            public void run() {
                String result = null;
                try {
                    SoapObject request = new SoapObject(ServiceConfig.nameSpace, ServiceConfig.methodName);//NameSpace
                    //webService方法中的参数，这个根据你的webservice来，可以没有。
                    //但请注意，参数名称和参数类型客户端和服务端一定要一致，否则将可能获取不到你想要的
                    request.addProperty("jkxlh", encryption);
                    request.addProperty("jkid", "LdGetCar");
                    request.addProperty("CarNo", carId);

                    SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
                            SoapEnvelope.VER11);
                    envelope.dotNet = true;
                    envelope.setOutputSoapObject(request);
                    HttpTransportSE ht = new HttpTransportSE(ServiceConfig.url);
                    ht.call(ServiceConfig.soapAction, envelope);

                    if (envelope.getResponse() != null) {
                        SoapPrimitive response = (SoapPrimitive) envelope.getResponse();
                        result = response.toString();//这里获得了webService的返回值
                    }

                } catch (Exception e) {
                    result = e.getMessage();
                }
                CarDetailBean bean = null;
                if (!TextUtils.isEmpty(result)) {
                    Log.e(TAG, result);
                    if (!result.contains("failed to connect")) {
                        Gson gson = new GsonBuilder().create();
                        bean = gson.fromJson(result, CarDetailBean.class);
                        Message msg = new Message();
                        Bundle bundle = new Bundle();
                        bundle.putSerializable("detail", bean);
                        msg.setData(bundle);
                        msg.what = RELOAD;
                        handler.sendMessage(msg);
                    } else {
                        handler.sendEmptyMessage(ERROR);
                    }
                } else {
                    handler.sendEmptyMessage(ERROR);
                }
            }
        }).start();
    }

}
