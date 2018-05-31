package com.example.stepanenko.makemymood;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TrackAdapter extends ArrayAdapter<Track> {

    public TrackAdapter(Activity context, ArrayList<Track> tracks) {
        super(context, 0, tracks);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Track currentTrack = getItem(position);
        View playlistItemView = convertView;
        if (playlistItemView == null) {
            playlistItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.track_item, parent, false);
        }

        ImageView artImageView = playlistItemView.findViewById(R.id.track_art);
        artImageView.setImageResource(currentTrack.getmTrackArt());

        TextView trackTextView = playlistItemView.findViewById(R.id.track_title);
        trackTextView.setText(currentTrack.getmTitle());

        TextView artistTextView = playlistItemView.findViewById(R.id.track_artist);
        artistTextView.setText(currentTrack.getmArtist());

        return playlistItemView;
    }
}
