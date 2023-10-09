package com.example.countdowntimer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

import java.util.Timer;
import java.util.TimerTask;

public class splasher1 extends AppCompatActivity {
    CountDownTimer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splasher1);

        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                Intent i = new Intent(splasher1.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        };

        Timer tiempo = new Timer();
        tiempo.schedule(tarea, 5000);
    }
}