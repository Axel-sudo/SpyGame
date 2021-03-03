package com.example.spygame;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.spygame.models.Mots;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {


    public Button button,setting;

    //Pour affichier Layout
    private TableLayout tableLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO make a toast

        Toast.makeText(this, "start", Toast.LENGTH_SHORT).show();

        Log.e("MyApp","Messages pour les logs");



        //Afficher le tableLayout
        tableLayout = findViewById(R.id.tableLayout);

        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("Mots");

        myRef.setValue("Hello, World!");

        // Retrieve Data

        // Read from the database
   myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
               /* String value = dataSnapshot.getValue(String.class); */
                for(DataSnapshot ds : dataSnapshot.getChildren()){
                    Mots mots = ds.getValue(Mots.class);
                    // Show something
                    Log.d("OurName", "Value is: " + mots.toString());
                }
                
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w("OurName", "Failed to read value.", error.toException());
            }
        });




        button =(Button)findViewById(R.id.button3);
        setting =(Button)findViewById(R.id.button5);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,PartyConfiguration.class);
                startActivity(intent);

            }
        });

        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             Intent intent2 = new Intent(MainActivity.this,Settings.class);
             startActivity(intent2);

            }
        });

        // A changer ou completer
/*
        ArrayList<String> list = new ArrayList<>();
        ArrayAdapter adapter = new ArrayAdapter(this,list); */


    }
}