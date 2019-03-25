package com.example.coverflow.Game;

import com.example.coverflow.R;
import com.example.coverflow.Technical.Technical;

import java.util.ArrayList;

public class GameCollection {

    public static ArrayList<Technical> getTechnical() {
        ArrayList<Technical> events = new ArrayList<>();

        Technical s = new Technical();

        s = new Technical();
        s.setTitle("COUNTER STRIKE");
        s.setSummary("");
        s.setImage(R.drawable.counter);
        events.add(s);

        s = new Technical();
        s.setTitle("DART");
        s.setSummary("");
        s.setImage(R.drawable.counter);
        events.add(s);

        s = new Technical();
        s.setTitle("NFS");
        s.setSummary("");
        s.setImage(R.drawable.nfs);
        events.add(s);

        s = new Technical();
        s.setTitle("PUBG");
        s.setSummary("");
        s.setImage(R.drawable.pubg);
        events.add(s);




        return events;
    }
}
