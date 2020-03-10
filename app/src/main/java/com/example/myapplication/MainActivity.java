package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Поля ввода данных
    private EditText first;
    private EditText second;
    //Кнопки
    private Button multi;
    private Button del;
    private Button plus;
    private Button minus;
    //Вывод результата
    private TextView result;
    //Переменные
    private double A;
    private double B;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //связывание элементов интерфейса
        first = (EditText)findViewById(R.id.editTextFirts);
        second = (EditText)findViewById(R.id.editTextSecond);
        result = (TextView)findViewById(R.id.getResult);

        //Слушатель на кнопки и выполнение положенных действий
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
    public void getAB() {   //функция отвечающая за получние значений А и В
        if (!first.getText().toString().isEmpty() || !second.getText().toString().isEmpty()) { // проверка на пустоту
            try {
                A = Double.parseDouble(first.getText().toString()); //Преобразование строки в число
                B = Double.parseDouble(second.getText().toString());
            } catch (NumberFormatException e){
                Toast.makeText(MainActivity.this, "Не используйте буквы", Toast.LENGTH_SHORT).show(); //соощение в случае если преобразование не возможно
            }
            }
        }
    }


