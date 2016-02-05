package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //화면에 layout 표시
        setContentView(R.layout.button_exam);
        // View에 있는 인터페이스를 사용하여 메세지를 띄우는 방식.

        //두번째 버튼 id를 지정해주면 끌고 올 수 있다.
//        Button button2 = (Button) findViewById(R.id.button2);
//        button2.setOnClickListener(this); //익명클래스
        findViewById(R.id.button2).setOnClickListener(this);
//        Button button3 = (Button) findViewById(R.id.button3);
//        button3.setOnClickListener(this); //익명클래스
        findViewById(R.id.button3).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button2:
                Toast.makeText(MainActivity.this, "버튼2", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                Toast.makeText(MainActivity.this, "버튼3", Toast.LENGTH_SHORT).show();
                break;
        }
//        Toast.makeText(MainActivity.this, "클릭매우잘됨", Toast.LENGTH_SHORT).show();
    }
}