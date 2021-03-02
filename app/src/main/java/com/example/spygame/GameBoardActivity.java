package com.example.spygame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class GameBoardActivity extends AppCompatActivity {

    //private DatabaseReference Database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_board);

        /*Database = FirebaseDatabase.getInstance().getReference("Mots");



        Database.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {



                for (DataSnapshot ds : dataSnapshot.getChildren()) {

                    //Log.d("MyApp", "Value is: " + value);
                }
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w("MyApp", "Failed to read value.", error.toException());
            }
        });*/
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