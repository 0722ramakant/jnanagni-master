package com.example.coverflow.MegaEvent;

import com.example.coverflow.R;
import com.example.coverflow.Technical.Technical;

import java.util.ArrayList;

public class MegaCollection {

    public static ArrayList<Technical> getTechnical() {
        ArrayList<Technical> events = new ArrayList<>();

        Technical s = new Technical();

        s.setTitle("PUBG");
        s.setSummary("https://drive.google.com/file/d/1ibQ3FDTUV2QuRrjBWEegvZ506vRL6-s8/view?usp=sharing");
        s.setImage(R.drawable.pubg);
        events.add(s);


        return events;
    }
}
