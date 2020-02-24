package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private EditText first;
    private EditText second;
    private Button multi;
    private Button del;
    private Button plus;
    private Button minus;
    private TextView result;
    private double A;
    private double B;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first = (EditText)findViewById(R.id.editTextFirts);
        second = (EditText)findViewById(R.id.editTextSecond);
        result = (TextView)findViewById(R.id.getResult);

        findViewById(R.id.buttonMulti).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getAB();
                double res = A*B;
                result.setText(String.valueOf(res));
            }
        });
        findViewById(R.id.buttonDel).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getAB();
                double res = A/B;
                result.setText(String.valueOf(res));
            }
        });
        findViewById(R.id.buttonPlus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getAB();
                double res = A+B;
                result.setText(String.valueOf(res));
            }
        });
        findViewById(R.id.buttonMinus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getAB();
                double res = A-B;
                result.setText(String.valueOf(res));
            }
        });
        }
    public void getAB(){
        if(!first.getText().toString().isEmpty()||!second.getText().toString().isEmpty()){
            A = Double.parseDouble(first.getText().toString());
            B = Double.parseDouble(second.getText().toString());
        }
    }
    }

