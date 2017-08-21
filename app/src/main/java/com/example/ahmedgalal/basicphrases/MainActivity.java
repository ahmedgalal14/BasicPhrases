package com.example.ahmedgalal.basicphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void buttonTapped (View view){
        int id = view.getId();
        String ourID = "";

        ourID = view.getResources().getResourceEntryName(id);

        int resourceID = getResources().getIdentifier(ourID, "raw", "com.example.ahmedgalal.basicphrases");
        MediaPlayer player = MediaPlayer.create(this, resourceID) ;
        player.start();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
