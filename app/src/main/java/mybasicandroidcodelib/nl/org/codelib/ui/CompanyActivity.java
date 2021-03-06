package mybasicandroidcodelib.nl.org.codelib.ui;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.alibaba.fastjson.JSON;
import com.aspsine.irecyclerview.OnRefreshListener;
import com.jaydenxiao.common.base.BaseActivity;
import com.jaydenxiao.common.commonutils.PreferenceUtils;
import com.jaydenxiao.common.commonutils.ToastUitl;
import com.jaydenxiao.common.commonwidget.NormalTitleBar;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import butterknife.BindView;
import butterknife.OnClick;
import mybasicandroidcodelib.nl.org.codelib.api.webServices.ServiceConfig;
import mybasicandroidcodelib.nl.org.codelib.bean.CompanyBean;
import mybasicandroidcodelib.nl.org.codelib.bean.my.MyTestAdapter;
import mybasicandroidcodelib.nl.org.codelib.bean.my.RootNode;
import mybasicandroidcodelib.nl.org.codelib.config.Config;
import mybasicandroidcodelib.nl.org.codelib.ui.login.LoginActivity;
import mybasicandroidcodelib.nl.org.mybasicandroidcodelib.R;

import static mybasicandroidcodelib.nl.org.codelib.config.Config.encryption;

public class CompanyActivity extends BaseActivity implements OnRefreshListener {

    private static final String TAG = "CompanyActivity";

    @Nullable
    @BindView(R.id.title)
    NormalTitleBar normalTitleBar;

    @BindView(R.id.irecyclerview)
    RecyclerView recyclerview;

    private final static int RELOAD = 0;
    private final static int ERROR = 1;

    CompanyBean bean;

    @OnClick(R.id.button)
    void submit() {
        // TODO call server...
        getCompanyList();
    }

    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case RELOAD:
                    CompanyActivity.this.stopProgressDialog();
                    MyTestAdapter myAdapter = new MyTestAdapter(CompanyActivity.this, createDemoData(bean));
                    recyclerview.setLayoutManager(new LinearLayoutManager(CompanyActivity.this));
                    recyclerview.setAdapter(myAdapter);
                    break;
                case ERROR:
                    ToastUitl.show("获取列表失败", Toast.LENGTH_SHORT);
                    CompanyActivity.this.stopProgressDialog();
                    break;
            }
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
        normalTitleBar.setTitleText("驾 培 管 理");
        normalTitleBar.setTvLeftVisiable(false);
        normalTitleBar.setBackGroundColor(this.getResources().getColor(R.color.wheel_item_text_color_selected));
        normalTitleBar.setRightImagSrc(R.mipmap.kpi_icon_detail);
        normalTitleBar.setOnRightImagListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(CompanyActivity.this)
                        .setMessage("是否清除已保存的账号密码?")
                        .setTitle("娄底驾培")
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                PreferenceUtils.getInstance().removeKey("login");
                                startActivity(LoginActivity.class);
                                finish();
                            }
                        })
                        .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                            }
                        }).create().show();
            }
        });
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                onRefresh();
//            }
//        });
    }

    @Override
    protected void initData() {
        getCompanyList();
    }

    private void getCompanyList() {
//        CompanyActivity.this.startProgressDialog();
        new Thread(new Runnable() {
            @Override
            public void run() {
                String result = null;
                try {
                    SoapObject request = new SoapObject(ServiceConfig.nameSpace, ServiceConfig.methodName);//NameSpace
                    request.addProperty("jkxlh", encryption);
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
                    String error = e.getMessage();
                    Log.e(TAG, error);
                }
                if (!TextUtils.isEmpty(result)) {
                    Log.e(TAG, "result = " + result);
                    if (!result.contains("failed to connect")) {
                        bean = JSON.parseObject(result, CompanyBean.class);
                        Message msg = new Message();
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
                            dataBean.open();
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

//    public void onSearch(View view) {
//        getCompanyList();
//    }

    @Override
    public void onRefresh() {
        getCompanyList();
    }

}
