package com.example.coursenligne;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Inscription extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inscription);
    }

    public  void etudiant (View view){
        startActivity(new Intent(this, Etudiant.class));
    }

    public  void parent(View view){
        startActivity(new Intent(this, Parent.class));
    }

    public  void professeur(View view){
        startActivity(new Intent(this, Professeur.class));
    }


}
