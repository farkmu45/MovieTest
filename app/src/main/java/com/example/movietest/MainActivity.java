package com.example.movietest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recycler = findViewById(R.id.recycler);

        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Chernobyl", "Thriller", "Craig Mazin", 9.4, "In April 1986, an explosion at the Chernobyl nuclear power plant in the Union of Soviet Socialist Republics becomes one of the world's worst man-made catastrophes.", "2019-05-04", R.drawable.chernobyl));
        movies.add(new Movie("The Witcher", "Action", "Lauren Schmidt", 8.2, "Geralt of Rivia, a solitary monster hunter, struggles to find his place in a world where people often prove more wicked than beasts.", "2021-07-06", R.drawable.thewitcher));
        recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.setAdapter(new MovieAdapter(movies));
    }
}