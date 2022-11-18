package com.example.ls_3_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HeroesViewHolder extends RecyclerView.ViewHolder {

    private TextView heroes;

    public HeroesViewHolder(@NonNull View itemView) {
        super(itemView);

        heroes = itemView.findViewById(R.id.tv_Games);

    }
    void bind(String hrs){
        heroes.setText(hrs);
    }
}
