package com.example.coverflow.NonTech;

import com.example.coverflow.R;
import com.example.coverflow.Technical.Technical;

import java.util.ArrayList;

public class NonTechCollection {

    public static ArrayList<Technical> getTechnical() {
        ArrayList<Technical> events = new ArrayList<>();

        Technical s = new Technical();

        s.setTitle("ABHIVYAKTI");
        s.setSummary("https://drive.google.com/file/d/0B8GBGD15aQovV0JfZUlKalVlRTczQ3UySzdkbmVha05rVm1v/view?usp=sharing");
        s.setImage(R.drawable.abhi);
        events.add(s);


        s = new Technical();
        s.setTitle("CRAFTS VILLA");
        s.setSummary("");
        s.setImage(R.drawable.crafts);
        events.add(s);


        s = new Technical();
        s.setTitle("FREEDOSCRAWL");
        s.setSummary("https://drive.google.com/file/d/0B8GBGD15aQova3d1cm02QWE0VEJaMVlTd3ZPRGhmNk16NXFV/view?usp=sharing");
        s.setImage(R.drawable.frido);
        events.add(s);


        s = new Technical();
        s.setTitle("KALAKRITI");
        s.setSummary("https://drive.google.com/file/d/0B8GBGD15aQovWlFyN05sNkhabXNrWGs4RDZqQ1BuVGhQbEZj/view?usp=sharing");
        s.setImage(R.drawable.kalakriti);
        events.add(s);


        s = new Technical();
        s.setTitle("Q-COGNITO");
        s.setSummary("https://drive.google.com/file/d/0B8GBGD15aQovdHROaDRiSEVuNWlsZWpQbncycklieHNrU05z/view?usp=sharing");
        s.setImage(R.drawable.cognito);
        events.add(s);


        s = new Technical();
        s.setTitle("CRICKET KEEDA");
        s.setSummary("https://drive.google.com/file/d/0B8GBGD15aQovYUMwWjlFTDlIOC1sWGhibG5JUE5BWDZSbzVz/view?usp=sharing");
        s.setImage(R.drawable.cricket);
        events.add(s);


        s = new Technical();
        s.setTitle("RANGOLI MAKING");
        s.setSummary("https://drive.google.com/file/d/0B8GBGD15aQovalF0cmpqNzFReThMT0FTZU1OVVZ0eWJsNWlR/view?usp=sharing");
        s.setImage(R.drawable.rangoli);
        events.add(s);


        s = new Technical();
        s.setTitle("STARTUP FAIR");
        s.setSummary("https://drive.google.com/file/d/0B8GBGD15aQovLWt0ajA1a1RiYnVEVFNCTWNTNWdzeVhrSzZF/view?usp=sharing");
        s.setImage(R.drawable.startup);
        events.add(s);

        s = new Technical();
        s.setTitle("TREASURE HUNT");
        s.setSummary("https://drive.google.com/file/d/0B8GBGD15aQovNXl2ZG9ENHdFZVAzb3dQVzFDMlIwT290MUR3/view?usp=sharing");
        s.setImage(R.drawable.treasure);
        events.add(s);





        return events;
    }
}

