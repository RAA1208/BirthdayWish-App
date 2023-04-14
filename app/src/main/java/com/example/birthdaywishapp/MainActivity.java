package com.example.birthdaywishapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.edittext);
        button = findViewById(R.id.button);

        button.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this , Birthdaywish.class);
            String name = editText.getText().toString();
            intent.putExtra("name" , name);
            startActivity(intent);
        });





    }
}