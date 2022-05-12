package com.example.combined;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VideoFromButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_from_button);

        addOnClickListenerToBackButton();
    }

    public void addOnClickListenerToBackButton()
    {
        Button bt_BackToImageActivity = findViewById(R.id.backToImageActivity);

        bt_BackToImageActivity.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent backToImagePage = new Intent(getApplicationContext(), ImageActivity.class);
                startActivity(backToImagePage);
            }
        });
    }
}