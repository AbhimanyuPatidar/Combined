package com.example.combined;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class IntentsActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intents);

        Intent fromMainActivityToIntentsActivity = getIntent();
        String message_IntentsActivity = fromMainActivityToIntentsActivity.getStringExtra(MainActivity.key_IntentsActivity);

        Toast.makeText(getApplicationContext(), message_IntentsActivity, Toast.LENGTH_SHORT).show();
    }
}