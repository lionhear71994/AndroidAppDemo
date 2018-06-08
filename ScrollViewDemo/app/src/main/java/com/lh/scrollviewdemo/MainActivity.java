package com.lh.scrollviewdemo;

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
        Intent it = new Intent(this,ScrollViewActivity.class);
        switch (v.getId()) {
            case R.id.btn1:
                startActivity(it);
                break;

        }
    }
}
