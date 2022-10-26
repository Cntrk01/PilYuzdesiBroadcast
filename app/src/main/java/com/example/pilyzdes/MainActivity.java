package com.example.pilyzdes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    BrodcastingClass brodcastingClass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        brodcastingClass=new BrodcastingClass();
    }

    @Override
    protected void onResume() {
        super.onResume();

        IntentFilter intentFilter=new IntentFilter();
        intentFilter.addAction(Intent.);
        registerReceiver(brodcastingClass,intentFilter);
    }

    @Override
    protected void onPause() {
        super.onPause();
        unregisterReceiver(brodcastingClass);
    }
}