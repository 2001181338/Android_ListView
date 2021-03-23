package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class NationAdapter extends BaseAdapter {

    Context context;
    ArrayList<Nation> lstNation;

    public NationAdapter(Context context, ArrayList<Nation> lstNation) {
        this.context = context;
        this.lstNation = lstNation;
    }

    @Override
    public int getCount() {
        return lstNation.size();
    }

    @Override
    public Object getItem(int i) {
        return lstNation.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null)
            view = LayoutInflater.from(context).inflate(R.layout.nationflat_layout, null);
        ImageView imageView = view.findViewById(R.id.imageView);
        TextView nationName = view.findViewById(R.id.nationName);
        TextView popular = view.findViewById(R.id.popular);

        Nation nation = lstNation.get(i);
        imageView.setImageResource(nation.getImage());
        nationName.setText(nation.getName());
        popular.setText(nation.getPopular());

        return view;
    }
}
