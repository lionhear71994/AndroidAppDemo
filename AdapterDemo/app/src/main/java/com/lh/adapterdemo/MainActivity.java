package com.lh.adapterdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickEvent(View v){
        Intent it = new Intent(this,ArrayAdapterActivity.class);
        switch (v.getId()){
            case R.id.btn1:
                startActivity(it);
                break;
            case R.id.btn2:
                it.setClass(this,SimpleAdapterActivity.class);
                startActivity(it);
                break;
            case R.id.btn3:
                it.setClass(this,BaseAdapterActivity.class);
                startActivity(it);
                break;
            case R.id.btn4:
                it.setClass(this,ListViewActivity.class);
                startActivity(it);
                break;
        }
    }
}
