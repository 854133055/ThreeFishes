package com.android_threefishes.threefish.a3fish;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class MyAccount_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_account);
        Toolbar bar = (Toolbar) findViewById(R.id.toolbar_main_myaccount);
        bar.setTitle("");
    }
}
