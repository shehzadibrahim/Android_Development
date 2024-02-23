package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    EditText FirstValue , SecondValue;
    Button add,subtract,multiply;
    TextView Answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FirstValue = findViewById(R.id.FirstValue);
        SecondValue = findViewById(R.id.SecondValue);
        Answer = findViewById(R.id.Answer);
        add = findViewById(R.id.Add);
        subtract = findViewById(R.id.Subtract);
        multiply = findViewById(R.id.Multiply);



        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue,secondValue, ans;

                firstValue = Integer.parseInt(FirstValue.getText().toString());
                secondValue = Integer.parseInt(SecondValue.getText().toString());

                ans = firstValue + secondValue;

                Answer.setText("Ans is " + ans);

            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue,secondValue, ans;

                firstValue = Integer.parseInt(FirstValue.getText().toString());
                secondValue = Integer.parseInt(SecondValue.getText().toString());

                ans = firstValue - secondValue;

                Answer.setText("Ans is " + ans);

            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue,secondValue, ans;

                firstValue = Integer.parseInt(FirstValue.getText().toString());
                secondValue = Integer.parseInt(SecondValue.getText().toString());

                ans = firstValue * secondValue;

                Answer.setText("Ans is " + ans);

            }
        });







    }
}