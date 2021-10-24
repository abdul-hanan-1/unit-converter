package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class temperatureConverter extends AppCompatActivity {

    private TextView kelvins, celsiuss;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_converter);
        kelvins = findViewById(R.id.kelvins);
        celsiuss = findViewById(R.id.celsiuss);
        btn = findViewById(R.id.cnvrtToCelsius);

        btn.setOnClickListener(v -> {

            ConvertFromKelvinToCelsius();
        });

    }
    private void ConvertFromKelvinToCelsius() {

        String valueEnteredInKelvin = kelvins.getText().toString();

        double kelvin = Double.parseDouble(valueEnteredInKelvin);


        double celsius = kelvin - 273.15;

        kelvins.setText(celsius + " degree Celsius");
    }
}