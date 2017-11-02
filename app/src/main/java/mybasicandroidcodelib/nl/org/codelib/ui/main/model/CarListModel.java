package mybasicandroidcodelib.nl.org.codelib.ui.main.model;

import mybasicandroidcodelib.nl.org.codelib.bean.CarListBean;
import mybasicandroidcodelib.nl.org.codelib.ui.main.contract.CarListContract;
import rx.Observable;

/**
 * Created by Administrator on 2017/10/25.
 */

public class CarListModel implements CarListContract.Model {

    @Override
    public Observable<CarListBean> getDetailInfo(String id) {
        return null;
    }
}
