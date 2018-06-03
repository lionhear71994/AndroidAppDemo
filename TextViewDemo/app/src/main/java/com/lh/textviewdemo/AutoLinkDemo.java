package com.lh.textviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.widget.TextView;

public class AutoLinkDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_link_demo);

        TextView t1 = findViewById(R.id.web);
        TextView t2 = findViewById(R.id.phnum);
        //在Java代码中可以调用setAutoLinkMask(Linkify.ALL);
        // 这个时候可以不写协议头,autolink会自动识别，
        // 但是还要为这个TextView设置：setMovementMethod(LinkMovementMethod.getInstance()); 不然点击了是没效果的！
        t1.setMovementMethod(LinkMovementMethod.getInstance());
        
        t2.setAutoLinkMask(Linkify.ALL);
        t2.setMovementMethod(LinkMovementMethod.getInstance());

    }
}
