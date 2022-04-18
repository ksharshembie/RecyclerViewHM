package com.ksharshembie.recyclerviewhm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class AddressRecyclerViewActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<String> addresses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address_recycler_view);
        recyclerView = findViewById(R.id.recycler_addresses);
        loadData();
        AddressAdapter adapter = new AddressAdapter(addresses);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        addresses = new ArrayList<>();
        int counter = 10;
        for (int i = 0; i < counter; i++) {
            addresses.add("Address " + i );
        }
    }
}