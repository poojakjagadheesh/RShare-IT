package com.newpro.android.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.newpro.android.R;
import com.newpro.android.util.Settings;

public class InstructionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(new Settings(this).getTheme());
        setContentView(R.layout.activity_instructions);

    }
}
