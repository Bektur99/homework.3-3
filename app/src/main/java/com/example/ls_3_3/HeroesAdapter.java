package com.example.ls_3_3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HeroesAdapter extends RecyclerView.Adapter<HeroesViewHolder> {

    public HeroesAdapter(ArrayList<String> carList) {
        this.heroesrListList = carList;
    }

    private ArrayList<String> heroesrListList;
    @NonNull
    @Override
    public HeroesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HeroesViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_heroes,parent,false));
    }


    @Override
    public void onBindViewHolder(@NonNull HeroesViewHolder holder, int position) {
        holder.bind(heroesrListList.get(position));
    }


    @Override
    public int getItemCount() {
        return heroesrListList.size();
    }
}

