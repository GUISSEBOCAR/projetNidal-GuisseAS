package com.example.coursenligne;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Abonnee extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.abonnee);


    }

    public  void classique(View view){
        startActivity(new Intent(this, ABonnementClassique.class));

    }


    public  void full(View view){
        startActivity(new Intent(this, ABonnementClassique.class));

    }
}
