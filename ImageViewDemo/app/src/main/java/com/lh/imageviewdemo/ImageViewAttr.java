package com.lh.imageviewdemo;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ImageViewAttr extends AppCompatActivity {
    private Drawable db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view_attr);

        ImageView iv = findViewById(R.id.src1);
        //iv.setAlpha(50);     透明度
        iv.setImageDrawable(getResources().getDrawable(R.drawable.b1009));
        //setBackgroundDrawable 设置背景





    }
}
