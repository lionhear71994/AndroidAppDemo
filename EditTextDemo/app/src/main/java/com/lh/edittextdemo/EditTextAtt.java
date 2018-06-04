package com.lh.edittextdemo;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

public class EditTextAtt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text_att);

        EditText et1 =findViewById(R.id.et_focus);
        et1.requestFocus();
        et1.setSelection(1,3);

        EditText et2 =findViewById(R.id.et_cursorcontrol);
        et2.setSelectAllOnFocus(true);
        et2.setCursorVisible(false);
    }
}
