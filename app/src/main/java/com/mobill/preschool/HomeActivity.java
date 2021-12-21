package com.mobill.preschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity {

    ImageView alphabet;
    ImageView dict;
    ImageView animal;
    ImageView stories;
    ImageView songs, todo;
    MediaPlayer ply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        alphabet = findViewById(R.id.btnAlphabet);
        dict = findViewById(R.id.btnDict);
        animal = findViewById(R.id.btnAnimals);
        stories = findViewById(R.id.btnStories);
        songs = findViewById(R.id.btnSongs);
        todo = findViewById(R.id.btnTodo);

        dict.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x = new Intent(HomeActivity.this, DictionaryActivity.class);
                try {
                    ply.reset();
                    ply.prepare();
                    ply.stop();
                    ply.release();
                    ply=null;
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                startActivity(x);
            }
        });

        todo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x = new Intent(HomeActivity.this, TodoActivity.class);
                try {
                    ply.reset();
                    ply.prepare();
                    ply.stop();
                    ply.release();
                    ply=null;
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                startActivity(x);
            }
        });

        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ply = MediaPlayer.create(HomeActivity.this,R.raw.song);
                ply.start();
            }
        });
        stories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    ply.reset();
                    ply.prepare();
                    ply.stop();
                    ply.release();
                    ply=null;
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
        alphabet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x = new Intent(HomeActivity.this, AlphabetActivity.class);
                try {
                    ply.reset();
                    ply.prepare();
                    ply.stop();
                    ply.release();
                    ply=null;
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                startActivity(x);
            }
        });
        animal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x = new Intent(HomeActivity.this, AnimalActivity.class);
                try {
                    ply.reset();
                    ply.prepare();
                    ply.stop();
                    ply.release();
                    ply=null;
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                startActivity(x);
            }
        });
    }
}