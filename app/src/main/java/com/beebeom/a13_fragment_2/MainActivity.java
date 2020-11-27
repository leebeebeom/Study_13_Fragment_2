package com.beebeom.a13_fragment_2;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //예제 1과 다른점은
        //1은 액티비티에 생성된 프래그먼트를 직접 조작했다면
        //2는 프래그먼트의 인스턴스를 만들어서 리플레이스 해준다는 점.

        findViewById(R.id.btn_color_change).setOnClickListener(v -> {
            //인스턴스 생성 후
            ColorBoxFrag colorBoxFrag = new ColorBoxFrag();
            int red = new Random().nextInt(256);
            int green = new Random().nextInt(256);
            int blue = new Random().nextInt(256);
            //컬러 설정 후
            colorBoxFrag.setColor(Color.rgb(red, green, blue));
            //replace 로 갈아끼우기
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container_frame, colorBoxFrag)
                    .commit();

        });
    }
}