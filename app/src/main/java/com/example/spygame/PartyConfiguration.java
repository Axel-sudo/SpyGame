package com.example.spygame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PartyConfiguration extends AppCompatActivity {

    public Button buttonParty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_party_configuration);

        buttonParty=(Button)findViewById(R.id.joinGame);

        buttonParty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PartyConfiguration.this,GameBoardActivity.class);
                startActivity(intent);
            }
        });

    }
}