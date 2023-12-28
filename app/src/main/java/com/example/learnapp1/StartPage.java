package com.example.learnapp1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class StartPage extends AppCompatActivity {

    public void LaunchHomeScreen(View V) {
        Intent homeScreen = new Intent(this, MainActivity.class);
        startActivity(homeScreen);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);


    }
}