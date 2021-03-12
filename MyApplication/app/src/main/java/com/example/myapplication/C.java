package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;

public class C extends AppCompatActivity {

    private RadioButton bt1, bt2, bt3, bt4;
    private Button reset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("吃藥紀錄");
        setContentView(R.layout.activity_c);
        //back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        bt1 = findViewById(R.id.radioButton);
        bt2 = findViewById(R.id.radioButton2);
        bt3 = findViewById(R.id.radioButton3);
        bt4 = findViewById(R.id.radioButton4);

        reset = findViewById(R.id.reset);

        bt1.setChecked(Update("jump1"));
        bt2.setChecked(Update("jump2"));
        bt3.setChecked(Update("jump3"));
        bt4.setChecked(Update("jump4"));

        bt1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                saveIntoSharedPrefs("jump1",isChecked);
            }
        });

        bt2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                saveIntoSharedPrefs("jump2",isChecked);
            }
        });

        bt3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                saveIntoSharedPrefs("jump3",isChecked);
            }
        });

        bt4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                saveIntoSharedPrefs("jump4",isChecked);
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt1.setChecked(false);
                bt2.setChecked(false);
                bt3.setChecked(false);
                bt4.setChecked(false);
            }
        });

    }

    private void saveIntoSharedPrefs(String key, boolean value){
        SharedPreferences sp = getSharedPreferences("jp_tech", MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putBoolean(key, value);
        editor.apply();
    }

    private boolean Update(String key){

        SharedPreferences sp = getSharedPreferences("jp_tech", MODE_PRIVATE);
        return sp.getBoolean(key, false);

    }





    // Disable back button
    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }
}