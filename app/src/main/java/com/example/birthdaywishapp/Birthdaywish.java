package com.example.birthdaywishapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Birthdaywish extends AppCompatActivity {
    TextView textView2 , textView , textView3;
    String getText;
    ImageView imageView , imageView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthdaywish);
        textView2 = findViewById(R.id.name);
        textView3 = findViewById(R.id.textView3);
        textView3.setSelected(true);
        Intent intent = getIntent();
          getText =  intent.getStringExtra("name");
          textView2.setText(getText);


    }
}