package com.lh.adapterdemo;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.LinkedList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity implements View.OnClickListener   {

    private ListView list_one;
    private MyAdapter mAdapter = null;
    private List<Data> mData = null;
    private Context mContext = null;
    private Button btn_add,btn_clear;
    public int flag = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        mContext = ListViewActivity.this;
        bindViews();
        mData = new LinkedList<Data>();
        mAdapter = new MyAdapter((LinkedList<Data>) mData,mContext);
        list_one.setAdapter(mAdapter);

        TextView txt_empty = (TextView) findViewById(R.id.txt_empty);
        txt_empty.setText("暂无数据~");
        list_one.setEmptyView(txt_empty);


        btn_add = (Button) findViewById(R.id.btn_add);
        btn_clear = (Button) findViewById(R.id.btn_clr);
        btn_add.setOnClickListener(this);
        btn_clear.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_add:
                mAdapter.add(new Data(R.mipmap.head_icon1,"给猪哥跪了~~~ x " + flag));
                flag++;
                break;
            case R.id.btn_clr:
                mAdapter.clear();
                flag = 1;
                break;
        }
    }

    private void bindViews(){
        list_one = (ListView) findViewById(R.id.list_one);
    }
}
