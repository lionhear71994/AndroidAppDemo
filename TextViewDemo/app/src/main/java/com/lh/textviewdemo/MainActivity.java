package com.lh.textviewdemo;

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

    public void clickEvent(View view) {

        Intent it = new Intent(this, TextViewEffects.class);

        switch (view.getId()) {
            case R.id.btn1:
                startActivity(it);
                break;
            case R.id.btn2:
                it.setClass(this,borderTextView.class);
                startActivity(it);
                break;
            case R.id.btn3:
                it.setClass(this,DrawableDemo.class);
                startActivity(it);
                break;
            case R.id.btn4:
                it.setClass(this,AutoLinkDemo.class);
                startActivity(it);
                break;
            case R.id.btn5:
                it.setClass(this,TextViewForHTMLDemo.class);
                startActivity(it);
                break;
            case R.id.btn6:
                it.setClass(this,SpannableStringDemo.class);
                startActivity(it);
                break;
            case R.id.btn7:
                it.setClass(this,MarqueeDemo.class);
                startActivity(it);
                break;
        }

    }
}

