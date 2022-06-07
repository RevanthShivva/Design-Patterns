package com.company.Observer;

public class Movies implements Event{
    private String movieName;

    public Movies(String movieName) {
        this.movieName = movieName;
    }

    @Override
    public String getName() {
        return movieName ;
    }
}
