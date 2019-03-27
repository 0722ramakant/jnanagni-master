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
        s.setSummary("https://drive.google.com/file/d/1POgkfKhxln2CSzR4OZ5sFQ7VHxvzC7DJ/view?usp=sharing");
        s.setImage(R.drawable.counter);
        events.add(s);

        s = new Technical();
        s.setTitle("DART");
        s.setSummary("https://drive.google.com/file/d/0B8GBGD15aQovanhyanZJUm5GcFp0eTNYa1ItR25oZTBVQThv/view?usp=sharing");
        s.setImage(R.drawable.counter);
        events.add(s);

        s = new Technical();
        s.setTitle("NFS");
        s.setSummary("https://drive.google.com/file/d/0B8GBGD15aQovRnhDQmZRcTdGa0VWV0xqYmF1VF9ZeHRCQzZv/view?usp=sharing");
        s.setImage(R.drawable.nfs);
        events.add(s);

        s = new Technical();
        s.setTitle("PUBG");
        s.setSummary("https://drive.google.com/file/d/1ibQ3FDTUV2QuRrjBWEegvZ506vRL6-s8/view?usp=sharing");
        s.setImage(R.drawable.pubg);
        events.add(s);




        return events;
    }
}
