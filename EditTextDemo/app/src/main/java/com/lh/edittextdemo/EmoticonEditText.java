package com.lh.edittextdemo;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EmoticonEditText extends AppCompatActivity {

    private Button btn_add;
    private EditText edit_one;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emoticon_edit_text);
        btn_add = (Button) findViewById(R.id.btn_add);
        edit_one = (EditText) findViewById(R.id.edit_one);
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SpannableString spanStr = new SpannableString("imge");
                Drawable drawable = EmoticonEditText.this.getResources().getDrawable(R.drawable.f045);
                drawable.setBounds(0,0,drawable.getIntrinsicWidth(),drawable.getIntrinsicHeight());
                ImageSpan span = new ImageSpan(drawable,ImageSpan.ALIGN_BASELINE);
                spanStr.setSpan(span,0,4, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                int cursor = edit_one.getSelectionStart();
                edit_one.getText().insert(cursor, spanStr);
            }
        });

        EditText edt_del = findViewById(R.id.et_del);

    }
}

