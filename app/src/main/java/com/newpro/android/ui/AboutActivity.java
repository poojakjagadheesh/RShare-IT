package com.newpro.android.ui;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.newpro.android.R;
import com.newpro.android.util.Settings;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Show basic application information
 */
public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(new Settings(this).getTheme());
        setContentView(R.layout.activity_about);


    }
}
