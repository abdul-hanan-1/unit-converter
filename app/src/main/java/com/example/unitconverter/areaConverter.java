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
            //Calling ConvertFromMeterToInch
            ConvertFromSquareMeterToHectare();
        });

    }
    private void ConvertFromSquareMeterToHectare() {
        //This method will convert the values in edittext
        //From meter to length
        String valueEnteredInSquareMeter = squaremeters.getText().toString();
        //Converting String to a number
        double squaremeter = Double.parseDouble(valueEnteredInSquareMeter);

        //Converting meter to inch formula
        double hectare = squaremeter * 0.0001;
        //Displaying Result
        hectares.setText(hectare + " ha");
    }
}