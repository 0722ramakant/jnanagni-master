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
        s.setTask("In this event, rally starts with serve. Rally ends when shuttle touches the ground or gets " +
                "caught by net or when someone commits a faults. You will get " +
                "1 point if you win the rally and if you win 21 rallies you win the game.\n");
        s.setJudcriteria(" Candidates are advised not to commit a fault. It could be any of these:\n" +
                "\n" +
                "- 1. Contact fault\n" +
                "2. Over the net fault\n" +
                "3. Service fault\n" +
                "4. Receiver fault\n" +
                "5. Doubles hit ");
        s.setCoordinators("Abhishek | Mob: 6200075597\n" +
                "kuldeep");
        s.setImage(R.drawable.badmintan);
        events.add(s);



        s = new Technical();
        s.setTitle("CHESSOMANIA");
        s.setSummary("CHESSOMANIA");
        s.setTask( "*RULES*-\n" +
                "1. 5 MIN CLOCK RULE FOR EACH PLAYER. FOR SEMIFINAL AND FINALS EACH OPPONENT WILL BE PROVIDED WITH 10 AND 15 MIN RESPECTIVELY.\n" +
                "\n" +
                "2.TOUCH AND MOVE RULE SHOULD BE STRICTLY FOLLOWED \n" +
                "\n" +
                "\n" +
                "3. CASTLING IS ALLOWED.KING AND ROOK HAS TO BE MOVED WITH SAME HAND.\n" +
                "\n" +
                "4. WINNER IS DECIDED BY CHECKMATE YOUR OPPONENT OR TIME  OF OPPONENT RUNS OUT.\n" +
                "   IF TIME OF BOTH PLAYER RUNS OUT -  WINNER WILL BE DECIDED BY POINTS OF PIECES CAPTURED.\n" +
                "\n" +
                "5. NO INTERFERENCE AND DISTRACTIONS ALLOWED -MAINTAIN SILENCE.\n" +
                "\n" +
                "6. CODE OF CONDUCT MUST BE FOLLOWED BY  THE PLAYERS.\n" +
                "\n");
        s.setJudcriteria("i. Number of entries- \n" +
                "ii. List of Prize winners / Special prizes- CASH MONEY TO FIRST AND SECOND\n" +
                "\n"
               );
        s.setCoordinators("1.PUSHPENDRA SINGH RAJAWAT\n" +
                "            2.MANISH KUMAR\n" +
                "CONTACT NO- 7900293622\n");
        s.setImage(R.drawable.chess);
        events.add(s);



        s = new Technical();
        s.setTitle("CARROM");
        s.setSummary(
                "Carrom (also known as Karrom) is a \"strike and pocket\" table game of Eastern origin similar to billiards and table shuffleboard.\n");
        s.setTask(
                "1. Pieces of different color will be chosen for both participants.\n" +
                "2. If any participant will get the opposition’s piece will give fine.\n" +
                "3. Total time given to a game will be 10 mins.\n");
        s.setJudcriteria("1. Time will be determining factor.\n" +
                "2. The participant who scores highest will be winner\n" +
                "\n");
        s.setCoordinators("1.Rajneesh gupta\n" +
                "2.Prakash srivastava");
        s.setImage(R.drawable.carrom);
        events.add(s);

        s = new Technical();
        s.setTitle("TABLE TENNIS");
        s.setSummary("Table tennis, also known as ping pong, is a sport in which two or four players hit a lightweight ball back and forth across a table using a small bat. The game takes place on a hard table divided by a net.\n" +
                "\n");
        s.setTask("Every game will be played in 3 rounds, with the winner winning 2/3 rounds.\n" +
                "\n" );
        s.setJudcriteria(
                "    Time will be determining factor.\n" +
                        "    The participant who scores highest will be winner\n");
        s.setCoordinators("pintu meena\n" +
                "uday nayak(8076236854)");
        s.setImage(R.drawable.table);
        events.add(s);



        return events;
    }
}
