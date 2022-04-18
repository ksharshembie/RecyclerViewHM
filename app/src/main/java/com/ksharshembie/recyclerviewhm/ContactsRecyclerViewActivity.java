package com.ksharshembie.recyclerviewhm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ContactsRecyclerViewActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<String> contacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts_recycler_view);
        recyclerView = findViewById(R.id.recycler_contacts);
        loadData();
        ContactsAdapter adapter = new ContactsAdapter(contacts);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        contacts = new ArrayList<>();
        int counter = 100;
        for (int i = 0; i < counter; i++) {
            contacts.add("Contact " + i);
        }
    }
}