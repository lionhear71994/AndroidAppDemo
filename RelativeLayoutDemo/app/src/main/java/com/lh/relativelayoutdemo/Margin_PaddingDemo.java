package com.lh.relativelayoutdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Margin_PaddingDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_margin__padding_demo);

        Button btn = findViewById(R.id.next2);
        final Intent it = new Intent(this,MinusMarginDemo.class);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(it);
            }
        });
    }
}
