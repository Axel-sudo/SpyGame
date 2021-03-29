package com.example.spygame;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

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

        ///*
        //mis en commentaire pour éviter les bugs

        /*Button button1 = findViewById(R.id.imageButton1);
        button1.setText("t");
        Button button2 = findViewById(R.id.imageButton2);
        ArrayList<Button> listButton = null;*/

        Button button1 = findViewById(R.id.imageButton1);
        button1.setText("CAMPAGNE");
        Button button2 = findViewById(R.id.imageButton2);
        button2.setText("INDIEN");
        Button button3 = findViewById(R.id.imageButton3);
        button3.setText("BOMBE");
        Button button4 = findViewById(R.id.imageButton4);
        button4.setText("NOTE");
        Button button5 = findViewById(R.id.imageButton5);
        button5.setText("ESPRIT");
        Button button6 = findViewById(R.id.imageButton6);
        button6.setText("EGYPTE");
        Button button7 = findViewById(R.id.imageButton7);
        button7.setText("PRISE");
        Button button8 = findViewById(R.id.imageButton8);
        button8.setText("AMERIQUE");
        Button button9 = findViewById(R.id.imageButton9);
        button9.setText("CHAMP");
        Button button10 = findViewById(R.id.imageButton10);
        button10.setText("ATOUT");
        Button button11 = findViewById(R.id.imageButton11);
        button11.setText("ECOLE");
        Button button12 = findViewById(R.id.imageButton12);
        button12.setText("CUISINE");
        Button button13 = findViewById(R.id.imageButton13);
        button13.setText("CASINO");
        Button button14 = findViewById(R.id.imageButton14);
        button14.setText("TRESOR");
        Button button15 = findViewById(R.id.imageButton15);
        button15.setText("ARGENT");
        Button button16 = findViewById(R.id.imageButton16);
        button16.setText("MILLIONNAIRE");
        Button button17 = findViewById(R.id.imageButton17);
        button17.setText("FORT");
        Button button18 = findViewById(R.id.imageButton18);
        button18.setText("CIRQUE");
        Button button19 = findViewById(R.id.imageButton19);
        button19.setText("ROUGE");
        Button button20 = findViewById(R.id.imageButton20);
        button20.setText("BANDE");
        Button button21 = findViewById(R.id.imageButton21);
        button21.setText("FRONT");
        Button button22 = findViewById(R.id.imageButton22);
        button22.setText("RAYON");
        Button button23 = findViewById(R.id.imageButton23);
        button23.setText("BRETELLE");
        Button button24 = findViewById(R.id.imageButton24);
        button24.setText("BAR");


        /*for(int i = 0; i < 24; i++) {
            String idButton = "imageButton" + i+1;
            int resID = getResources().getIdentifier(idButton, "id", getPackageName());
            listButton.add(i+1, (Button)findViewById(resID));
        }*/


        /*FirebaseDatabase database = FirebaseDatabase.getInstance();
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
        });*/


//button.setText("t" + i);

        String idButton = "imageButton" + 1;
        int resID = getResources().getIdentifier(idButton, "id", getPackageName());
        Button button = (Button)findViewById(resID);
        //button.setText(ref.getKey());


         //*/

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