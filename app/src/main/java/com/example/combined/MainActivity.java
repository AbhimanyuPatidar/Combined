package com.example.combined;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

@SuppressWarnings("ALL")
public class MainActivity extends AppCompatActivity
{
    public static final String key_ImageActivity = "com.example.combined.Image_Activity";
    public static final String key_IntentsActivity = "com.example.combined.Intents_Activity";
    public static final String key_FormWidgetsActivity = "com.example.combined.FormWidgets_Activity";
    public static final String key_SharedPreferencesActivity = "com.example.combined.SharedPreferences_Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addOnClickListenerForImageButton();
        addOnClickListenerForIntentsButton();
        addOnClickListenerForFormWidgetsButton();
        addOnClickListenerForSharedPreferencesButton();
    }

    public void addOnClickListenerForImageButton()
    {
        Button bt_Image = findViewById(R.id.image);

        bt_Image.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                 Intent toImagePage = new Intent(MainActivity.this, ImageActivity.class);

                 String str_ImageActivity = "You chose Image Page!";
                 toImagePage.putExtra(key_ImageActivity, str_ImageActivity);

                 startActivity(toImagePage);
            }
        });
    }

    public void addOnClickListenerForIntentsButton()
    {
        Button bt_Intents = findViewById(R.id.intents);

        bt_Intents.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent toIntentsPage = new Intent(MainActivity.this, IntentsActivity.class);

                String str_IntentsActivity = "You chose Intents Page!";
                toIntentsPage.putExtra(key_IntentsActivity, str_IntentsActivity);

                startActivity(toIntentsPage);
            }
        });
    }

    public void addOnClickListenerForFormWidgetsButton()
    {
       Button bt_FormWidgets = findViewById(R.id.formWidgets);

       bt_FormWidgets.setOnClickListener(new View.OnClickListener()
       {
           @Override
           public void onClick(View v)
           {
                Intent toFormWidgetsPage = new Intent(MainActivity.this, FormWidgetsActivity.class);

                String str_FormWidgetsActivity = "You chose Form Widgets Page!";
                toFormWidgetsPage.putExtra(key_FormWidgetsActivity, str_FormWidgetsActivity);

                startActivity(toFormWidgetsPage);
           }
       });
    }

    public void addOnClickListenerForSharedPreferencesButton()
    {
        Button bt_SharedPreferences = findViewById(R.id.sharedPreferences);

        bt_SharedPreferences.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent toSharedPreferencesPage = new Intent(MainActivity.this, SharedPreferencesActivity.class);

                String str_SharedPreferencesActivity = "You chose Shared Preferences Page!";
                toSharedPreferencesPage.putExtra(key_SharedPreferencesActivity, str_SharedPreferencesActivity);

                startActivity(toSharedPreferencesPage);
            }
        });
    }
}