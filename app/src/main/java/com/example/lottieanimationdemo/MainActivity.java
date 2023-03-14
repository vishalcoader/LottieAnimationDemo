package com.example.lottieanimationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {
private LottieAnimationView lawview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        lawview.setAnimation(R.raw.lottie);
//        lawview.playAnimation();
//        lawview.loop(true);
    }
}