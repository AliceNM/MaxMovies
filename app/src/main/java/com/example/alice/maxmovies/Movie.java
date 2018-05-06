package com.example.alice.maxmovies;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by alice on 5/6/18.
 */



public class Movie implements Parcelable {
    public String id;
    private double rating;
    private String title;
    private String overview;
    private String release_date;
    private int vote_count;
    private double vote_average;
    private String poster_path;
    private String backdrop_path;
    private String popularity;

    private Movie(Parcel in) {
        id = in.readString();
        title = in.readString();
        rating = in.readDouble();
        overview = in.readString();
        poster_path = in.readString();
        release_date = in.readString();
        popularity = in.readString();
        backdrop_path =in.readString();
    }

    public Movie(String id, String title, double rating, String overview, String poster_path, String release_date, String popularity) {
        this.id = id;
        this.title = title;
        this.rating = rating;
        this.overview = overview;
        this.poster_path = poster_path;
        this.release_date = release_date;
        this.popularity = popularity;
        this.backdrop_path = backdrop_path;

    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(id);
        dest.writeString(title);
        dest.writeDouble(rating);
        dest.writeString(overview);
        dest.writeString(poster_path);
        dest.writeString(release_date);
        dest.writeString(popularity);
        dest.writeString(backdrop_path);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Movie> CREATOR = new Parcelable.Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };

    public String getTitle(){
        return title;
    }
    public String getOverview(){
        return  overview;
    }
    public String getRelease_date(){
        return  release_date;
    }
    public int getVote_count(){
        return vote_count;
    }
    public double getVote_average(){
        return vote_average;
    }
    public String getPoster_path(){
        return poster_path;
    }
    public String getBackdrop_path(){
        return backdrop_path;
    }
    public String getPopularity(){
        return popularity;
    }
}
