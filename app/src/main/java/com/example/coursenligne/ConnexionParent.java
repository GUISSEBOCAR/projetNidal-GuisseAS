package com.example.coursenligne;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ConnexionParent extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.connexionparent);

    }

    public  void espaceparent(View view){
        startActivity(new Intent(this, EspaceParent.class));
    }
}
