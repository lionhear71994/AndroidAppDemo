package com.lh.choiceboxdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        final RadioGroup rg1 = findViewById(R.id.rg1);

        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radbtn = (RadioButton) findViewById(checkedId);
                Toast.makeText(getApplicationContext(), "你选择了" + radbtn.getText(), Toast.LENGTH_LONG).show();
            }
        });

        Button bt1 = findViewById(R.id.bt_sbm);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 0; i < rg1.getChildCount(); i++) {
                    RadioButton rd = (RadioButton) rg1.getChildAt(i);
                    if (rd.isChecked()) {
                        Toast.makeText(getApplicationContext(), "你选择的是:" + rd.getText(), Toast.LENGTH_LONG).show();
                        break;
                     }
                }
            }
        });
        //偏移JAVA代码
        //rb.setButtonDrawable(R.drawable.rad_btn_selctor);
        //int rb_paddingLeft = getResources().getDrawable(R.mipmap.ic_checkbox_checked).getIntrinsicWidth()+5;
        //rb.setPadding(rb_paddingLeft, 0, 0, 0);

    }
}
