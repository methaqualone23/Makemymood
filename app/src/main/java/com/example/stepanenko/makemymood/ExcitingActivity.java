package com.example.stepanenko.makemymood;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ExcitingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.track_list);

        ArrayList<Track> tracks = new ArrayList<>();

        tracks.add(new Track(R.drawable.music_circle, "La Mordidita", "Ricky Martin"));
        tracks.add(new Track(R.drawable.music_circle, "Despacito ft. Daddy Yankee", "Luis Fonsi"));
        tracks.add(new Track(R.drawable.music_circle, "La Copa De La Vida (Spanglish Radio Edit)", "Ricky Martin"));
        tracks.add(new Track(R.drawable.music_circle, "Cambio Dolor", "Natalia Oreiro"));
        tracks.add(new Track(R.drawable.music_circle, "Baila Morena", "Julio Iglesias"));
        tracks.add(new Track(R.drawable.music_circle, "Conga", "Gloria Estefan"));
        tracks.add(new Track(R.drawable.music_circle, "Bailando", "Enrique Iglesias, Descemer Bueno, Gente De Zona"));
        tracks.add(new Track(R.drawable.music_circle, "Ni Tú Ni Yo", "Jennifer Lopez feat. Gente De Zona"));
        tracks.add(new Track(R.drawable.music_circle, "Fotos Y Recuerdos", "Selena"));
        tracks.add(new Track(R.drawable.music_circle, "Mas Que Nada", "Sergio Mendes, The Black Eyed Peas"));
        tracks.add(new Track(R.drawable.music_circle, "La Tortura","Shakira, Alejandro Sanz"));
        tracks.add(new Track(R.drawable.music_circle, "Historia De Un Amor", "Luis Miguel"));
        tracks.add(new Track(R.drawable.music_circle, "La Isla Bonita", "Madonna"));
        tracks.add(new Track(R.drawable.music_circle, "Y Yo Sigo Aquí", "Paulina Rubio"));
        tracks.add(new Track(R.drawable.music_circle, "La Camisa Negra", "Juanes"));
        tracks.add(new Track(R.drawable.music_circle, "Sobre Mí", "Sin Bandera"));
        tracks.add(new Track(R.drawable.music_circle, "Te quiero", "Ricardo Arjona"));
        tracks.add(new Track(R.drawable.music_circle, "Humanos a Marte", "Chayanne, Paula Fernandes"));
        tracks.add(new Track(R.drawable.music_circle, "Mr. Romantic", "Don Omar, Mike Stanley"));
        tracks.add(new Track(R.drawable.music_circle, "Chocolata", "SeeYa"));
        tracks.add(new Track(R.drawable.music_circle, "Vivir Mi Vida", "Marc Anthony"));
        tracks.add(new Track(R.drawable.music_circle, "La Luna", "Johannah Labranche, Natalia Cavalheiro"));
        tracks.add(new Track(R.drawable.music_circle, "Desde Esa Noche", "Thalia feat. Maluma"));
        tracks.add(new Track(R.drawable.music_circle, "Dulces Besos", "Menudo"));
        tracks.add(new Track(R.drawable.music_circle, "Spice Up Your Life", "Spice Girls"));

        TrackAdapter itemsAdapter = new TrackAdapter(this, tracks);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);


    }
}
