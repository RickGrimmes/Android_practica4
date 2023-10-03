package com.example.countdowntimer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    TextView countdownTimer;

    CountDownTimer timer;

    Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countdownTimer = findViewById(R.id.countdown_timer);
        start = findViewById(R.id.start);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTime();
            }
        });
    }
    private void startTime() {
        timer = new CountDownTimer(10000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                long hours = (millisUntilFinished / 1000) / 3600;
                long minutes = ((millisUntilFinished / 1000) % 3600 ) / 60;
                long seconds = (millisUntilFinished / 1000) % 60;
                String timeFormatted = String.format(Locale.getDefault(), "%02d:%02d:%02d", hours, minutes, seconds);
                countdownTimer.setText(timeFormatted);
            }
            @Override
            public void onFinish() {
                countdownTimer.setText("00:00:00");
                Toast.makeText(MainActivity.this, "Activity 2 siuuuu", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(i);
            }
        }.start();
    }
}