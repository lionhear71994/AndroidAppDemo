package com.lh.reusebaseadapterdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }

    public void clickEvent(View view){
        Intent it = new Intent(this,MainActivity.class);

        switch (view.getId()){
            case R.id.btn1:
                startActivity(it);
                break;
            case R.id.btn2:
                it.setClass(this,MutiListViewActivity.class);
                startActivity(it);
                break;
        }
    }
}
