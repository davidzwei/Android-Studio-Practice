package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class D extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("情感問候");
        setContentView(R.layout.activity_d);

        //back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button btn_to_A = (Button) findViewById(R.id.btn_to_A);

        btn_to_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(D.this, MainActivity.class);
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