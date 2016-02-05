package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    public static final String TAG = MainActivity.class.getSimpleName();

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //화면에 layout 표시
        setContentView(R.layout.checkbox_exam);

        mTextView = (TextView) findViewById(R.id.msg_text_view);
        ((CheckBox) findViewById(R.id.checkbox)).setOnCheckedChangeListener(this);


    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
        Toast.makeText(MainActivity.this, "check : " + isChecked, Toast.LENGTH_SHORT).show();

        // TextView 글자를 변형
        if (isChecked) {
            mTextView.setVisibility(View.VISIBLE);
        } else {
            mTextView.setVisibility(View.INVISIBLE);
        }
    }

}