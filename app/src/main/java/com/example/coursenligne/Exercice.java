package com.example.coursenligne;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Exercice extends AppCompatActivity {

    ListView pdfListView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercice);


        pdfListView = (ListView) findViewById(R.id.myPDFList);
        String[] pdfFiles ={"Math","Informatique","Physique"};
        ArrayAdapter<String> adpter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,pdfFiles)
        {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

                View view = super.getView(position, convertView, parent);
                TextView myText = (TextView) view.findViewById(android.R.id.text1);
                return view;
            }
        };

        pdfListView.setAdapter(adpter);
        pdfListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String item = pdfListView.getItemAtPosition(position).toString();
                Intent start = new Intent(getApplicationContext(),ExercicePdf.class);
                start.putExtra("pdfFileName",item);
                startActivity(start);
            }
        });

    }
}
