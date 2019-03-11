package com.example.quicklauncher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button Adder = findViewById(R.id.Adder);
        try {
            Adder.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    EditText Number1 = findViewById(R.id.Number1);
                    EditText Number2 = findViewById(R.id.Number2);
                    TextView Answer = findViewById(R.id.Answer);
                    int number1 = Integer.parseInt(Number1.getText().toString());
                    int number2 = Integer.parseInt(Number2.getText().toString());
                    int sum = number1 + number2;
                    Answer.setText(sum + "");
                }
            });
        } catch (Exception e) {

        }
    }
}
