package com.ripalay.playlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.container_1, new albom_back()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.container_2, new MusicList()).commit();
    }
}