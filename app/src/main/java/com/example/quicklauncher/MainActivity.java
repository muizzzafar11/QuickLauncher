package com.example.quicklauncher;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
            FOR THE CALCULATOR
            FOR OEPNING AN APP FROM THE APP ITSELF

         */
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

        //GOOGLE DOCS
        Button Docs = findViewById(R.id.GoogleDocs);
        String DocsUrl = "https://www.google.com/docs/about/";
        buttonFunction(Docs,DocsUrl);
        //GOOGLE DRIVE
        Button drive = findViewById(R.id.GoogleDrive);
        String DriveUrl = "https://www.google.com/drive/";
        buttonFunction(drive,DriveUrl);
        //GOOGLE SLIDES
        Button slides = findViewById(R.id.GoogleSlides);
        String slidesUrl = "https://www.google.ca/slides/about/";
        buttonFunction(slides,slidesUrl);
        //KISSANIME
        Button kissanime = findViewById(R.id.Kissanime);
        String kissanimeUrl = "https://kissanime.ru/";
        buttonFunction(kissanime,kissanimeUrl);
        //KISSMANGA
        Button kissManga = findViewById(R.id.KissManga);
        String KissMangaUrl = "https://kissmanga.com/";
        buttonFunction(kissManga,KissMangaUrl);



    }



    //function for searching web adress, if an app is available to do it
    void buttonFunction(Button button, final String url){
    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
//            String URl = url;
            String buttonUrl = url;
            Uri webAdress = Uri.parse(buttonUrl);
            Intent GotoAdress = new Intent(Intent.ACTION_VIEW,webAdress);
            //asking the system, is any ap is available which can opne up this app
            //if it is not equal to null, then opne the web adress through that app
            if(GotoAdress.resolveActivity(getPackageManager()) != null)
                startActivity(GotoAdress);
        }
    });
    }
    //for opening an installed app from with in your app
    //opening maps
    public void OpenMaps(View view){
        
            Intent OpenMaps = getPackageManager().getLaunchIntentForPackage("com.google.android.apps.maps");
            startActivity(OpenMaps);
    }
}
