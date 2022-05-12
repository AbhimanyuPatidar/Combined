package com.example.combined;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
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
        showVideoOnButtonClick();
        showCustomToastOnButtonClick();
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

    public void showVideoOnButtonClick()
    {
        Button bt_Video = findViewById(R.id.buttonForVideo);

        bt_Video.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent toVideoFromButtonPage = new Intent(getApplicationContext(), VideoFromButtonActivity.class);
                startActivity(toVideoFromButtonPage);
            }
        });
    }

    public void showCustomToastOnButtonClick()
    {
        Button bt_CustomToast = findViewById(R.id.buttonForCustomToast);

        bt_CustomToast.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                LayoutInflater layoutInflater = getLayoutInflater();
                View layout = layoutInflater.inflate(R.layout.custom_toast, findViewById(R.id.layoutForCustomToast));

                Toast toast = new Toast(getApplicationContext());
                toast.setView(layout);
                toast.show();
            }
        });
    }
}