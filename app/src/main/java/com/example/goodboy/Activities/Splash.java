package com.example.goodboy.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;

import com.example.goodboy.R;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Pair[] pairs = new Pair[1];
                ImageView imageView = findViewById(R.id.imageView);
                pairs[0] = new Pair<View, String>(imageView, "splashPerson");

                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation(Splash.this, pairs);
                    startActivity(new Intent(Splash.this, LoginActivity.class), activityOptions.toBundle());
                    finish();
                }
            }
        }, 1500);
    }
}