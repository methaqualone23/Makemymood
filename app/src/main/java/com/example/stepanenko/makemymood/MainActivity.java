package com.example.stepanenko.makemymood;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView energetic = findViewById(R.id.energetic);
        CardView exciting = findViewById(R.id.exciting);
        CardView concentrating = findViewById(R.id.concentrating);
        CardView relaxing = findViewById(R.id.relaxing);
        CardView melancholic = findViewById(R.id.melancholic);

        energetic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent energeticIntent = new Intent(MainActivity.this, EnergeticActivity.class);
                startActivity(energeticIntent);
            }
        });

        exciting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent excitingIntent = new Intent(MainActivity.this, ExcitingActivity.class);
                startActivity(excitingIntent);
            }
        });

        concentrating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent concentratingIntent = new Intent(MainActivity.this, ConcentratingActivity.class);
                startActivity(concentratingIntent);
            }
        });

        relaxing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent relaxingIntent = new Intent(MainActivity.this, RelaxingActivity.class);
                startActivity(relaxingIntent);
            }
        });

        energetic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent energeticIntent = new Intent(MainActivity.this, EnergeticActivity.class);
                startActivity(energeticIntent);
            }
        });

        melancholic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent melancholicIntent = new Intent(MainActivity.this, MelancholicActivity.class);
                startActivity(melancholicIntent);
            }
        });
    }
}
