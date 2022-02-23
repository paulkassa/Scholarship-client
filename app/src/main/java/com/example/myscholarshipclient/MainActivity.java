package com.example.myscholarshipclient;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView welcome,bottom;
    private static int splashTimeout=5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        welcome = findViewById(R.id.welcome);
        bottom = findViewById(R.id.bottom_text);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splashScreen = new Intent(MainActivity.this,Homepage.class);
                startActivity(splashScreen);
                finish();
            }
        },splashTimeout);
        Animation welcomeAnimation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.animation_big);
        welcome.startAnimation(welcomeAnimation);
        Animation bottomAnimation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.bottom_animation);
        bottom.startAnimation(bottomAnimation);
    }
}