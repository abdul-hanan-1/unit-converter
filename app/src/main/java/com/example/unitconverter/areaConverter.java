package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class areaConverter extends AppCompatActivity {

    private TextView squaremeters, hectares;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_converter);
        squaremeters = findViewById(R.id.squaremeters);
        hectares = findViewById(R.id.hectares);
        btn = findViewById(R.id.cnvrtToHectare);

        btn.setOnClickListener(v -> {

            ConvertFromSquareMeterToHectare();
        });

    }
    private void ConvertFromSquareMeterToHectare() {

        String valueEnteredInSquareMeter = squaremeters.getText().toString();

        double squaremeter = Double.parseDouble(valueEnteredInSquareMeter);


        double hectare = squaremeter * 0.0001;
        
        hectares.setText(hectare + " ha");
    }
}