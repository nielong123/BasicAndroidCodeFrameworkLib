package mybasicandroidcodelib.nl.org.codelib.ui;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.widget.LinearLayoutManager;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.SearchView;
import android.widget.TextView;

import com.aspsine.irecyclerview.IRecyclerView;
import com.aspsine.irecyclerview.OnLoadMoreListener;
import com.aspsine.irecyclerview.OnRefreshListener;
import com.aspsine.irecyclerview.universaladapter.ViewHolderHelper;
import com.aspsine.irecyclerview.universaladapter.recyclerview.CommonRecycleViewAdapter;
import com.aspsine.irecyclerview.widget.LoadMoreFooterView;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jaydenxiao.common.base.BaseActivity;
import com.jaydenxiao.common.commonwidget.NormalTitleBar;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import java.util.List;

import butterknife.Bind;
import mybasicandroidcodelib.nl.org.codelib.api.webServices.ServiceConfig;
import mybasicandroidcodelib.nl.org.codelib.bean.CarListBean;
import mybasicandroidcodelib.nl.org.codelib.ui.detail.DetailInfotActivity;
import mybasicandroidcodelib.nl.org.mybasicandroidcodelib.R;


public class CarListActivity extends BaseActivity implements OnRefreshListener {

    @Bind(R.id.title)
    NormalTitleBar normalTitleBar;
    @Bind(R.id.irecyclerview)
    IRecyclerView recyclerview;
    @Bind(R.id.search)
    SearchView search;
    @Bind(R.id.button)
    Button button;

    private boolean mResideMenuIsClosed = true;
    CommonRecycleViewAdapter<CarListBean.DataBean> adapter;
    String id = "";


    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            CarListBean bean = (CarListBean) msg.getData().getSerializable("list");
            List<CarListBean.DataBean> dataList = bean.getData();

            if (adapter.getPageBean().isRefresh()) {
                recyclerview.setRefreshing(false);
                if (dataList != null) {
                    adapter.replaceAll(dataList);
                } else {
                    adapter.clear();
                }
            } else {
                if (dataList.size() > 0) {
                    recyclerview.setLoadMoreStatus(LoadMoreFooterView.Status.GONE);
                    adapter.addAll(dataList);
                } else {
                    recyclerview.setLoadMoreStatus(LoadMoreFooterView.Status.THE_END);
                }
            }
        }
    };


    @Override
    public int getLayoutId() {
        return R.layout.activity_car_list;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        normalTitleBar.setTitleText("车 辆 列 表");
        normalTitleBar.setTvLeftVisiable(false);
        normalTitleBar.setBackGroundColor(R.color.colorPrimary);
        adapter = new CommonRecycleViewAdapter<CarListBean.DataBean>(this, R.layout.layout_irecyclerview_item) {

            @Override
            public void convert(ViewHolderHelper helper, final CarListBean.DataBean bean) {
                ((TextView) helper.getView(R.id.id)).setText("车牌号:" + (bean.getCarno() == null ? "无车牌号" : bean.getCarno()));                   //车牌
                ((TextView) helper.getView(R.id.clock_state)).setText("签到状态:" + (bean.getCarsstate() == null ? "未签到" : bean.getCarsstate()));      //签到状态
                ((TextView) helper.getView(R.id.student)).setText("学员:" + (bean.getStuname() == null ? "无" : bean.getStuname()));      //签到状态
                ((TextView) helper.getView(R.id.coach)).setText("教练:" + (bean.getCoachname() == null ? "未签到" : bean.getCoachname()));      //签到状态
                helper.getView(R.id.root).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Bundle bundle = new Bundle();
                        bundle.putSerializable("data", bean);
                        startActivity(DetailInfotActivity.class, bundle);
                    }
                });
            }
        };
        recyclerview.setAdapter(adapter);
        LinearLayoutManager lineManager = new LinearLayoutManager(this);
        lineManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerview.setLayoutManager(lineManager);
        recyclerview.setOnRefreshListener(this);
    }

    @Override
    protected void initData() {

    }


    @Override
    public void onRefresh() {
        getCarList(id);
    }


    public void onSearch(View view) {
        id = search.getQuery().toString().trim();
        getCarList(id);
    }


    private void getCarList(final String id) {
        new Thread(new Runnable() {

            @Override
            public void run() {
                String result = null;
                try {
                    SoapObject request = new SoapObject(ServiceConfig.nameSpace, ServiceConfig.methodName);//NameSpace
                    //webService方法中的参数，这个根据你的webservice来，可以没有。
                    //但请注意，参数名称和参数类型客户端和服务端一定要一致，否则将可能获取不到你想要的
                    request.addProperty("jkxlh", "21EC2020-3AEA-1069-A2DD-08002B30309D");
                    request.addProperty("jkid", "LdGetCar");
                    request.addProperty("CarNo", id);

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
                CarListBean bean = null;
                if (!TextUtils.isEmpty(result)) {
                    Gson gson = new GsonBuilder().create();
                    bean = gson.fromJson(result, CarListBean.class);
                }
                Message msg = new Message();
                Bundle bundle = new Bundle();
                bundle.putSerializable("list", bean);
                msg.setData(bundle);
                handler.sendMessage(msg);
            }
        }).start();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if (mResideMenuIsClosed) {
                QuitHintDialog();
            } else {

            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    public void QuitHintDialog() {
        new AlertDialog.Builder(CarListActivity.this)
                .setMessage("是否退出應用?")
                .setTitle("娄底驾培")
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                })
                .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                }).create().show();
    }
}