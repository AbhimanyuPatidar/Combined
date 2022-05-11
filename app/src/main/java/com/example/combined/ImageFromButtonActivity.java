package com.example.combined;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class ImageFromButtonActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_from_button);

        //Intent fromImageActivityToImageFromButtonActivity = getIntent();

        addImageToImageView();
    }

    public void addImageToImageView()
    {

    }
}