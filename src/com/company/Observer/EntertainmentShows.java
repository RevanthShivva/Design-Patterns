package com.company.Observer;

public class EntertainmentShows implements Event{
    private String showName;

    public EntertainmentShows(String showName) {
        this.showName = showName;
    }

    @Override
    public String getName() {
        return showName;
    }
}
