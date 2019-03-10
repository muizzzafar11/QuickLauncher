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
        Button Docs = findViewById(R.id.GoogleDocs);
        Docs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String DocsUrl = "https://www.google.com/docs/about/";
                Uri WebAdress = Uri.parse(DocsUrl);
                Intent gotoGoogle = new Intent(Intent.ACTION_VIEW,WebAdress);
                startActivity(gotoGoogle);
            }
        });

        Button Drive = findViewById(R.id.GoogleDrive);
        Drive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String DriveUrl = "https://www.google.com/drive/";
                Uri WebAdress = Uri.parse(DriveUrl);
                Intent gotoGoogle = new Intent(Intent.ACTION_VIEW,WebAdress);
                //if there is an app which can open this activity (web adress), then allow that app to open this activity
                //in our case it is google chrome
                if(gotoGoogle.resolveActivity(getPackageManager()) != null)
                startActivity(gotoGoogle);
            }

        });

    }
}
