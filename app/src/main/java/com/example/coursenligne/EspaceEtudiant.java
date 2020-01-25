package com.example.coursenligne;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class EspaceEtudiant extends AppCompatActivity {
    private  SessionManager sessionManager;
    private TextView textView;
    private Button deconnexion;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.espaceetudiant);

        textView = (TextView) findViewById(R.id.textView) ;
        deconnexion = (Button) findViewById(R.id.deconnexion);
        sessionManager = new SessionManager(this);
        if (sessionManager.isLogged()){
            String email = sessionManager.getemail();
            String id = sessionManager.getID();
            textView.setText(email);

        }
        deconnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sessionManager.logout();
                Intent intent = new Intent(getApplicationContext(), Connexion.class);
                startActivity(intent);
                finish();
            }
        });
    }
    // accés à class vidéo
    public  void videoview (View view){
        startActivity(new Intent(this, Video.class));
    }

    public  void pdfview (View view){
        startActivity(new Intent(this, Pdf.class));
    }

    public  void qcmview (View view){
        startActivity(new Intent(this, Qcm.class));
    }

    public  void exerciceview (View view){
        startActivity(new Intent(this, Exercice.class));
    }

    public  void poserquestion (View view){
        startActivity(new Intent(this, PoserQuestion.class));
    }
}
