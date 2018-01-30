package com.example.msi.store;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    Button storebutton = (Button) findViewById(R.id.storebutton);
    TextView favorite1  = (TextView) findViewById(R.id.favorite1);
    TextView favorite2 = (TextView) findViewById(R.id.favorite2);

    Intent intent = getIntent();
    String str = intent.getStringExtra("name1");
    favorite1.setText(str);


    storebutton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, StoreActivity.class);
            startActivity(intent);

        }
    });

    }


}
