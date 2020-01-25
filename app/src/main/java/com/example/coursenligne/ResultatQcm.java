package com.example.coursenligne;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultatQcm extends AppCompatActivity {
    final String VILLE = "ville";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultat_qcm);

        //On recupere la valeur de la ville qu'on a choisie
        //pour cela il faut passer par l'objet Intent qui a servi a lancer cette activité
        Intent intent = getIntent();
        String villeChoisie = intent.getStringExtra(VILLE);

        //On va afficher du texte en fonction de la ville choisie
        String resultat = "Mauvaise réponse !";
        if(villeChoisie.toLowerCase().equals("paris")){
            resultat = "Bonne réponse !";
        }

        //On récupère la vue dans laquelle on va écrire la réponse
        //dans le fichier activity_resultat.xml elle a l'id textResultatQuestion
        TextView vueResultat = (TextView) findViewById(R.id.textResultatQuestion);

        //on écrit le résultat dans le textView de l'affichage de la réponse
        if(vueResultat != null){
            vueResultat.setText(resultat);
        }
    }

}




