package com.example.combined;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class ImageActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        Intent fromMainActivityToImageActivity = getIntent();
        String message_ImageActivity = fromMainActivityToImageActivity.getStringExtra(MainActivity.key_ImageActivity);

        Toast.makeText(getApplicationContext(), message_ImageActivity, Toast.LENGTH_SHORT).show();

        showImageOnButtonClick();
    }

    public void showImageOnButtonClick()
    {
        Button bt_ImageView = findViewById(R.id.buttonForImageView);

        bt_ImageView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent toImageFromButtonPage = new Intent(getApplicationContext(), ImageFromButtonActivity.class);
                startActivity(toImageFromButtonPage);
            }
        });
    }
}