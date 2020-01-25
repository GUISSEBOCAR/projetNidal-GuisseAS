package com.example.coursenligne;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Video extends AppCompatActivity {

    VideoView videoView;
    ListView listView;
    ArrayList<String>videoList;
    ArrayAdapter adapter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video);

        videoView=findViewById(R.id.videoView);
        listView=findViewById(R.id.lvideo);
        videoList= new  ArrayList<>();
        videoList.add("cours");
        videoList.add("informatique");
        videoList.add("maths");
        videoList.add("physique");

        adapter= new ArrayAdapter(this, android.R.layout.simple_list_item_1,videoList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                    videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName()+ "/" + R.raw.cours));
                    break;
                    case 1:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName()+ "/" + R.raw.informatique));
                        break;
                    case 2:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName()+ "/" + R.raw.maths));
                        break;
                    case 3:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName()+ "/" + R.raw.physique));
                        break;
                    default:
                        break;
                }
                videoView.setMediaController(new MediaController(Video.this));
                videoView.requestFocus();
                videoView.start();
            }
        });
    }


}
