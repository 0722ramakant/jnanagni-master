package com.example.coverflow.Cultural;

import com.example.coverflow.R;
import com.example.coverflow.Technical.Technical;

import java.util.ArrayList;

public class CulturalCollection {

    public static ArrayList<Technical> getTechnical() {
        ArrayList<Technical> events = new ArrayList<>();
        Technical  s = new Technical();

        s.setTitle("ABHINAYA(NAUTANKISHALA)");
        s.setSummary("");
        s.setImage(R.drawable.nautanki);
        events.add(s);







        s = new Technical();

        s.setTitle("FOOTLOOSE(DANCE)");
        s.setSummary("");
        s.setImage(R.drawable.dance);
        events.add(s);

        s = new Technical();

        s.setTitle("KRITIKA");
        s.setSummary("");
        s.setImage(R.drawable.kritika);
        events.add(s);


        s = new Technical();
        s.setTitle("LOL-STANDUP COMEDY");
        s.setSummary("");
        s.setImage(R.drawable.comedy);
        events.add(s);




        s = new Technical();
        s.setTitle("ROCK SYDROME");
        s.setSummary("");

        s.setImage(R.drawable.rock);
        events.add(s);

        s= new Technical();
        s.setTitle("SARGAM");
        s.setSummary("");
        s.setImage(R.drawable.singing);
        events.add(s);



        s = new Technical();
        s.setTitle("FASHIONISTA");
        s.setSummary("");
        s.setImage(R.drawable.fasion);
        events.add(s);


        return events;
    }
}
