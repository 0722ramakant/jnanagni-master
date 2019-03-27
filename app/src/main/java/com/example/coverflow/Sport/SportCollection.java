package com.example.coverflow.Sport;

import com.example.coverflow.R;
import com.example.coverflow.Technical.Technical;

import java.util.ArrayList;

public class SportCollection {

    public static ArrayList<Technical> getTechnical() {
        ArrayList<Technical> events = new ArrayList<>();

        Technical s = new Technical();


        s.setTitle("BADMINTON");
        s.setSummary("https://drive.google.com/file/d/0B8GBGD15aQovVU1ZUjBlcy0yb1dwbWw0eHRqVG9sRmdtMHlv/view?usp=sharing");

        s.setImage(R.drawable.badmintan);
        events.add(s);



        s = new Technical();
        s.setTitle("CHESSOMANIA");
        s.setSummary("https://drive.google.com/file/d/0B8GBGD15aQovRGJnTGpNOFVzeWctZzRROHgzekhBU0l3VGdJ/view?usp=sharing");

        s.setImage(R.drawable.chess);
        events.add(s);



        s = new Technical();
        s.setTitle("CARROM");
        s.setSummary("https://drive.google.com/file/d/0B8GBGD15aQovZFNMeThPR0ZKZ3pGbFNfcmk5OFJiVGZIT1pZ/view?usp=sharing");
        s.setImage(R.drawable.carrom);
        events.add(s);

        s = new Technical();
        s.setTitle("TABLE TENNIS");
        s.setSummary("https://drive.google.com/file/d/0B8GBGD15aQovUUo0OGx1Tlc2VWdzZFNpeWlITG15djNwNThz/view?usp=sharing");
        s.setImage(R.drawable.table);
        events.add(s);



        return events;
    }
}
