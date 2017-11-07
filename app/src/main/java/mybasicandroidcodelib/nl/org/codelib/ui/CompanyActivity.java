package mybasicandroidcodelib.nl.org.codelib.ui;

import android.os.Handler;
import android.os.Message;
import android.support.v7.widget.LinearLayoutManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.alibaba.fastjson.JSON;
import com.aspsine.irecyclerview.IRecyclerView;
import com.aspsine.irecyclerview.OnRefreshListener;
import com.jaydenxiao.common.base.BaseActivity;
import com.jaydenxiao.common.commonwidget.NormalTitleBar;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import butterknife.Bind;
import mybasicandroidcodelib.nl.org.codelib.api.webServices.ServiceConfig;
import mybasicandroidcodelib.nl.org.codelib.bean.CompanyBean;
import mybasicandroidcodelib.nl.org.codelib.bean.my.MyTestAdapter;
import mybasicandroidcodelib.nl.org.codelib.bean.my.RootNode;
import mybasicandroidcodelib.nl.org.codelib.config.Config;
import mybasicandroidcodelib.nl.org.codelib.widget.Area;
import mybasicandroidcodelib.nl.org.codelib.widget.Cities;
import mybasicandroidcodelib.nl.org.codelib.widget.City;
import mybasicandroidcodelib.nl.org.codelib.widget.Street;
import mybasicandroidcodelib.nl.org.mybasicandroidcodelib.R;

public class CompanyActivity extends BaseActivity implements OnRefreshListener {

    private static final String TAG = "CompanyActivity";

    @Bind(R.id.title)
    NormalTitleBar normalTitleBar;
    @Bind(R.id.irecyclerview)
    IRecyclerView recyclerview;
    @Bind(R.id.button)
    Button button;

    private final static int RELOAD = 0;

