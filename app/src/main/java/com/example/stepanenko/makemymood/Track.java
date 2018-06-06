package com.example.stepanenko.makemymood;

public class Track {
    private int listTrackArt;
    private String listTitle;
    private String listArtist;

    public Track(int trackArt, String title, String artist) {
        listTrackArt = trackArt;
        listTitle = title;
        listArtist = artist;

    }

    public int getlistTrackArt() {
        return listTrackArt;
    }

    public String getlistTitle() {
        return listTitle;
    }

    public String getlistArtist() {
        return listArtist;
    }
}
