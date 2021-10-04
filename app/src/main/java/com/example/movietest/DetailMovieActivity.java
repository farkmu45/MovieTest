package com.example.movietest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMovieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_movie);

        TextView txtDescription, txtJudul, txtGenre, txtReleaseDate, txtDirector, txtRating;
        ImageView imageView;

        txtJudul = findViewById(R.id.txt_detail_movie_title);
        txtGenre = findViewById(R.id.txt_detail_genre);
        txtDirector = findViewById(R.id.txt_detail_director);
        txtRating = findViewById(R.id.txt_detail_movie_rating);
        txtDescription = findViewById(R.id.txt_detail_description);
        txtReleaseDate = findViewById(R.id.txt_detail_movie_release);
        imageView = findViewById(R.id.image);


        Movie movie = getIntent().getParcelableExtra("MOVIE");

        txtJudul.setText(movie.getTitle());
        txtGenre.setText(movie.getGenre());
        txtDirector.setText(movie.getDirector());
        txtRating.setText(String.valueOf(movie.getRating()));
        txtReleaseDate.setText(movie.getReleaseDate());
        txtDescription.setText(movie.getDescription());
        imageView.setImageDrawable(getDrawable(movie.getImage()));

    }
}