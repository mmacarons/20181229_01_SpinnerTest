package kr.tjit.a20181229_01_spinnertest.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

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

        ImageView logoImg = row.findViewById(R.id.logoImg);
        TextView nameTxt = row.findViewById(R.id.nameTxt);

//        근거가 될 아이템을 받아오자
        Restaurant data = mList.get(position);

        nameTxt.setText(data.getName());

        return row;
    }

//    getDropDownView 도 적어줘야 함



}