    CompanyBean bean;

    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            MyTestAdapter myAdapter = new MyTestAdapter(CompanyActivity.this, createDemoData(bean));
            recyclerview.setLayoutManager(new LinearLayoutManager(CompanyActivity.this));
            recyclerview.setAdapter(myAdapter);
            return;
        }
    };

    @Override
    protected int getLayoutId() {
        return R.layout.activity_company;
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void initView() {
        normalTitleBar.setTitleText("车 辆 列 表");
        normalTitleBar.setTvLeftVisiable(false);
        normalTitleBar.setBackGroundColor(R.color.colorPrimary);
    }

    @Override
    protected void initData() {
        getCompanyList();
    }

    private void getCompanyList() {

        new Thread(new Runnable() {
            @Override
            public void run() {
                String result = null;
                try {
                    SoapObject request = new SoapObject(ServiceConfig.nameSpace, ServiceConfig.methodName);//NameSpace
                    request.addProperty("jkxlh", "21EC2020-3AEA-1069-A2DD-08002B30309D");
                    request.addProperty("jkid", "GetTreeList");
                    request.addProperty("Deid", Config.loginBean.getData().get(0).getDeid());
                    request.addProperty("UserType", Config.loginBean.getData().get(0).getUsertype());

                    SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
                            SoapEnvelope.VER11);
                    envelope.dotNet = true;
                    envelope.setOutputSoapObject(request);
                    HttpTransportSE ht = new HttpTransportSE(ServiceConfig.url);
                    ht.call(ServiceConfig.soapAction, envelope);

                    if (envelope.getResponse() != null) {
                        SoapPrimitive response = (SoapPrimitive) envelope.getResponse();
                        result = response.toString();           //这里获得了webService的返回值
                    }

                } catch (Exception e) {
                    result = e.getMessage();
                }
                Log.e(TAG, result);
                if (!TextUtils.isEmpty(result)) {
//                    bean = new Gson().fromJson(result, CompanyBean.class);
                    bean = JSON.parseObject(result, CompanyBean.class);
                    Message msg = new Message();
                    msg.what = RELOAD;
                    handler.sendMessage(msg);
                }
            }
        }).start();
    }

    public static RootNode createDemoData(CompanyBean bean) {

        if (bean != null) {
            RootNode root = new RootNode("root节点");
            Log.e(TAG, root.getName());
            if (bean.getData() != null) {
                for (int i = 0; i < bean.getData().size(); i++) {           //娄底市驾驶员培训系统
                    RootNode.DataBean dataBean = RootNode.DataBean2ChildNode(bean.getData().get(i));
                    Log.e(TAG, "---->" + dataBean.getName());
                    if (bean.getData().get(i) != null) {
                        for (int j = 0; j < bean.getData().get(i).getChildren().size(); j++) {              //娄底运管
                            RootNode.ChildNode1 node1 = RootNode.ChildBean1ToChildNode1(bean.getData().get(i).getChildren().get(j));
                            Log.e(TAG, "-------->" + node1.getName());
                            if (bean.getData().get(i).getChildren().get(j).getChildren() != null) {
                                for (int k = 0; k < bean.getData().get(i).getChildren().get(j).getChildren().size(); k++) {         //区
                                    RootNode.ChildNode2 node2 = RootNode.ChildBean2ToChildNode2(bean.getData().get(i).getChildren().get(j).getChildren().get(k));
                                    Log.e(TAG, "------------->" + node2.getName());
                                    if (bean.getData().get(i).getChildren().get(j).getChildren().get(k).getChildren() != null) {
                                        for (int l = 0; l < bean.getData().get(i).getChildren().get(j).getChildren().get(k).getChildren().size(); l++) {
                                            RootNode.ChildNode3 node3 = RootNode.ChildBean3ToChildNode3(bean.getData().get(i).getChildren().get(j).getChildren().get(k).getChildren().get(l));
                                            Log.e(TAG, "----------------->" + node3.getName());
                                            if (bean.getData().get(i).getChildren().get(j).getChildren().get(k).getChildren().get(l).getChildren() != null) {
                                                for (int m = 0; m < bean.getData().get(i).getChildren().get(j).getChildren().get(k).getChildren().get(l).getChildren().size(); m++) {
                                                    RootNode.ChildNode4 node4 = RootNode.ChildBean4ToChildNode4(bean.getData().get(i).getChildren().get(j).getChildren().get(k).getChildren().get(l).getChildren().get(m));
                                                    node3.addChild(node4);
                                                    Log.e(TAG, "-------------------->" + node4.getName());
                                                }
                                            }
                                            node2.addChild(node3);
                                        }
                                    }
                                    node1.addChild(node2);
                                }
                            }
                            dataBean.addChild(node1);
                        }
                    }
                    root.addChild(dataBean);
                }
            }
            Log.e(TAG, "/************************  end  ********************************/");
            return root;
        }
        return null;
    }


    public static Cities createDemoData() {

        Cities cities = new Cities("重要城市");

        City beijing = new City("北京");
        Area chaoyang = new Area("朝阳");
        Street sanlitun = new Street("三里屯");
        Street wangjing = new Street("望京");
        chaoyang.addChild(sanlitun);
        chaoyang.addChild(wangjing);
        chaoyang.open();
        Area haidian = new Area("海淀");
        Street zhongguancun = new Street("中关村");
        Street wudaokou = new Street("五道口");
        haidian.addChild(zhongguancun);
        haidian.addChild(wudaokou);

        beijing.addChild(chaoyang);
        beijing.addChild(haidian);
        beijing.open();

        City shanghai = new City("上海");

        Area dongqu = new Area("东区");
        dongqu.addChild(new Street("街道一"));
        dongqu.addChild(new Street("街道二"));
        chaoyang.open();
        Area xiqu = new Area("西区");
        xiqu.addChild(new Street("街道三"));
        xiqu.addChild(new Street("街道四"));

        shanghai.addChild(dongqu);
        shanghai.addChild(xiqu);
        shanghai.open();

        cities.addChild(beijing);
        cities.addChild(shanghai);
        cities.open();

        return cities;
    }

    public void onSearch1(View view) {
        getCompanyList();
    }

    @Override
    public void onRefresh() {

    }

}