package com.example.quicklauncher;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //if the calculator button is pressed then perform the following function
        //attempts to access an activity inside the app
        Button Calculator = (Button) findViewById(R.id.Calculator);
        Calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent secondActivity = new Intent(getApplicationContext(),SecondActivity.class);
                //how to shift the screen to the other second activity
                startActivity(secondActivity);
            }
        });
        //if the google button id pressed then perform the following function
        //attempts to access an activity outside the app
        Button google = findViewById(R.id.GoogleDocs);
        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String GoogleUrl = "https://www.google.com/docs/about/";
                Uri WebAdress = Uri.parse(GoogleUrl);
                Intent gotoGoogle = new Intent(Intent.ACTION_VIEW,WebAdress);
                startActivity(gotoGoogle);
            }
        });

    }
}
