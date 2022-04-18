package com.ksharshembie.recyclerviewhm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class CharacterRecyclerViewActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<String> characters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_recycler_view);
        recyclerView = findViewById(R.id.recycler_characters);
        loadData();
        CharacterAdapter adapter = new CharacterAdapter(characters);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        characters = new ArrayList<>();
        int counter = 20;
        for (int i = 0; i < counter; i++) {
            characters.add("Character " + i);
        }
    }
}