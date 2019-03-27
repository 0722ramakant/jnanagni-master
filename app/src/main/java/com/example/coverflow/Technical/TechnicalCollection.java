package com.example.coverflow.Technical;


import com.example.coverflow.R;

import java.util.ArrayList;

public class TechnicalCollection {

    public static ArrayList<Technical> getTechnical() {
        ArrayList<Technical> events = new ArrayList<>();

        Technical s = new Technical();

        s.setTitle("APPDIE");
        s.setSummary("https://drive.google.com/file/d/0B8GBGD15aQovZENUZG9qMGJJUHBtUTVzRjNEUFpiQlRneGVF/view?usp=sharing");

        s.setImage(R.drawable.app);
        events.add(s);


        s = new Technical();
        s.setTitle("BACK TO PAST");
        s.setSummary("BACK TO PAST");

        s.setImage(R.drawable.back);
        events.add(s);





        s = new Technical();
        s.setTitle("CIPHER");
        s.setSummary("https://drive.google.com/file/d/1x9tCwvfI1pBlahYtENQBrSCmIOy9fmiT/view?usp=sharing");

        s.setImage(R.drawable.decipher);
        events.add(s);


        s = new Technical();
        s.setTitle("ELECTRICAL QUIZ");
        s.setSummary("ELECTRICAL QUIZ");

        s.setImage(R.drawable.electrial);
        events.add(s);






        s = new Technical();
        s.setTitle("EXGESIS");
        s.setSummary("https://drive.google.com/file/d/0B8GBGD15aQovd0tIY0xfNHRya2JpYV9QN0p1a0JHNzBUTHI0/view?usp=sharing");
        s.setImage(R.drawable.circuit);
        events.add(s);

        s = new Technical();
        s.setTitle("HYDRORISER");
        s.setSummary("https://drive.google.com/file/d/0B8GBGD15aQovN2ZaaHZoV2xiMXlkaWREMmZxWHNoQnNiVTNZ/view?usp=sharing");
        s.setImage(R.drawable.decipher);
        events.add(s);


        s = new Technical();
        s.setTitle("LINE FOLLOWER");
        s.setSummary("LINE FOLLOWER");

        s.setImage(R.drawable.line);
        events.add(s);


        s = new Technical();
        s.setTitle("NOPC");

        s.setSummary("https://drive.google.com/file/d/0B8GBGD15aQovbmFHTUhlWjZLeWUtOTVvTTh6YktKZmRmSFFn/view?usp=sharing" );

        s.setImage(R.drawable.n1);
        events.add(s);


        s = new Technical();
        s.setTitle("PROJECT EXPO");
        s.setSummary("https://drive.google.com/file/d/0B8GBGD15aQovbjhWa1pOUjRXQkRVeTJURTBDNkIxdGpDMzBz/view?usp=sharing");

        s.setImage(R.drawable.electronics);
        events.add(s);


        s = new Technical();
        s.setTitle("ROBO SOCCER");
        s.setSummary("ROBO SOCCER");

        s.setImage(R.drawable.robo);
        events.add(s);


        s = new Technical();
        s.setTitle("ROBO RACE");
        s.setSummary("ROBO RACE");

        s.setImage(R.drawable.race);
        events.add(s);


        s = new Technical();
        s.setTitle("ROBO WAR");
        s.setSummary("ROBO WAR");

        s.setImage(R.drawable.war);
        events.add(s);


        s = new Technical();
        s.setTitle("TOWER MAKING");
        s.setSummary("TOWER MAKING");

        s.setImage(R.drawable.tower);
        events.add(s);


        s = new Technical();
        s.setTitle("WEBER");
        s.setSummary("https://drive.google.com/file/d/0B8GBGD15aQovdk0xamhXZUJVR2drUnlKVDVxYVJweWZaV01z/view?usp=sharing");
        s.setImage(R.drawable.web);
        events.add(s);


        s = new Technical();
        s.setTitle("TINKERER");
        s.setSummary("https://drive.google.com/file/d/0B8GBGD15aQovOHBsckowWDFCbGh1S3hlaG9jSFdPa0pydklr/view?usp=sharing");

        s.setImage(R.drawable.tinkerer);
        events.add(s);

        return events;
    }
}
