package com.example.spygame;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import com.example.spygame.models.Mots;
import com.example.spygame.models.Commentaire;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;



public class GameBoardActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_board);

        /*
        //mis en commentaire pour éviter les bugs

        Button button1 = findViewById(R.id.imageButton1);
        button1.setText("t");
        Button button2 = findViewById(R.id.imageButton2);
        ArrayList<Button> listButton = null;

        for(int i = 0; i < 24; i++) {
            String idButton = "imageButton" + i+1;
            int resID = getResources().getIdentifier(idButton, "id", getPackageName());
            listButton.add(i+1, (Button)findViewById(resID));
        }


        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("game/game1/mots");

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for(DataSnapshot ds : dataSnapshot.getChildren()) {
                    Mots mot = ds.getValue(Mots.class);
                    button2.setText(mot.getMot());
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Log.w("Spygame", "Failed to read value.", error.toException());
            }
        });


//button.setText("t" + i);

        String idButton = "imageButton" + 1;
        int resID = getResources().getIdentifier(idButton, "id", getPackageName());
        Button button = (Button)findViewById(resID);
        //button.setText(ref.getKey());


         */
    }

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
        // pop-up
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