package com.example.countdowntimer;

import static com.example.countdowntimer.R.id.btnyoutube;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    Button boton, btnface, btninsta, btnspot, btn1, btn2, btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        boton = findViewById(R.id.btnyoutube);
        btnface = findViewById(R.id.btnfacebook);
        btninsta = findViewById(R.id.btninstagram);
        btnspot = findViewById(R.id.btnspotify);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
    }

    public void act1(View view) {
        Intent i = new Intent(MainActivity2.this, MainActivity31.class);
        startActivity(i);
    }

    public void act2(View view) {
        Intent i = new Intent(MainActivity2.this, MainActivity32.class);
        startActivity(i);
    }

    public void act3(View view) {
        Intent i = new Intent(this, MainActivity33.class);
        startActivity(i);
    }

    public void act4(View view) {
        Intent i = new Intent(this, MainActivity34.class);
        startActivity(i);
    }

    public void abriryoutube(View v) {
        Log.d("MainActivity2", "Se hizo clic en el botón para abrir YouTube.");
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=zoq0tAKpLBI"));
        startActivity(i);
    }

    public void abrirfacebook(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/photo/?fbid=156427865879468&set=pob.100045367659854"));
        startActivity(i);
    }
    public void abririnsta(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/explore/tags/hamstergram/?hl=es"));
        startActivity(i);
    }

    public void abrirspoti(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.inscryption.com/desktop"));
        startActivity(i);
    }
}