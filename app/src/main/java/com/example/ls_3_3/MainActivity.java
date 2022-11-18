package com.example.ls_3_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private ArrayList cauntryList =new ArrayList<>();
    private RecyclerView rvCountry;
    private HeroesAdapter adapter =new HeroesAdapter(cauntryList);
    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvCountry = findViewById(R.id.heroes);
        loaData();
        rvCountry.setAdapter(adapter);

    }

    private void loaData() {
        cauntryList.add("Ant-Man");
        cauntryList.add("Aquaman.");
        cauntryList.add("The Atom.");
        cauntryList.add("Asterix.");
        cauntryList.add("he Avengers.");
        cauntryList.add("he Avengers.");
        cauntryList.add("Batman.");
        cauntryList.add("Robin");
        cauntryList.add("Supergirl");
        cauntryList.add("Thor");
        cauntryList.add("X-Men");
        cauntryList.add("Hellboy");
        cauntryList.add("Superman");
        cauntryList.add("BEKA");
    }
}