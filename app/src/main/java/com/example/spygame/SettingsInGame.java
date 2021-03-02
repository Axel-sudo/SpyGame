package com.example.spygame;

import android.app.Activity;
import android.app.Dialog;

//import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SettingsInGame extends Dialog {

    private Button retour, leavegame;

    public SettingsInGame(Activity activity){
        super(activity, R.style.Theme_AppCompat_Dialog);
        activity.setContentView(R.layout.activity_settings_in_game);
        this.retour = findViewById(R.id.retour);
        this.leavegame = findViewById(R.id.leavegame);
    }

    public Button getRetour() { return retour;}

    public Button getLeavegame() { return leavegame;}

    public void build(){
        show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_in_game);
    }
}