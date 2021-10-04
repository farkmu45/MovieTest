package com.example.movietest;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {

    ArrayList<Movie> movieList;

    public static class MovieViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView rating;
        TextView releaseDate, genre, director, description;

        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.txt_movie_title);
            rating = itemView.findViewById(R.id.txt_movie_rating);
            releaseDate = itemView.findViewById(R.id.txt_movie_release);
        }
    }


    public MovieAdapter(ArrayList<Movie> movieList) {
        this.movieList = movieList;
    }


    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
        final Movie movie = movieList.get(position);
        holder.title.setText(movieList.get(position).getTitle());
        holder.rating.setText(String.valueOf(movieList.get(position).getRating()));
        holder.releaseDate.setText(movieList.get(position).getReleaseDate());

        holder.itemView.setOnClickListener(view -> {
            Intent intent = new Intent(holder.itemView.getContext(), DetailMovieActivity.class);
            intent.putExtra("MOVIE", movie);
            holder.itemView.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

}
