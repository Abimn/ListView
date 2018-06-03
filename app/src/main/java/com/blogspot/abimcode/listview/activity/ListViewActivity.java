package com.blogspot.abimcode.listview.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.blogspot.abimcode.listview.R;
import com.blogspot.abimcode.listview.adapter.AdapterListView;

public class ListViewActivity extends AppCompatActivity {

    String[] nama = {"Lampung", "Pahawang", "WayKambas"};
    int[] thumb = {R.drawable.lpg, R.drawable.phw, R.drawable.wk};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        listView = (ListView) findViewById(R.id.listWisata);
        AdapterListView adapterList = new AdapterListView(this, nama, thumb);

        listView.setAdapter(adapterList);
    }
}
