package com.blogspot.abimcode.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.blogspot.abimcode.listview.activity.ListViewActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ListView(View view) {
        startActivity(new Intent(MainActivity.this, ListViewActivity.class));
        Toast.makeText(this, "Go to ListView", Toast.LENGTH_SHORT).show();
    }
}
