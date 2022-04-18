package com.ksharshembie.recyclerviewhm;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AddressViewHolder extends RecyclerView.ViewHolder {
    private TextView address;

    public AddressViewHolder(@NonNull View itemView) {
        super(itemView);
        address = itemView.findViewById(R.id.address);
    }

    public void bind(String valueAddress){
        address.setText(valueAddress);
    }
}
