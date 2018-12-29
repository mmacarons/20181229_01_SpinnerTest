package kr.tjit.a20181229_01_spinnertest.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

import kr.tjit.a20181229_01_spinnertest.R;
import kr.tjit.a20181229_01_spinnertest.datas.Restaurant;

public class CompanyAdapter extends ArrayAdapter<Restaurant> {

    Context mContext;
    List<Restaurant> mList;
    LayoutInflater inf;

    public CompanyAdapter(Context context, List<Restaurant> list) {
        super(context, R.layout.company_list_item, list);

        this.mContext = context;
        this.mList = list;
        this.inf = LayoutInflater.from(mContext);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;

        if (row == null) {

//            row야 너 화면 좀 그려
            row = inf.inflate(R.layout.company_list_item, null);

        }

        return row;
    }
}
