package mybasicandroidcodelib.nl.org.codelib.ui.main.contract;

import com.jaydenxiao.common.base.BaseModel;
import com.jaydenxiao.common.base.BasePresenter;
import com.jaydenxiao.common.base.BaseView;

import mybasicandroidcodelib.nl.org.codelib.bean.CarListBean;
import rx.Observable;

/**
 * Created by Administrator on 2017/10/25.
 */

public interface CarListContract {

    interface Model extends BaseModel {
        Observable<CarListBean> getDetailInfo(String id);
    }

    interface View extends BaseView {

        void returnDetailInfo(CarListBean bean);
    }

    abstract static class Presenter extends BasePresenter<View, Model> {

        public abstract void getCarList(String id);

    }
}
