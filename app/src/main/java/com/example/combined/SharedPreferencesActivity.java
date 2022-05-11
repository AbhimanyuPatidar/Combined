package com.example.combined;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class SharedPreferencesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferences);

        Intent fromMainActivityToSharedPreferencesActivity = getIntent();
        String message_SharedPreferences = fromMainActivityToSharedPreferencesActivity.getStringExtra(MainActivity.key_SharedPreferencesActivity);

        Toast.makeText(getApplicationContext(), message_SharedPreferences, Toast.LENGTH_SHORT).show();
    }
}