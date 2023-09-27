package com.j.StartScreenLib;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.j.game.R; //(import your own games R class here)

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}