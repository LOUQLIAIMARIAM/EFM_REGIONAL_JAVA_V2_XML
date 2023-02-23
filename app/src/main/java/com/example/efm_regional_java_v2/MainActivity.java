package com.example.efm_regional_java_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText weightEditText;
    private EditText heightEditText;
    private Button calculateButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weightEditText = findViewById(R.id.weight_edittext);
        heightEditText = findViewById(R.id.height_edittext);
        calculateButton = findViewById(R.id.calculate_button);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double weight = Double.parseDouble(weightEditText.getText().toString());
                double height = Double.parseDouble(heightEditText.getText().toString());

                double bmi = (weight / 703) / (height * height);

                String state;

                if (bmi < 18.5) {
                    state = "Underweight";
                } else if (bmi < 25) {
                    state = "Normal";
                } else if (bmi < 40) {
                    state = "Overweight";
                } else {
                    state = "Obese";
                }

                String message = String.format("BMI: %.2f\nState: %s", bmi, state);


            }
        });
    }}


