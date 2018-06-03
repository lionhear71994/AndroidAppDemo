package com.lh.textviewdemo;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.TextView;

public class DrawableDemo extends Activity {
    private TextView center;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawable_demo);
        center = (TextView) findViewById(R.id.center);
        Drawable[] drawable = center.getCompoundDrawables();
        // 数组下表0~3,依次是:左上右下
        drawable[1].setBounds(100, 0, 200, 200);
        center.setCompoundDrawables(drawable[0], drawable[1], drawable[2],
                drawable[3]);
        //①Drawable[] drawable = center.getCompoundDrawables( ); 获得四个不同方向上的图片资源,数组元素依次是:左上右下的图片
        //②drawable[1].setBounds(100, 0, 200, 200); 接着获得资源后,可以调用setBounds设置左上右下坐标点,
        // 比如这里设置了代表的是: 长是:从离文字最左边开始100dp处到200dp处 宽是:从文字上方0dp处往上延伸200dp!
        //③center.setCompoundDrawables(drawable[0], drawable[1], drawable[2], drawable[3]);为TextView重新设置drawable数组!没有图片可以用null代替哦!
        // PS：另外，从上面看出我们也可以直接在Java代码中调用setCompoundDrawables为 TextView设置图片！
    }

}
