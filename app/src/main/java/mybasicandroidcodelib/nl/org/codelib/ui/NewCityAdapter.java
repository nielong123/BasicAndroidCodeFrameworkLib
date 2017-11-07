package mybasicandroidcodelib.nl.org.codelib.ui;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.simon.multilevellist.MultiAdapter;
import com.simon.multilevellist.MultiLevelAdapter;
import com.simon.multilevellist.OnMultiLevelItemClickListener;
import com.simon.multilevellist.tree.INode;
import com.simon.multilevellist.tree.IParent;

import mybasicandroidcodelib.nl.org.codelib.widget.Area;
import mybasicandroidcodelib.nl.org.codelib.widget.BaseNode;
import mybasicandroidcodelib.nl.org.codelib.widget.City;
import mybasicandroidcodelib.nl.org.codelib.widget.Street;
import mybasicandroidcodelib.nl.org.mybasicandroidcodelib.R;

/**
 * Created by Administrator on 2017/11/3.
 */

/**
 * 扩展自多级列表Adapter实现
 * Created by simon on 17-5-18.
 */

public class NewCityAdapter extends MultiLevelAdapter {

    private Context context;

    public NewCityAdapter(Context context, IParent cities) {
        super(cities);
        this.context = context;
    }

    @Override
    protected void registerViewHolderCreators() {
        registerViewHolderCreator(TYPE_CITY, new NewCityAdapter.CityViewHolderCreator());
        registerViewHolderCreator(TYPE_AREA, new NewCityAdapter.AreaViewHolderCreator());
        registerViewHolderCreator(TYPE_STREET, new NewCityAdapter.StreetViewHolderCreator());
//        registerViewHolderCreator(TYPE_TEST, new NewCityAdapter.TestViewHolderCreator());
    }

    @Override
    public void onClickChild(INode child) {
        Toast.makeText(context, ((BaseNode) child).getName() + " is on click !", Toast.LENGTH_SHORT).show();
    }


    @Override
    public int getItemViewType(INode data) {

        if (data instanceof City) return TYPE_CITY;

        if (data instanceof Area) return TYPE_AREA;

        if (data instanceof Street) return TYPE_STREET;

        return 0;
    }

    private static final int TYPE_TEST = 0;
    private static final int TYPE_CITY = 1;
    private static final int TYPE_AREA = 2;
    private static final int TYPE_STREET = 3;

    private class CityViewHolderCreator implements MultiAdapter.ViewHolderCreator {

        @NonNull
        @Override
        public BaseHolder create(Context context, ViewGroup parent) {
            View view = LayoutInflater.from(context).inflate(R.layout.item_level1, parent, false);
            return new NewCityAdapter.CityViewHolder(view, NewCityAdapter.this);
        }
    }

    private static class CityViewHolder extends MultiLevelViewHolder<City> {

        private TextView tvCityName;

        CityViewHolder(View itemView, OnMultiLevelItemClickListener listener) {
            super(itemView, TYPE_CITY, listener);
            tvCityName = (TextView) itemView.findViewById(R.id.city_name);
        }

        @Override
        public void bindViewHolder(City data) {
            tvCityName.setText(data.getName());
        }
    }

    private class AreaViewHolderCreator implements MultiAdapter.ViewHolderCreator {

        @NonNull
        @Override
        public BaseHolder create(Context context, ViewGroup parent) {
            View view = LayoutInflater.from(context).inflate(R.layout.item_level2, parent, false);
            return new NewCityAdapter.AreaViewHolder(view, NewCityAdapter.this);
        }
    }

    private static class AreaViewHolder extends MultiLevelViewHolder<Area> {

        private TextView tvAreaName;

        AreaViewHolder(View itemView, OnMultiLevelItemClickListener listener) {
            super(itemView, TYPE_AREA, listener);
            tvAreaName = (TextView) itemView.findViewById(R.id.area_name);
        }

        @Override
        public void bindViewHolder(Area data) {
            tvAreaName.setText(data.getName());
        }
    }


    private class StreetViewHolderCreator implements MultiAdapter.ViewHolderCreator {

        @NonNull
        @Override
        public BaseHolder create(Context context, ViewGroup parent) {
            View view = LayoutInflater.from(context).inflate(R.layout.item_level3, parent, false);
            return new NewCityAdapter.StreetViewHolder(view, NewCityAdapter.this);
        }
    }

    private static class StreetViewHolder extends MultiLevelViewHolder<Street> {

        private TextView tvStreetName;

        StreetViewHolder(View itemView, OnMultiLevelItemClickListener listener) {
            super(itemView, TYPE_STREET, listener);
            tvStreetName = (TextView) itemView.findViewById(R.id.street_name);
        }

        @Override
        public void bindViewHolder(Street data) {
            tvStreetName.setText(data.getName());
        }
    }

    /************************************************************************************************/
    private class TestViewHolderCreator implements MultiAdapter.ViewHolderCreator {

        @NonNull
        @Override
        public BaseHolder create(Context context, ViewGroup parent) {
            View view = LayoutInflater.from(context).inflate(R.layout.item_level3, parent, false);
            return new NewCityAdapter.StreetViewHolder(view, NewCityAdapter.this);
        }
    }

    private static class TestViewHolder extends MultiLevelViewHolder<Street> {

        private TextView tvStreetName;

        TestViewHolder(View itemView, OnMultiLevelItemClickListener listener) {
            super(itemView, TYPE_STREET, listener);
            tvStreetName = (TextView) itemView.findViewById(R.id.street_name);
        }

        @Override
        public void bindViewHolder(Street data) {
            tvStreetName.setText(data.getName());
        }
    }


}