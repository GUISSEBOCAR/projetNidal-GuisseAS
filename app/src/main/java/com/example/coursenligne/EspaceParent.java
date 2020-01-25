package com.example.coursenligne;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class EspaceParent extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.espaceparent);



    }


    public  void espacenidal (View view) {
        startActivity(new Intent(this, NidalInfo.class));

    }

    public  void espacebocar (View view) {
        startActivity(new Intent(this, BocarInfo.class));
    }
}
