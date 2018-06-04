package com.example.stepanenko.makemymood;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class RelaxingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.track_list);

        ArrayList<Track> tracks = new ArrayList<>();

        tracks.add(new Track(R.drawable.music_circle, "Mystical Experiences", "The Infinity Project"));
        tracks.add(new Track(R.drawable.music_circle, "Principles of Pleasure", "Astralasia"));
        tracks.add(new Track(R.drawable.music_circle, "The Mist", "Astropilot"));
        tracks.add(new Track(R.drawable.music_circle, "Mia Nihta Mono Den Ftani", "Shulman"));
        tracks.add(new Track(R.drawable.music_circle, "Wandering Minestrel", "Koan"));
        tracks.add(new Track(R.drawable.music_circle, "Quiet Sadness", "Zymosis"));
        tracks.add(new Track(R.drawable.music_circle, "The Queen of All Everything", "Ott"));
        tracks.add(new Track(R.drawable.music_circle, "Heaven Underground", "Violet Vision"));
        tracks.add(new Track(R.drawable.music_circle, "Shpongle Falls", "Shpongle"));
        tracks.add(new Track(R.drawable.music_circle, "Your Friends Are Scary", "Younger Brother"));
        tracks.add(new Track(R.drawable.music_circle, "Fifth Level", "Celtic Cross"));
        tracks.add(new Track(R.drawable.music_circle, "MOS 6581", "Carbon Based Lifeforms"));
        tracks.add(new Track(R.drawable.music_circle, "The Star Wisdom of Bon", "Entheogenic"));
        tracks.add(new Track(R.drawable.music_circle, "Introduction (from Mirror’s Edge)", "Solar Fields"));
        tracks.add(new Track(R.drawable.music_circle, "Oxyd", "AES Dana"));
        tracks.add(new Track(R.drawable.music_circle, "Sculptures of Starlight", "Ephemeral Mists"));
        tracks.add(new Track(R.drawable.music_circle, "Somatic Serenade", "Bluetech"));
        tracks.add(new Track(R.drawable.music_circle, "Reincarnation", "Easily Embarrassed"));
        tracks.add(new Track(R.drawable.music_circle, "Mandala", "Chrónos"));
        tracks.add(new Track(R.drawable.music_circle, "Time in Suspense", "Kick Bong"));
        tracks.add(new Track(R.drawable.music_circle, "Dissolving Time", "H.U.V.A. Network"));
        tracks.add(new Track(R.drawable.music_circle, "Silence", "E-Mantra"));
        tracks.add(new Track(R.drawable.music_circle, "Tierra Azul", "Vibrasphere"));
        tracks.add(new Track(R.drawable.music_circle, "Something Something", "SYNC24"));

        TrackAdapter itemsAdapter = new TrackAdapter(this, tracks);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
