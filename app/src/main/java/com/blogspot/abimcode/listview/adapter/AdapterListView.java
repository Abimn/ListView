package com.blogspot.abimcode.listview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.blogspot.abimcode.listview.R;

/**
 * Created by Abimanyu on 4/15/18.
 */

public class AdapterListView extends BaseAdapter {

    Context context;
    String [] namaWisata;
    int [] gambarWisata;

    public AdapterListView(Context context, String[] namaWisata, int[] gambarWisata) {
        this.context = context;
        this.namaWisata = namaWisata;
        this.gambarWisata = gambarWisata;
    }

    @Override
    public int getCount() {
        return gambarWisata.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int posisi, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.tampilancustomlist, null);
        ImageView imageView = (ImageView) view.findViewById(R.id.imgView);
        TextView textView = (TextView) view.findViewById(R.id.txtnamaWisata);

        imageView.setImageResource(gambarWisata[posisi]);
        textView.setText(namaWisata[posisi]);
        return view;
    }
}
