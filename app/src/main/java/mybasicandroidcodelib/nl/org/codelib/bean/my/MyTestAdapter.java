package mybasicandroidcodelib.nl.org.codelib.bean.my;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.simon.multilevellist.MultiLevelAdapter;
import com.simon.multilevellist.OnMultiLevelItemClickListener;
import com.simon.multilevellist.tree.INode;
import com.simon.multilevellist.tree.IParent;

import mybasicandroidcodelib.nl.org.codelib.ui.CarListActivity;
import mybasicandroidcodelib.nl.org.codelib.ui.detail.DetailInfotActivity;
import mybasicandroidcodelib.nl.org.codelib.widget.BaseNode;
import mybasicandroidcodelib.nl.org.mybasicandroidcodelib.R;

/**
 * Created by Administrator on 2017/11/3.
 */

/**
 * 扩展自多级列表Adapter实现
 * Created by simon on 17-5-18.
 */

public class MyTestAdapter extends MultiLevelAdapter {

    private static final int TYPE_LEVEL_0 = 0;
    private static final int TYPE_LEVEL_1 = 1;
    private static final int TYPE_LEVEL_2 = 2;
    private static final int TYPE_LEVEL_3 = 3;
    private static final int TYPE_LEVEL_4 = 4;

    static String TAG = MyTestAdapter.class.getName();

    private Context context;

    public MyTestAdapter(Context context, IParent cities) {
        super(cities);
        this.context = context;
    }

    @Override
    protected void registerViewHolderCreators() {
        registerViewHolderCreator(TYPE_LEVEL_0, new MyTestAdapter.Level_0_ViewHolderCreator());
        registerViewHolderCreator(TYPE_LEVEL_1, new MyTestAdapter.Level_1_ViewHolderCreator());
        registerViewHolderCreator(TYPE_LEVEL_2, new MyTestAdapter.Level_2_ViewHolderCreator());
        registerViewHolderCreator(TYPE_LEVEL_3, new MyTestAdapter.Level_3_ViewHolderCreator());
        registerViewHolderCreator(TYPE_LEVEL_4, new MyTestAdapter.Level_4_ViewHolderCreator());
    }

    @Override
    public void onClickChild(INode child) {
        if (child instanceof RootNode.DataBean) {
            Log.e(TAG, ((RootNode.DataBean) child).getName() + " is on click !");
        }
        if (child instanceof RootNode.ChildNode1) {
            Log.e(TAG, ((RootNode.ChildNode1) child).getName() + " is on click !");
        }
        if (child instanceof RootNode.ChildNode2) {
            Log.e(TAG, ((RootNode.ChildNode2) child).getName() + " is on click !");
        }
        if (child instanceof RootNode.ChildNode3) {
            Log.e(TAG, ((RootNode.ChildNode3) child).getName() + " is on click !");
        }
        if (child instanceof RootNode.ChildNode4) {
            Log.e(TAG, ((RootNode.ChildNode4) child).getName() + " is on click !");
        }
    }


    @Override
    public int getItemViewType(INode data) {

        if (data instanceof RootNode.DataBean) return TYPE_LEVEL_0;
        if (data instanceof RootNode.ChildNode1) return TYPE_LEVEL_1;
        if (data instanceof RootNode.ChildNode2) return TYPE_LEVEL_2;
        if (data instanceof RootNode.ChildNode3) return TYPE_LEVEL_3;
        if (data instanceof RootNode.ChildNode4) return TYPE_LEVEL_4;

        return 0;
    }

    /***************************************************   1   *********************************************/
    private class Level_0_ViewHolderCreator implements ViewHolderCreator {

        @NonNull
        @Override
        public BaseHolder create(Context context, ViewGroup parent) {
            View view = LayoutInflater.from(context).inflate(R.layout.item_level0, parent, false);
            return new MyTestAdapter.Level_0_ViewHolder(view, MyTestAdapter.this);
        }
    }

    private static class Level_0_ViewHolder extends MultiLevelViewHolder<RootNode.DataBean> {

        private TextView tvLevel_0_Name;

        Level_0_ViewHolder(View itemView, OnMultiLevelItemClickListener listener) {
            super(itemView, TYPE_LEVEL_0, listener);
            tvLevel_0_Name = (TextView) itemView.findViewById(R.id.city_name);
        }

