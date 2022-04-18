package com.ksharshembie.recyclerviewhm;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContactViewHolder extends RecyclerView.ViewHolder {
    private TextView contact;

    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);
        contact = itemView.findViewById(R.id.contact);
    }

    public void bind(String data) {
        contact.setText(data);
    }
}
