package com.example.coverflow.Sport;

import com.example.coverflow.R;
import com.example.coverflow.Technical.Technical;

import java.util.ArrayList;

public class SportCollection {

    public static ArrayList<Technical> getTechnical() {
        ArrayList<Technical> events = new ArrayList<>();

        Technical s = new Technical();


        s.setTitle("BADMINTON");
        s.setSummary("BADMINTON");

        s.setImage(R.drawable.badmintan);
        events.add(s);



        s = new Technical();
        s.setTitle("CHESSOMANIA");
        s.setSummary("CHESSOMANIA");

        s.setImage(R.drawable.chess);
        events.add(s);



        s = new Technical();
        s.setTitle("CARROM");
        s.setSummary("");
        s.setImage(R.drawable.carrom);
        events.add(s);

        s = new Technical();
        s.setTitle("TABLE TENNIS");
        s.setSummary("");
        s.setImage(R.drawable.table);
        events.add(s);



        return events;
    }
}
