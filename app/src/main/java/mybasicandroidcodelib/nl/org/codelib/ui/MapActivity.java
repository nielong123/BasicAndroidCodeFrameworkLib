package mybasicandroidcodelib.nl.org.codelib.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.amap.api.maps.AMap;
import com.amap.api.maps.CameraUpdateFactory;
import com.amap.api.maps.TextureMapView;
import com.amap.api.maps.UiSettings;
import com.amap.api.maps.model.BitmapDescriptorFactory;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.Marker;
import com.amap.api.maps.model.MarkerOptions;
import com.jaydenxiao.common.base.BaseActivity;
import com.jaydenxiao.common.commonwidget.NormalTitleBar;

import butterknife.Bind;
import mybasicandroidcodelib.nl.org.codelib.bean.CarDetailBean;
import mybasicandroidcodelib.nl.org.codelib.bean.CarListBean;
import mybasicandroidcodelib.nl.org.mybasicandroidcodelib.R;


public class MapActivity extends BaseActivity {

    @Bind(R.id.title)
    NormalTitleBar title;
    @Bind(R.id.mapview)
    TextureMapView mapview;

    private AMap aMap;
    LatLng latLng;
    CarDetailBean.DataBean dataBean;

    /**
     * 方法必须重写
     */
    @Override
    protected void onResume() {
        super.onResume();
        mapview.onResume();
    }

    /**
     * 方法必须重写
     */
    @Override
    protected void onPause() {
        super.onPause();
        mapview.onPause();
    }

    /**
     * 方法必须重写
     */
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mapview.onSaveInstanceState(outState);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_map;
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void initView() {
        title.setTitleText("定 位 信 息");
        title.setBackGroundColor(this.getResources().getColor(R.color.wheel_item_text_color_selected));
        title.setOnBackListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        initMapView();
        moveCamera(latLng);
        showMark();
        findViewById(R.id.location).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveCamera(latLng);
            }
        });
    }

    @Override
    protected void initData() {
        Bundle bundle = getIntent().getExtras();
        dataBean = (CarDetailBean.DataBean) bundle.getSerializable("data");
//        latLng = new LatLng(39.968041, 116.373798);
        latLng = new LatLng(Double.valueOf(dataBean.getLatitudenew()), Double.valueOf(dataBean.getLongitudenew()));
    }

    private void initMapView() {
        mapview.onCreate(getIntent().getExtras());
        aMap = mapview.getMap();
        UiSettings settings = aMap.getUiSettings();
        settings.setMyLocationButtonEnabled(true);
        aMap.setMyLocationEnabled(true);
    }

    void moveCamera(@Nullable LatLng latlon) {
        aMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latlon, 12));
    }

    void showMark() {
        MarkerOptions markerOptions = new MarkerOptions().anchor(0.5f, 0.5f).setFlat(false)
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.che1510053038))
                .position(latLng)
                .zIndex(12)
                .title("---- 教练车 ----\n " + dataBean.getCarno());
        Marker moveMarker = aMap.addMarker(markerOptions);
        moveMarker.showInfoWindow();
    }
}
