package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RadioButton;

public class B extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("藥品辨識");
        setContentView(R.layout.activity_b);

        //back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



    }
    // Disable back button
    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }

}