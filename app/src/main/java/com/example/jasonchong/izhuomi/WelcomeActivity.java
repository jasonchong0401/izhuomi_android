package com.example.jasonchong.izhuomi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by jasonchong on 4/4/15.
 */
public class WelcomeActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_welcome);

        new Thread() {
            public void run() {
                try {
                    Thread.sleep(3000);
                }catch(InterruptedException e) {
                    e.printStackTrace();
                }
                startActivity(new Intent().setClass(WelcomeActivity.this, MainActivity.class));
                WelcomeActivity.this.finish();
            }
        }.start();
    }
}
