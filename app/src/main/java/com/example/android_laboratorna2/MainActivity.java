package com.example.android_laboratorna2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private FragmentPicker fragmentPicker;
    private FragmentOutput fragmentOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentPicker = (FragmentPicker) getSupportFragmentManager()
                .findFragmentById(R.id.frameLayoutPicker);

        fragmentOutput = (FragmentOutput) getSupportFragmentManager()
                .findFragmentById(R.id.frameLayoutOutput);
    }
}