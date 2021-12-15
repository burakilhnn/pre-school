package com.mobill.preschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity {

    ImageView alphabet;
    ImageView dict;
    ImageView animal;
    ImageView stories;
    ImageView songs, todo;

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
                startActivity(x);
            }
        });

        todo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x = new Intent(HomeActivity.this, TodoActivity.class);
                startActivity(x);
            }
        });
    }
}