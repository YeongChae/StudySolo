package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class ScrollActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mAgeEditText;
    private EditText mNameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 화면에 layout 표시
        setContentView(R.layout.activity_scroll);
        //이름, 나이
        mNameEditText = (EditText) findViewById(R.id.name_edit_text);
        mAgeEditText = (EditText) findViewById(R.id.age_edit_text);

        findViewById(R.id.next_activity_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        // 이름, 나이 가져와서 intent 에 추가
        Intent intent = new Intent(this, SecondActivity.class);

        intent.putExtra("name", mNameEditText.getText().toString());
        intent.putExtra("age", mAgeEditText.getText().toString());
        // secondActivity 로 전환하겠다는 intent
        // intent 정보를 토대로 다른 Acrivity를 시작
        startActivity(intent);
    }

}
