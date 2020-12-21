package com.example.miprimeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText1 = findViewById(R.id.editTextNumber);
        EditText editText2 = findViewById(R.id.editTextNumber2);
        TextView mTextView = findViewById(R.id.textView);
        Button button = findViewById(R.id.button);
        Button button1 = findViewById(R.id.button2);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = editText1.getText().toString();
                String num2 = editText2.getText().toString();
                int result = Integer.parseInt(num1) + Integer.parseInt(num2);
                int result2 = Integer.parseInt(num1) * Integer.parseInt(num2);
                mTextView.setText("El Resultado es: " + result);}


            });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = editText1.getText().toString();
                String num2 = editText2.getText().toString();
                int result = Integer.parseInt(num1) * Integer.parseInt(num2);
                mTextView.setText("El Resultado es: " + result);}
            });
        }
        }












