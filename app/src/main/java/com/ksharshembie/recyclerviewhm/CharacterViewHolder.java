package com.ksharshembie.recyclerviewhm;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CharacterViewHolder extends RecyclerView.ViewHolder {
    private TextView data;

    public CharacterViewHolder(@NonNull View itemView) {
        super(itemView);
        data = itemView.findViewById(R.id.character);
    }

    public void bind(String value) {
        data.setText(value);
    }
}
