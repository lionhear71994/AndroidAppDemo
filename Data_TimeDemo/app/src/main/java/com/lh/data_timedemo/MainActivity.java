package com.lh.data_timedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.sql.Time;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickEvent(View v){
        Intent it = new Intent(this,TextClockActivity.class);
        switch (v.getId()){
            case R.id.btn1:
                startActivity(it);
                break;
            case R.id.btn2:
                it.setClass(this,ChronometerActivity.class);
                startActivity(it);
                break;
            case R.id.btn3:
                it.setClass(this,DatePickerActivity.class);
                startActivity(it);
                break;
            case R.id.btn4:
                it.setClass(this, TimePickerActivity.class);
                startActivity(it);
                break;
            case R.id.btn5:
                it.setClass(this,CalendarViewActivity.class);
                startActivity(it);
                break;
        }
    }
}
