package com.example.spygame;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.spygame.models.PseudoUsers;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class PartyConfiguration extends AppCompatActivity {


    private MediaPlayer mediaPlayer;
    private EditText editPseudo;
    private Button insertInfo;
    private Button rejoindrePartie;

    //Retrieve data
    private TextView a,b;

    DatabaseReference pseudoDbRef;


    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_party_configuration);

        this.mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.soncomposant);

        //retrieve data frome firebase

        a = (TextView)findViewById(R.id.listViewSpy);
        b = (TextView)findViewById(R.id.textViewAgent);



        //New activity connexion

      //Data firebase informations players

        editPseudo = findViewById(R.id.editPseudo);
        insertInfo = findViewById(R.id.joinGame);
        rejoindrePartie = findViewById(R.id.play);

        pseudoDbRef = FirebaseDatabase.getInstance().getReference().child("games/game1/users");

        // Insert data into firebase

        //Join à game

        rejoindrePartie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PartyConfiguration.this,GameBoardActivity.class);
                startActivity(intent);
                mediaPlayer.start();
            }
        });



        insertInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insertPlayersData();

                //retrieve data
                pseudoDbRef.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot datasnapshot) {
                        for(DataSnapshot ds : datasnapshot.getChildren()) {
                           String pseud = ds.getValue(PseudoUsers.class).toString();
                           // Log.d("Player", "Value is: " + pseud.toString());
                            Log.d("Player", pseud);
                            a.setText(pseud);

                        }

                       /* String pseudoUsers = datasnapshot.getValue(PseudoUsers.class);

                        String player1 = datasnapshot.child("pseudoName").getValue().toString();String player2= DataSnapshot.child("pseudoName").getValue().toString();
                        a.setText(player1);*/
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
            }
        });




    }

    //method create and send data 

    public void insertPlayersData() {

        String pseudo = editPseudo.getText().toString();

        PseudoUsers pseudoId = new PseudoUsers(pseudo);

         pseudoDbRef.push().setValue(pseudoId);


    }


}