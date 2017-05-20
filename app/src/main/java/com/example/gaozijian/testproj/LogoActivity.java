package com.example.gaozijian.testproj;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class LogoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);
        ActionBar bar=getSupportActionBar();
        bar.hide();
        TimerTask task=new TimerTask() {
            @Override
            public void run() {
                LogoActivity.this.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent=new Intent(LogoActivity.this,LoginActivity.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK| Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                    }
                });

            }
        };
        Timer timer=new Timer();
        timer.schedule(task,1500);
    }
}
