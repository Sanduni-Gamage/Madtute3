package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    EditText edtxt1;
    EditText edtxt2;
    TextView finalans;
    int n1;
    int n2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        edtxt1 = findViewById(R.id.gettxt5);
        edtxt2 = findViewById(R.id.gettxt4);
        finalans=findViewById(R.id.finalsum);

        Intent intent = getIntent();
        String num1 = intent.getStringExtra("n1");
        String num2 = intent.getStringExtra("n2");

        edtxt1.setText(num1);
        edtxt2.setText(num2);
        n1 = Integer.parseInt(num1);
        n2 = Integer.parseInt(num2);


    }
    public void add(View view){

        finalans.setText(n1 + " + " +n2 +" = " +(n1+n2));


    }

    public void substract(View view){

        finalans.setText(n1 + " - " +n2+ " = " +(n1-n2));

    }

    public void multiply(View view){

        finalans.setText(n1 + " * " +n2+" = " +(n1*n2));

    }

    public void devide(View view){

        finalans.setText(n1 + " / " +n2+" 2 "+" = " +(n1/n2));

    }

}