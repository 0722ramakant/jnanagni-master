package com.example.coverflow.Cultural;

import com.example.coverflow.R;
import com.example.coverflow.Technical.Technical;

import java.util.ArrayList;

public class CulturalCollection {

    public static ArrayList<Technical> getTechnical() {
        ArrayList<Technical> events = new ArrayList<>();
        Technical  s = new Technical();

        s.setTitle("ABHINAYA(NAUTANKISHALA)");
        s.setSummary("https://drive.google.com/file/d/0B8GBGD15aQovQkJ5YXRkaTIxMkVLcHNZZVNvSDBYM281TWlF/view?usp=sharing");
        s.setImage(R.drawable.nautanki);
        events.add(s);







        s = new Technical();

        s.setTitle("FOOTLOOSE(DANCE)");
        s.setSummary("https://drive.google.com/file/d/0B8GBGD15aQovSEVNQkZZUmNHaEdGZ0t1UnpkTmN2MTJJWk1z/view?usp=sharing");
        s.setImage(R.drawable.dance);
        events.add(s);

        s = new Technical();

        s.setTitle("KRITIKA");
        s.setSummary("https://drive.google.com/file/d/0B8GBGD15aQovQkVTY0RHYzdaTl9nZ1djQzFPOEtxRU1teWdJ/view?usp=sharing");
        s.setImage(R.drawable.kritika);
        events.add(s);


        s = new Technical();
        s.setTitle("LOL-STANDUP COMEDY");
        s.setSummary("https://drive.google.com/file/d/0B8GBGD15aQovdEs0UjQ5akllV0NCbVpPeWRMQ0dyUUFXUHBj/view?usp=sharing");
        s.setImage(R.drawable.comedy);
        events.add(s);




        s = new Technical();
        s.setTitle("ROCK SYDROME");
        s.setSummary("https://drive.google.com/file/d/0B8GBGD15aQovX2V0N2FjQmtqVkZKcjF0T1BWbHluYkEwLUNB/view?usp=sharing");

        s.setImage(R.drawable.rock);
        events.add(s);

        s= new Technical();
        s.setTitle("SARGAM");
        s.setSummary("https://drive.google.com/file/d/0B8GBGD15aQoveDlXZmw5bS1fMlNMblNhU3dVOEdtTnNJbTFJ/view?usp=sharing");
        s.setImage(R.drawable.singing);
        events.add(s);



        s = new Technical();
        s.setTitle("FASHIONISTA");
        s.setSummary("https://drive.google.com/file/d/0B8GBGD15aQovd3h0NHlaZTZBRGhQNk0yVHRIbkdxUWxWQTZJ/view?usp=sharing");
        s.setImage(R.drawable.fasion);
        events.add(s);


        s = new Technical();
        s.setTitle("THIRD-VISION");
        s.setSummary("https://drive.google.com/file/d/1RQ9OQhTERbwPHl_ITC87tV_EPPS2Q1yV/view?usp=sharing");
        s.setImage(R.drawable.third);
        events.add(s);


        return events;
    }
}
