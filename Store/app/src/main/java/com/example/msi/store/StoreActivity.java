package com.example.msi.store;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class StoreActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);
        Toast.makeText(this, "즐겨찾을 편의점을 클릭하세요.", Toast.LENGTH_SHORT).show();

        final TextView storename1 = (TextView) findViewById(R.id.storename1);
        final TextView storename2 = (TextView) findViewById(R.id.storename2);

        storename1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name1 = storename1.getText().toString();
                Intent intent = new Intent(StoreActivity.this, MainActivity.class);
                intent.putExtra("name1", name1 );
                startActivity(intent);
                finish();
            }
        });

        storename2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name2 = storename2.getText().toString();
                Intent intent2 = new Intent(StoreActivity.this, MainActivity.class);
                intent2.putExtra("name2", name2);
                startActivity(intent2);
                finish();
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "메인으로 돌아갑니다.", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "이전 화면이 종료됩니다.(Destroy)", Toast.LENGTH_SHORT).show();

    }
}
