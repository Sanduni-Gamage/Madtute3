package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bttn;
    EditText edtxt1;
    EditText edtxt2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtxt1 = findViewById(R.id.gettxt1);
        edtxt2 = findViewById(R.id.gettxt2);
    }
    public void openSecond(View view){
        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        intent.putExtra("n1",edtxt1.getText().toString());
        intent.putExtra("n2",edtxt2.getText().toString());
        Toast.makeText(this, "open calculator", Toast.LENGTH_SHORT).show();

        startActivity(intent);


    }

}