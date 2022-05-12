package com.example.combined;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SharedPreferencesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferences);

        Intent fromMainActivityToSharedPreferencesActivity = getIntent();
        String message_SharedPreferences = fromMainActivityToSharedPreferencesActivity.getStringExtra(MainActivity.key_SharedPreferencesActivity);

        Toast.makeText(getApplicationContext(), message_SharedPreferences, Toast.LENGTH_SHORT).show();

        addOnClickListenerForSaveMessageButton();
        addOnClickListenerForBackToMainActivityButton();

        SharedPreferences sharedPreferences_B = getSharedPreferences("file_SharedPreferences_CombinedApp", MODE_PRIVATE);
        String message = sharedPreferences_B.getString("key_SharedPreferences", "You will see the message!");

        TextView tV_Message = findViewById(R.id.textViewForMessage);
        tV_Message.setText(message);
    }

    public void addOnClickListenerForSaveMessageButton()
    {
        Button bt_SaveMessage = findViewById(R.id.buttonToSaveMessage);
        
        bt_SaveMessage.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                SharedPreferences sharedPreferences_A = getSharedPreferences("file_SharedPreferences_CombinedApp", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences_A.edit();

                EditText editText_Message = findViewById(R.id.editTextForMessage);
                String str = editText_Message.getText().toString();

                editor.putString("key_SharedPreferences", str);
                editor.apply();

                Toast.makeText(getApplicationContext(), "Message Saved", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void addOnClickListenerForBackToMainActivityButton()
    {
        Button bt_BackToMainPage = findViewById(R.id.backToMainActivity);

        bt_BackToMainPage.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent backToMainPage = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(backToMainPage);
            }
        });
    }
}