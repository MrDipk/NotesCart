package com.dip.notescart.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.dip.notescart.R;

public class SplashScreen extends AppCompatActivity {
    ImageView logo,logname;
    Handler wait;
    Runnable delay;
    Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        logo = (ImageView) findViewById(R.id.imagelogo);
        logname = (ImageView) findViewById(R.id.imageViewlogname);
        logo.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);
        //animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
        //logname.startAnimation(animation);
        animation =AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
        logo.startAnimation(animation);
        wait = new Handler();
        delay = new Runnable() {
            @Override
            public void run() {
                Intent launchNext =new Intent(SplashScreen.this, LoginActivity.class);
                launchNext.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                launchNext.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                launchNext.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(launchNext);
                finish();
            }
        };
        wait.postDelayed(delay, 2000);
    }
}