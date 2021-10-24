package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class lengthConverter extends AppCompatActivity {
    private TextView meters, inches;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length_converter);
        meters = findViewById(R.id.meters);
        inches = findViewById(R.id.inches);
        btn = findViewById(R.id.cnvrtToInches);

        btn.setOnClickListener(v -> {
            //Calling ConvertFromMeterToInch
            ConvertFromMeterToINCH();
        });

    }
    private void ConvertFromMeterToINCH() {
        //This method will convert the values in edittext
        //From meter to length
        String valueEnteredInMeter = meters.getText().toString();
        //Converting String to a number
        double meter = Double.parseDouble(valueEnteredInMeter);

        //Converting meter to inch formula
        double inch = meter * 39.37;
        //Displaying Result
        inches.setText(inch + " INCHES");
    }

}