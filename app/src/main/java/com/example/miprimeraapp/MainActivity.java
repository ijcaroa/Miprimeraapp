package com.example.miprimeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String nameApp = "Hola que pasa?";

        TextView mTextView = findViewById(R.id.textView);

        int number1 = 10;
        int number2 = 20;

        mTextView.setText("El resultado es:" + (number1  +  number2));


    }






}