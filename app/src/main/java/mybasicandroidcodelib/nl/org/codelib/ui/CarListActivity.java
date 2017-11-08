package mybasicandroidcodelib.nl.org.codelib.ui;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.widget.LinearLayoutManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import com.aspsine.irecyclerview.IRecyclerView;
import com.aspsine.irecyclerview.OnRefreshListener;
import com.aspsine.irecyclerview.universaladapter.ViewHolderHelper;
import com.aspsine.irecyclerview.universaladapter.recyclerview.CommonRecycleViewAdapter;
import com.aspsine.irecyclerview.widget.LoadMoreFooterView;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jaydenxiao.common.base.BaseActivity;
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
import mybasicandroidcodelib.nl.org.codelib.bean.CarListBean;
import mybasicandroidcodelib.nl.org.codelib.bean.my.RootNode;
import mybasicandroidcodelib.nl.org.codelib.config.Config;
import mybasicandroidcodelib.nl.org.codelib.ui.detail.DetailInfotActivity;
import mybasicandroidcodelib.nl.org.mybasicandroidcodelib.R;

import static mybasicandroidcodelib.nl.org.codelib.config.Config.encryption;


public class CarListActivity extends BaseActivity implements OnRefreshListener {

    private static final String TAG = CarListActivity.class.getName();
    @Bind(R.id.title)
    NormalTitleBar normalTitleBar;
    @Bind(R.id.irecyclerview)
    IRecyclerView recyclerview;
    @Bind(R.id.search)
    SearchView search;
    @Bind(R.id.button)
    Button button;

    CommonRecycleViewAdapter<CarListBean.DataBean> adapter;
    RootNode.ChildNode1 childNode1;
    RootNode.ChildNode2 childNode2;
    RootNode.ChildNode3 childNode3;
    RootNode.ChildNode4 childNode4;
    String companyId = "";
    String carNum = "";
    String title;

    private static final int ERROR = 0;
    private static final int RELOAD = 1;


    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case ERROR:
                    ToastUitl.show("获取列表失败", Toast.LENGTH_SHORT);
                    break;
                case RELOAD:
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
                    break;
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
        normalTitleBar.setTitleText(title);
        normalTitleBar.setTvLeftVisiable(true);
        normalTitleBar.setBackGroundColor(R.color.colorPrimary);
        normalTitleBar.setOnBackListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        adapter = new CommonRecycleViewAdapter<CarListBean.DataBean>(this, R.layout.layout_irecyclerview_item) {

            @Override
            public void convert(ViewHolderHelper helper, final CarListBean.DataBean bean) {
                ((TextView) helper.getView(R.id.id)).setText("车牌号:" + (bean.getText() == null ? "无车牌号" : bean.getText()));                   //车牌
                ((TextView) helper.getView(R.id.clock_state)).setText("状态:" + (bean.getCarstatus() == null ? "空闲" : "培训中"));      //签到状态
                helper.getView(R.id.root).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Bundle bundle = new Bundle();
                        bundle.putSerializable("carId", bean.getId());
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
        title = getIntent().getStringExtra("title");
        companyId = getIntent().getStringExtra("companyId");
    }


    @Override
    public void onRefresh() {
        getCarList(carNum);
    }


    public void onSearch(View view) {
        carNum = search.getQuery().toString().trim();
        getCarList(carNum);
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
                    request.addProperty("jkxlh", encryption);
                    request.addProperty("jkid", "GetTreeList");
                    request.addProperty("Deid", Config.loginBean.getData().get(0).getDeid() + "");
                    request.addProperty("UserType", Config.loginBean.getData().get(0).getUsertype() + "");
                    request.addProperty("NodeId", companyId);

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
                    Log.e(TAG, result);
                    if (!result.contains("failed to connect")) {
                        Gson gson = new GsonBuilder().create();
                        bean = gson.fromJson(result, CarListBean.class);
                        Message msg = new Message();
                        Bundle bundle = new Bundle();
                        bundle.putSerializable("list", bean);
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
