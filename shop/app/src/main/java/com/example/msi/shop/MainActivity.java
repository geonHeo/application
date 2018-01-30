package com.example.msi.shop;

import android.content.Context;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "나는 onStart입니다.", Toast.LENGTH_SHORT).show();


    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "어플을 멈춥니다.22",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {

        super.onStop();
        Toast.makeText(this, "어플을 멈춥니다.33322",Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onDestroy() {

        super.onDestroy();
        Toast.makeText(this, "어플을 멈춥니다.555522",Toast.LENGTH_SHORT).show();

    }
}

