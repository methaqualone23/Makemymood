package com.example.stepanenko.makemymood;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MelancholicActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.track_list);

        ArrayList<Track> tracks = new ArrayList<>();

        tracks.add(new Track(R.drawable.music_circle, "My Least Favorite Life", "Lera Lynn"));
        tracks.add(new Track(R.drawable.music_circle, "Góðan daginn", "Sigur Rós"));
        tracks.add(new Track(R.drawable.music_circle, "No Surprises", "Radiohead"));
        tracks.add(new Track(R.drawable.music_circle, "Without Yesterday", "No King. No Crown."));
        tracks.add(new Track(R.drawable.music_circle, "Drop", "Red House Painters"));
        tracks.add(new Track(R.drawable.music_circle, "Lies", "Low"));
        tracks.add(new Track(R.drawable.music_circle, "Telephone", "Klangstof"));
        tracks.add(new Track(R.drawable.music_circle, "Brothers on a Hotel Bed (Rolling Stone Original)", "Death Cab for Cutie"));
        tracks.add(new Track(R.drawable.music_circle, "Sprained Ankle", "Julien Baker"));
        tracks.add(new Track(R.drawable.music_circle, "Death to My Hometown", "Logh"));
        tracks.add(new Track(R.drawable.music_circle, "For Sure", "American Football"));
        tracks.add(new Track(R.drawable.music_circle, "Nangijala", "Jeniferever"));
        tracks.add(new Track(R.drawable.music_circle, "Saving Us a Riot", "Phoria"));
        tracks.add(new Track(R.drawable.music_circle, "First Rain", "Teen Daze, S. Carey"));
        tracks.add(new Track(R.drawable.music_circle, "Hold On Magnolia", "Songs: Ohia"));
        tracks.add(new Track(R.drawable.music_circle, "Let's Go Dancing", "Teitur"));
        tracks.add(new Track(R.drawable.music_circle, "Shallows", "Daughter"));
        tracks.add(new Track(R.drawable.music_circle, "Start", "MEW"));
        tracks.add(new Track(R.drawable.music_circle, "Where Happiness Lives", "Magnet"));
        tracks.add(new Track(R.drawable.music_circle, "Towards The Sun", "Alexi Murdoch"));
        tracks.add(new Track(R.drawable.music_circle, "Drive Darling", "Boy"));
        tracks.add(new Track(R.drawable.music_circle, "Lately", "Memoryhouse"));
        tracks.add(new Track(R.drawable.music_circle, "Help Me", "Maximilian Hecker"));
        tracks.add(new Track(R.drawable.music_circle, "WALLS", "Kings of Leon"));
        tracks.add(new Track(R.drawable.music_circle, "(No One Knows Me) Like the Piano", "Sampha"));

        TrackAdapter itemsAdapter = new TrackAdapter(this, tracks);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
