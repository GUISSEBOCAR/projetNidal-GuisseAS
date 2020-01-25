package com.example.coursenligne;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Parent extends AppCompatActivity {

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.parent);
        }
    public  void ajouteretudiant (View view){
        startActivity(new Intent(this, AjouterEtudiant.class));
    }
    }

