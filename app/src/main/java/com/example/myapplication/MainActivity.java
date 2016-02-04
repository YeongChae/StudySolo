package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //화면에 layout 표시
        setContentView(R.layout.button_exam);
        // View에 있는 인터페이스를 사용하여 메세지를 띄우는 방식.
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "클릭매우잘됨", Toast.LENGTH_SHORT).show();
            }
        };
        //두번째 버튼 id를 지정해주면 끌고 올 수 있다.
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(listener);
    }

    // activity_main.xml 에 연결 됨.
    public void onClick(View view) {
        Log.d(TAG, "클릭 잘 됨");
        // 경고메세지같은거 띄울때 활용하기 좋은 Toast
        Toast.makeText(MainActivity.this, "클릭잘됨", Toast.LENGTH_SHORT).show();
    }
}
