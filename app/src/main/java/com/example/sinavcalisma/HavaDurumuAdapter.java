package com.example.sinavcalisma;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class HavaDurumuAdapter extends BaseAdapter {

    private LayoutInflater mInflater;
    private ArrayList<Havadurumu> HavaArrayList;

    public HavaDurumuAdapter(Activity activity, ArrayList<Havadurumu> urunArrayList) {

        this.mInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.HavaArrayList = urunArrayList;
    }

    @Override
    public int getCount() {
        return HavaArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return HavaArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = mInflater.inflate(R.layout.row, null);
        TextView DurumAd = (TextView) convertView.findViewById(R.id.txt_durum);
        TextView HavaGun = (TextView) convertView.findViewById(R.id.tx_gun);
        Havadurumu urunler = HavaArrayList.get(position);
        DurumAd.setText(urunler.getTxdurumu());
        HavaGun.setText(urunler.getTxGun());
        return convertView;
    }

}