package com.example.stephenthomascalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void findSum(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);
        try {
            int num1 = Integer.parseInt(number1ET.getText().toString());
            int num2 = Integer.parseInt(number2ET.getText().toString());
            int sum = num1 + num2;
            numberSumTV.setText("" + sum);
        } catch (Exception e) {
            numberSumTV.setText("Please enter a valid number");
        }
    }
    public void findDifference(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);
        try {
            int num1 = Integer.parseInt(number1ET.getText().toString());
            int num2 = Integer.parseInt(number2ET.getText().toString());
            int difference = num1 + num2;
            numberSumTV.setText("" + difference);
        } catch (Exception e) {
            numberSumTV.setText("Please enter a valid number");
        }
    }
    public void findProduct(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);
        try {
            int num1 = Integer.parseInt(number1ET.getText().toString());
            int num2 = Integer.parseInt(number2ET.getText().toString());
            int product = num1 + num2;
            numberSumTV.setText("" + product);
        } catch (Exception e) {
            numberSumTV.setText("Please enter a valid number");
        }
    }
    public void findQuotient(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);
        try {
            int num1 = Integer.parseInt(number1ET.getText().toString());
            int num2 = Integer.parseInt(number2ET.getText().toString());
            int quotient = num1 + num2;
            numberSumTV.setText("" + quotient);
        } catch (Exception e) {
            numberSumTV.setText("Please enter a valid number");
        }
    }

}