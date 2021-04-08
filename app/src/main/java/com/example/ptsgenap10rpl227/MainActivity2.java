package com.example.ptsgenap10rpl227;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getSupportActionBar().setTitle("Song List");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Song[] songs = new Song[]{
                new Song("Hall of Fame", "The Script", R.drawable.hall_of_fame),
                new Song("Believer", "Imagine Dragons", R.drawable.believer),
                new Song("Down Bellow", "Roddy Ricch", R.drawable.down_bellow),
                new Song("Rain", "Aitch ft. AJ Tracey", R.drawable.rain),
                new Song("Lucky You", "Eminem ft. Joyner Lucas", R.drawable.lucky_you),
        };

        SongAdapter songAdapter = new SongAdapter(songs, MainActivity2.this);
        recyclerView.setAdapter(songAdapter);
    }
}