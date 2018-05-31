package com.example.stepanenko.makemymood;

public class Track {
    private int mTrackArt;
    private String mTitle;
    private String mArtist;

    public Track(int trackArt, String title, String artist) {
        mTrackArt = trackArt;
        mTitle = title;
        mArtist = artist;

    }

    public int getmTrackArt() {
        return mTrackArt;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmArtist() {
        return mArtist;
    }
}
