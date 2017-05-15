package com.fatchao.rvbase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

/**
 * author pangchao
 * created on 2017/5/15
 * email fat_chao@163.com.
 */
public class MainActivity extends AppCompatActivity {
    private RecyclerView rvDemo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvDemo = (RecyclerView) findViewById(R.id.rv_demo);
        initData();
    }

    private void initData() {
        String[] stringArray = getResources().getStringArray(R.array.demo);
        final List<String> list = Arrays.asList(stringArray);
        NormalAdapter normalAdapter = new NormalAdapter( this, list,new RvListener() {
            @Override
            public void onItemClick(int id, int position) {
                Toast.makeText(MainActivity.this, "当前点击的是" + list.get(position), Toast.LENGTH_SHORT).show();
            }
        });
        rvDemo.setLayoutManager(new LinearLayoutManager(this));
        rvDemo.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        rvDemo.setAdapter(normalAdapter);
    }
}
