package com.dicoding.picodiploma.jalankuy.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.dicoding.picodiploma.jalankuy.R;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Thread splashScreenThread = new Thread() {
            @Override
            public void run() {
                super.run();
                try {
                    sleep(2500);
                } catch (InterruptedException e) {
                    Log.e(this.getClass().getSimpleName(), "showSplashScreen: " + e.getMessage());
                } finally {
                    Intent moveToHomeActivity = new Intent(SplashScreenActivity.this, HomeActivity.class);
                    startActivity(moveToHomeActivity);
                    finish();
                }
            }
        };
        splashScreenThread.start();
    }
}
