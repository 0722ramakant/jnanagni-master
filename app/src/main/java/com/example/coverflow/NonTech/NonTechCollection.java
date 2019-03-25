package com.example.coverflow.NonTech;

import com.example.coverflow.R;
import com.example.coverflow.Technical.Technical;

import java.util.ArrayList;

public class NonTechCollection {

    public static ArrayList<Technical> getTechnical() {
        ArrayList<Technical> events = new ArrayList<>();

        Technical s = new Technical();

        s.setTitle("ABHIVYAKTI");
        s.setSummary("");
        s.setImage(R.drawable.abhi);
        events.add(s);


        s = new Technical();
        s.setTitle("CRAFTS VILLA");
        s.setSummary("");
        s.setImage(R.drawable.crafts);
        events.add(s);


        s = new Technical();
        s.setTitle("FREEDOSCRAWL");
        s.setSummary("");
        s.setImage(R.drawable.frido);
        events.add(s);


        s = new Technical();
        s.setTitle("KALAKRITI");
        s.setSummary("");
        s.setImage(R.drawable.kalakriti);
        events.add(s);


        s = new Technical();
        s.setTitle("Q-COGNITO");
        s.setSummary("");
        s.setImage(R.drawable.cognito);
        events.add(s);


        s = new Technical();
        s.setTitle("CRICKET KEEDA");
        s.setSummary("");
        s.setImage(R.drawable.cricket);
        events.add(s);


        s = new Technical();
        s.setTitle("RANGOLI MAKING");
        s.setSummary("");
        s.setImage(R.drawable.rangoli);
        events.add(s);


        s = new Technical();
        s.setTitle("STARTUP FAIR");
        s.setSummary("");
        s.setImage(R.drawable.startup);
        events.add(s);

        s = new Technical();
        s.setTitle("TREASURE HUNT");
        s.setSummary("");
        s.setImage(R.drawable.treasure);
        events.add(s);





        return events;
    }
}

