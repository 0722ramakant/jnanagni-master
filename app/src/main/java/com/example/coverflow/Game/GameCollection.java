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
        s.setSummary("COUNTER STRIKE");
        s.setTask("");
        s.setJudcriteria("");
        s.setCoordinators("");
        s.setImage(R.drawable.counter);
        events.add(s);

        s = new Technical();
        s.setTitle("DART");
        s.setSummary("DART");
        s.setTask("Task:- will be delivered to you on the time of event\n");
        s.setJudcriteria(
                "This event is not included in the fees , you have to take a coupan first before your participation.\n" +
                "\n" );
        s.setCoordinators("Rakshit pundir-" + "7060225700");
        s.setImage(R.drawable.counter);
        events.add(s);

        s = new Technical();
        s.setTitle("NFS");
        s.setSummary("The game version will be the Need for Speed Most Wanted 2005.\n"  );
        s.setTask("-For qualifying round all participants have to play a circuit race with 2 laps.\n" +

                           "- The qualifying round race will be same for all participants & the time will be noted of the total race time of each participants.\n" +

                "- The first 12 participants will be advanced in next level..\n" +
                "- Then they will be playing in the groups of 4 participants in each group in a Sprint race"

                                );
        s.setJudcriteria("- The winner of all there groups will be advanced in the final.\n " +

                "- The final race will also be a Sprint race there the winner & runner-up will be decide .\n"+"- Use of cheat codes could lead to disqualification");
        s.setCoordinators("Prince prabhakar -8210124838");
        s.setImage(R.drawable.nfs);
        events.add(s);

        s = new Technical();
        s.setTitle("PUBG");
        s.setSummary("PUBG");
        s.setTask("");
        s.setJudcriteria("");
        s.setCoordinators("");
        s.setImage(R.drawable.pubg);
        events.add(s);




        return events;
    }
}
