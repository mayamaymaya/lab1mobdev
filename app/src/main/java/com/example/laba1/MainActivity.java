package com.example.laba1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        EditText input1 = findViewById(R.id.input1);

        input1.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);

        EditText input2 = findViewById(R.id.input2);

        input2.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);

        Button multiply = findViewById(R.id.multiply);

        Button divide = findViewById(R.id.divide);

        Button plus = findViewById(R.id.plus);

        Button minus = findViewById(R.id.minus);

        TextView result = findViewById(R.id.result);

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double res = Double.parseDouble(input1.getText().toString()) * Double.parseDouble(input2.getText().toString());
                result.setText(String.valueOf(res));
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Double.parseDouble(input2.getText().toString()) != 0.0) {
                    double res = Double.parseDouble(input1.getText().toString()) / Double.parseDouble(input2.getText().toString());
                    result.setText(String.valueOf(res));
                } else {
                    result.setText("А делить на ноль то - НЕЛЬЗЯ!))");
                }
            }
        });

        plus.setOnClickListener(v ->  result.setText(String.valueOf(Double.parseDouble(input1.getText().toString()) + Double.parseDouble(input2.getText().toString()))));

        minus.setOnClickListener(v -> result.setText(String.valueOf(Double.parseDouble(input1.getText().toString()) - Double.parseDouble(input2.getText().toString()))));

    }

}
