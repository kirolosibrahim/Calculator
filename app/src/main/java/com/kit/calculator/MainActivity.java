package com.kit.calculator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      final   EditText et_num1 = findViewById(R.id.et_num1);
      final   EditText et_num2 = findViewById(R.id.et_num2);
      final   TextView tv_result = findViewById(R.id.tv_result);

        Button btn_addition = findViewById(R.id.btn_addition);
        Button btn_division = findViewById(R.id.btn_division);
        Button btn_multiplication = findViewById(R.id.btn_multiplication);
        Button btn_subtraction = findViewById(R.id.btn_subtraction);



       btn_addition.setOnClickListener(v -> {
           int n1 = Integer.parseInt(et_num1.getText().toString());
           int n2 = Integer.parseInt(et_num2.getText().toString());
           int result = n1+n2;
           Toast.makeText(MainActivity.this, ""+result, Toast.LENGTH_SHORT).show();

       });

       btn_subtraction.setOnClickListener(v -> {
           int n1 = Integer.parseInt(et_num1.getText().toString());
           int n2 = Integer.parseInt(et_num2.getText().toString());
           int result = n1-n2;
           Toast.makeText(MainActivity.this, ""+result, Toast.LENGTH_SHORT).show();
       });

       btn_multiplication.setOnClickListener(v -> {
           int n1 = Integer.parseInt(et_num1.getText().toString());
           int n2 = Integer.parseInt(et_num2.getText().toString());
           int result = n1*n2;
           Toast.makeText(MainActivity.this, ""+result, Toast.LENGTH_SHORT).show();
       });


       btn_division.setOnClickListener(v -> {
           int n1 = Integer.parseInt(et_num1.getText().toString());
           int n2 = Integer.parseInt(et_num2.getText().toString());

           int result = n1/n2;
           Toast.makeText(MainActivity.this, "Your Result is : "+result, Toast.LENGTH_SHORT).show();
       });
    }













}