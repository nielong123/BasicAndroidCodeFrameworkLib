package mybasicandroidcodelib.nl.org.codelib.ui.main.presenter;

import com.jaydenxiao.common.baserx.RxSubscriber;

import mybasicandroidcodelib.nl.org.codelib.bean.CarListBean;
import mybasicandroidcodelib.nl.org.codelib.ui.main.contract.CarListContract;
import mybasicandroidcodelib.nl.org.mybasicandroidcodelib.R;

/**
 * Created by Administrator on 2017/10/25.
 */

public class CarListPresenter extends CarListContract.Presenter {
    @Override
    public void getCarList(String id) {
        mRxManage.add(mModel.getDetailInfo(id).subscribe(new RxSubscriber<CarListBean>(mContext, false) {

            @Override
            public void onStart() {
                super.onStart();
                mView.showLoading(mContext.getString(R.string.loading));
            }

            @Override
            protected void _onNext(CarListBean bean) {
                mView.returnDetailInfo(bean);
                mView.stopLoading();
            }


            @Override
            protected void _onError(String message) {
                mView.showErrorTip(message);
            }
        }));
    }
}
