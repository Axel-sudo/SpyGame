package com.example.spygame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.ImageButton;

public class Settings extends AppCompatActivity {

    private ImageButton buttonBack;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        buttonBack =(ImageButton)findViewById(R.id.exit);

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Settings.this,MainActivity.class);
                startActivity(intent);

            }
        });

    }




}