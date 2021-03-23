package com.example.spygame;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.spygame.models.Commentaire;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class GameBoardActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_board);
        // Write a message to the database


        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("Games/Game1/Mots");
        Log.e("Spy","Gameboardactivity");


        // Read from the database
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
             for(DataSnapshot ds : dataSnapshot.getChildren()) {
                 Commentaire com = ds.getValue(Commentaire.class);
                 Log.d("Spygame", "Value is: " + com.toString());
             }

            }

            @Override
            public void onCancelled(DatabaseError error) {
                Log.w("Spygame", "Failed to read value.", error.toException());
            }
        });







        /*
        // TODO : Compléter ce qui est en commentaire en dessous
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
}