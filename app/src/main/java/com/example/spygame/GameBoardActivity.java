package com.example.spygame;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;



public class GameBoardActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_board);
    }



    /*
    //TODO : Avoir le button des réglages dans le .xml
    @Override
    public void onClick(View view) {
        final SettingsInGame settingsInGame = new SettingsInGame(activity);
        SettingsInGame.getRetour().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                customPopup.dismiss();
            }
        });

        SettingsInGame.getLeavegame().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                // TODO : Faire revenir au menu principal
                customPopup.dismiss();
            }
        });
        settingsInGame.build();
    }*/
}