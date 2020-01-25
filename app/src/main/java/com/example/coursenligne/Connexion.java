package com.example.coursenligne;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Connexion extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.connexion);
    }

    public  void connexionparent(View view){
        startActivity(new Intent(this, ConnexionParent.class));
    }

    public  void connexionetudiant(View view){
        startActivity(new Intent(this, ConnexionEtudiant.class));
    }
}
