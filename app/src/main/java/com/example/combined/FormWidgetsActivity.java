package com.example.combined;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class FormWidgetsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_widgets);

        Intent fromMainActivityToFormWidgetsActivity = getIntent();
        String message_FormWidgetsActivity = fromMainActivityToFormWidgetsActivity.getStringExtra(MainActivity.key_FormWidgetsActivity);

        Toast.makeText(getApplicationContext(), message_FormWidgetsActivity, Toast.LENGTH_SHORT).show();
    }
}