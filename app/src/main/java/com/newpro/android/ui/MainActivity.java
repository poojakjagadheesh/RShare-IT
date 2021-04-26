package com.newpro.android.ui;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.newpro.android.R;
import com.newpro.android.ui.transfer.TransferActivity;

public class MainActivity extends Activity {
    private static int TIME_OUT = 5000; //Time to launch the another activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maincontents);



        final View myLayout = findViewById(R.id.startscreen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this, TransferActivity.class);
                startActivity(i);
                finish();
            }
        }, TIME_OUT);
    }
}