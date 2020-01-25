package com.example.coursenligne;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ExercicePdf extends AppCompatActivity {

    PDFView myPDFViewer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercice_pdf);



        myPDFViewer = (PDFView) findViewById(R.id.pdfViewer);
        String getItem = getIntent().getStringExtra("pdfFileName");
        if(getItem.equals("Math"))
        {
            myPDFViewer.fromAsset("exercice2.pdf").load();
        }

        if(getItem.equals("Informatique"))
        {
            myPDFViewer.fromAsset("exercice1.pdf").load();
        }

        if(getItem.equals("Physique"))
        {
            myPDFViewer.fromAsset("exercice3.pdf").load();
        }


    }
}
