package com.ksharshembie.recyclerviewhm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn_address, btn_contacts, btn_characters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_address = findViewById(R.id.btn_address);
        btn_address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AddressRecyclerViewActivity.class);
                startActivity(intent);
            }
        });
        btn_contacts = findViewById(R.id.btn_contacts);
        btn_contacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ContactsRecyclerViewActivity.class);
                startActivity(intent);
            }
        });
        btn_characters = findViewById(R.id.btn_characters);
        btn_characters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CharacterRecyclerViewActivity.class);
                startActivity(intent);
            }
        });
    }
}