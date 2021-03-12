package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("首頁");
        setContentView(R.layout.activity_main);

        Button btn_to_B = (Button) findViewById(R.id.btn_to_B);
        Button btn_to_C = (Button) findViewById(R.id.button_to_C);
        Button btn_to_D = (Button) findViewById(R.id.button_to_D);
        Button btn_to_E = (Button) findViewById(R.id.button_to_E);

        btn_to_B.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, B.class);
            startActivity(intent);
        });

        btn_to_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, C.class);
                startActivity(intent);
            }
        });

        btn_to_D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, D.class);
                startActivity(intent);
            }
        });

        btn_to_E.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, E.class);
                startActivity(intent);
            }
        });




    }

    // Disable back button
    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }

}