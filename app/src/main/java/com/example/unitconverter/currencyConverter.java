package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class currencyConverter extends AppCompatActivity {
    private TextView dollars, rupees;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_converter);
        dollars = findViewById(R.id.dollars);
        rupees = findViewById(R.id.rupees);
        btn = findViewById(R.id.cnvrtToRupee);

        btn.setOnClickListener(v -> {

            ConvertFromUSDToRS();
        });

    }
    private void ConvertFromUSDToRS() {

        String valueEnteredInUSD = dollars.getText().toString();

        double dollar = Double.parseDouble(valueEnteredInUSD);


        double rupee = dollar * 174;
        //Displaying Result
        rupees.setText(rupee + " RS");
    }
}