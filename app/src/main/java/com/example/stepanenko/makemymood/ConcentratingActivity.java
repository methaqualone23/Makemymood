package com.example.stepanenko.makemymood;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ConcentratingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.track_list);

        ArrayList<Track> tracks = new ArrayList<>();

        tracks.add(new Track(R.drawable.music_circle, "Spring: I. Allegro", "The Canadian Brass, Antonio Vivaldi"));
        tracks.add(new Track(R.drawable.music_circle, "3 Gymnopédies (1889): No. 2: Lent Et Triste", "Håkon Austbø"));
        tracks.add(new Track(R.drawable.music_circle, "Albatross", "Fleetwood Mac"));
        tracks.add(new Track(R.drawable.music_circle, "Audrey", "The Dave Brubeck Quartet"));
        tracks.add(new Track(R.drawable.music_circle, "Aftermath", "Tricky"));
        tracks.add(new Track(R.drawable.music_circle, "Glory Box", "Portishead"));
        tracks.add(new Track(R.drawable.music_circle, "Down Colorful Hill", "Red House Painters"));
        tracks.add(new Track(R.drawable.music_circle, "Children Of The Sun", "Dead Can Dance"));
        tracks.add(new Track(R.drawable.music_circle, "Baby", "Devendra Banhart"));
        tracks.add(new Track(R.drawable.music_circle, "I Wanna Be Adored", "The Stone Roses"));
        tracks.add(new Track(R.drawable.music_circle, "Fragile", "God Is an Astronaut"));
        tracks.add(new Track(R.drawable.music_circle, "All The Stars Were Out", "Brian Eno"));
        tracks.add(new Track(R.drawable.music_circle, "I Am an Alcoholic", "NOFX"));
        tracks.add(new Track(R.drawable.music_circle, "Akasha", "Shiva In Exile"));
        tracks.add(new Track(R.drawable.music_circle, "A Bar in Amsterdam", "Katzenjammer"));
        tracks.add(new Track(R.drawable.music_circle, "Normal", "Porcupine Tree"));
        tracks.add(new Track(R.drawable.music_circle, "Big Trouble", "John Lurie"));
        tracks.add(new Track(R.drawable.music_circle, "Hey Baby", "J.J. Cale"));
        tracks.add(new Track(R.drawable.music_circle, "Chan Chan", "Buena Vista Social Club"));
        tracks.add(new Track(R.drawable.music_circle, "Testament", "Lustmord"));
        tracks.add(new Track(R.drawable.music_circle, "Don't Stop Me Now", "Queen, Freddie Mercury"));
        tracks.add(new Track(R.drawable.music_circle, "Lust For Life", "Iggy Pop"));
        tracks.add(new Track(R.drawable.music_circle, "Love Will Tear Us Apart", "Joy Division"));
        tracks.add(new Track(R.drawable.music_circle, "Can't Stop", "Red Hot Chili Peppers"));
        tracks.add(new Track(R.drawable.music_circle, "Knockin' On Heaven's Door", "Guns N' Roses"));

        TrackAdapter itemsAdapter = new TrackAdapter(this, tracks);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
