package com.example.stepanenko.makemymood;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class EnergeticActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.track_list);

        ArrayList<Track> tracks = new ArrayList<>();

        tracks.add(new Track(R.drawable.music_circle, "Solo", "Clean Bandit"));
        tracks.add(new Track(R.drawable.music_circle, "Jackie Chan", "Tiësto, Dzeko, Preme, Post Malone"));
        tracks.add(new Track(R.drawable.music_circle, "Go Deep", "Gorgon City, Kamille, Ghosted"));
        tracks.add(new Track(R.drawable.music_circle, "Pretender", "Steve Aoki feat. Lil Yachty & AJR"));
        tracks.add(new Track(R.drawable.music_circle, "Best Thing", "DJ Katch, Joe Killington"));
        tracks.add(new Track(R.drawable.music_circle, "The Owl Song (Javanese Fashion)", "KING SAM"));
        tracks.add(new Track(R.drawable.music_circle, "Kids in Love", "Don Diablo, Kygo, The Night Game"));
        tracks.add(new Track(R.drawable.music_circle, "Spaceship", "Galantis"));
        tracks.add(new Track(R.drawable.music_circle, "Worry","Felix Cartal feat. Victoria Zaro"));
        tracks.add(new Track(R.drawable.music_circle, "Melody", "James Blunt, Lost Frequencies"));
        tracks.add(new Track(R.drawable.music_circle, "Make Your Own Kind of Music", "Paloma Faith"));
        tracks.add(new Track(R.drawable.music_circle, "Neutron Dance", "Krystal Klear"));
        tracks.add(new Track(R.drawable.music_circle, "Couldn't Be Better", "Arty"));
        tracks.add(new Track(R.drawable.music_circle, "Naughty Girls", "Sergey Skill"));
        tracks.add(new Track(R.drawable.music_circle, "Waste Your Time", "Lost Boy, Signal Goes Silent"));
        tracks.add(new Track(R.drawable.music_circle, "Neon Sky", "Feenixpawl, Mikayla"));
        tracks.add(new Track(R.drawable.music_circle, "Front of Us", "Pontifexx, Altermauz, Saullo"));
        tracks.add(new Track(R.drawable.music_circle, "Feelin' You", "Baer, Jack Trades, Ravell"));
        tracks.add(new Track(R.drawable.music_circle, "My Story", "Smash"));
        tracks.add(new Track(R.drawable.music_circle, "Atheist", "Disciples"));
        tracks.add(new Track(R.drawable.music_circle, "Just Friends", "Hayden James, Boy Matthews"));
        tracks.add(new Track(R.drawable.music_circle, "Somebody", "The Chainsmokers & Drew Love"));
        tracks.add(new Track(R.drawable.music_circle, "Alone", "Halsey, Stefflon Don, Josh Carter, Ricky Reed"));
        tracks.add(new Track(R.drawable.music_circle, "Highway", "Nora Van Elken"));
        tracks.add(new Track(R.drawable.music_circle, "Everybody", "Bingo Players, Goshfather"));

        TrackAdapter itemsAdapter = new TrackAdapter(this, tracks);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
