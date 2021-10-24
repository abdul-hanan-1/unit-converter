package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    private Button button1,button2,button3,button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.length);
        button2 = findViewById(R.id.area);
        button3 = findViewById(R.id.currency);
        button4 = findViewById(R.id.temperature);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLengthConverter();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAreaConverter();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCurrencyConverter();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTemperatureConverter();
            }
        });
    }
    public void openLengthConverter(){
        Intent intent = new Intent(this, lengthConverter.class);
        startActivity(intent);
    }
    public void openAreaConverter(){
        Intent intent = new Intent(this, areaConverter.class);
        startActivity(intent);
    }
    public void openCurrencyConverter(){
        Intent intent = new Intent(this, currencyConverter.class);
        startActivity(intent);
    }
    public void openTemperatureConverter(){
        Intent intent = new Intent(this, temperatureConverter.class);
        startActivity(intent);
    }

}