package com.lh.edittextdemo;

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

        Intent it = new Intent(this, EditTextAtt.class);

        switch (view.getId()) {
            case R.id.btn1:
                startActivity(it);
                break;
            case R.id.btn2:
                it.setClass(this,EmoticonEditText.class);
                startActivity(it);
                break;
        }

    }
}