        @Override
        public void bindViewHolder(RootNode.DataBean data) {
            tvLevel_0_Name.setText(data.getName());
        }
    }


    /***************************************************   1   *********************************************/
    private class Level_1_ViewHolderCreator implements ViewHolderCreator {

        @NonNull
        @Override
        public BaseHolder create(Context context, ViewGroup parent) {
            View view = LayoutInflater.from(context).inflate(R.layout.item_level1, parent, false);
            return new MyTestAdapter.Level_1_ViewHolder(view, MyTestAdapter.this);
        }
    }

    private static class Level_1_ViewHolder extends MultiLevelViewHolder<RootNode.ChildNode1> {

        private TextView tvLevel_1_Name;

        Level_1_ViewHolder(View itemView, OnMultiLevelItemClickListener listener) {
            super(itemView, TYPE_LEVEL_1, listener);
            tvLevel_1_Name = (TextView) itemView.findViewById(R.id.city_name);
        }

        @Override
        public void bindViewHolder(RootNode.ChildNode1 data) {
            tvLevel_1_Name.setText(data.getName());
        }
    }

    /*******************************************************   2    *****************************************/
    private class Level_2_ViewHolderCreator implements ViewHolderCreator {

        @NonNull
        @Override
        public BaseHolder create(Context context, ViewGroup parent) {
            View view = LayoutInflater.from(context).inflate(R.layout.item_level2, parent, false);
            return new MyTestAdapter.Level_2_ViewHolder(view, MyTestAdapter.this);
        }
    }

    private static class Level_2_ViewHolder extends MultiLevelViewHolder<RootNode.ChildNode2> {

        private TextView tvStreetName;

        Level_2_ViewHolder(View itemView, OnMultiLevelItemClickListener listener) {
            super(itemView, TYPE_LEVEL_2, listener);
            tvStreetName = (TextView) itemView.findViewById(R.id.area_name);
        }

        @Override
        public void bindViewHolder(RootNode.ChildNode2 data) {
            tvStreetName.setText(data.getName());
        }
    }

    /***************************************************   3    *********************************************/
    private class Level_3_ViewHolderCreator implements ViewHolderCreator {

        @NonNull
        @Override
        public BaseHolder create(Context context, ViewGroup parent) {
            View view = LayoutInflater.from(context).inflate(R.layout.item_level3, parent, false);
            return new MyTestAdapter.Level_3_ViewHolder(view, MyTestAdapter.this);
        }
    }

    private static class Level_3_ViewHolder extends MultiLevelViewHolder<RootNode.ChildNode3> {

        private TextView tvStreetName;

        Level_3_ViewHolder(View itemView, OnMultiLevelItemClickListener listener) {
            super(itemView, TYPE_LEVEL_3, listener);
            tvStreetName = (TextView) itemView.findViewById(R.id.street_name);
        }

        @Override
        public void bindViewHolder(RootNode.ChildNode3 data) {
            tvStreetName.setText(data.getName());
        }
    }

    /***************************************************   4    *********************************************/
    private class Level_4_ViewHolderCreator implements ViewHolderCreator {

        @NonNull
        @Override
        public BaseHolder create(Context context, ViewGroup parent) {
            View view = LayoutInflater.from(context).inflate(R.layout.item_level4, parent, false);
            return new MyTestAdapter.Level_4_ViewHolder(view, MyTestAdapter.this);
        }
    }

    private static class Level_4_ViewHolder extends MultiLevelViewHolder<RootNode.ChildNode4> {

        private TextView tvName, number;
        private LinearLayout root;

        Level_4_ViewHolder(View itemView, OnMultiLevelItemClickListener listener) {
            super(itemView, TYPE_LEVEL_4, listener);
            tvName = (TextView) itemView.findViewById(R.id.street_name);
            number = (TextView) itemView.findViewById(R.id.number);
            root = (LinearLayout) itemView.findViewById(R.id.root);
        }

        @Override
        public void bindViewHolder(RootNode.ChildNode4 data) {
            tvName.setText(data.getName());
            if (data.getAttributes() != null) {
                number.setText("数量:" + data.getAttributes().getCars());
            }
            if (data.getChildren() == null || data.getChildren().size() == 0) {
                root.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent();
                        intent.setClass(view.getContext(), CarListActivity.class);
                        view.getContext().startActivity(intent);
                    }
                });
            }
        }
    }


}