package com.example.coverflow.Technical;


import com.example.coverflow.R;

import java.util.ArrayList;

public class TechnicalCollection {

    public static ArrayList<Technical> getTechnical() {
        ArrayList<Technical> events = new ArrayList<>();

        Technical s = new Technical();

        s.setTitle("APPDIE");
        s.setSummary("APPDIE");
        s.setTask("Project must be uploaded to GitHub and a signed release apk must be available in the release folder. For more information on how to use GitHub and generate Signed APK is given below.\n" +
                "\n" +
                "\n" +
                "------------------------------------------------------------------------------------------\n" +
                "\n" +
                "\n" +
                "Tutorials for submitting your project\n" +
                "\n" +
                "\n" +
                "https://guides.github.com/activities/hello-world/ - GitHub Official\n" +
                "https://product.hubspot.com/blog/git-and-github-tutorial-for-beginners - \n" +
                "An Intro to Git and GitHub for Beginners\n" +
                "https://www.londonappdeveloper.com/how-to-use-git-hub-with-android-studio/ - How to use GitHub with Android Studio\n" +
                "\n" +
                "http://abhiandroid.com/androidstudio/generate-signed-apk-android-studio.html - Generating a Signed APK in Android Studio");
        s.setJudcriteria("3.There are two places, second and first.\n" +
                "\n" +
                "Judging criteria is as follows:\n" +
                "Design: 25%\n" +
                "User Experience: 25%\n" +
                "Functionality: 30%\n" +
                "Stability: 20%\n");
        s.setCoordinators("VIKASH KUMAR GUPTA -" +
                "8709124929\n" + "Anumpam prihar -7905265059");
        s.setImage(R.drawable.app);
        events.add(s);


        s = new Technical();
        s.setTitle("BACK TO PAST");
        s.setSummary("BACK TO PAST");
        s.setTask("");
        s.setJudcriteria("");
        s.setCoordinators("");
        s.setImage(R.drawable.back);
        events.add(s);





        s = new Technical();
        s.setTitle("DECIPHER");
        s.setSummary("DECIPHER");
        s.setTask("");
        s.setJudcriteria("");
        s.setCoordinators("");
        s.setImage(R.drawable.decipher);
        events.add(s);


        s = new Technical();
        s.setTitle("ELECTRICAL QUIZ");
        s.setSummary("ELECTRICAL QUIZ");
        s.setTask("");
        s.setJudcriteria("");
        s.setCoordinators("");
        s.setImage(R.drawable.electrial);
        events.add(s);






        s = new Technical();
        s.setTitle("EXGESIS");
        s.setSummary("EXGESIS.\n"+
                "The event has three round which test your circuit debugging skills.\n\n"
                +"ROUND:-1\n" +
                "In this round 20 basic elctronics and electrical and 10 Aptitude related question will be given. Time provided for this season will be only 30 min. Participant are required to have a basic knowledge of electronics and electrical.\n" +
                "\n" +
                "ROUND:-2\n" +
                "Participant who are selected for this round are tested on their knowledge of digital circuitry. In this round 10 digital elctronics circuit are given and they are supposed to identify the faults and 10 digital electronics circuts are given in which they are giving multiple output but you have to identify a correct output. For this round 1 hours is given to all paricipants. \n" +
                "\n" +
                "ROUND:-3\n" +
                "\n" +
                "This is final stage, Selected participant have to debug a circuit which is already made on breadboard. You don\"t have to transform all the circuit, only you have to check where is fault in circuit, due to which output will be giving error. Time required for this round is 45 minutes.\n" +
                "\n"
                 );
        s.setTask(
                "1. Every Team should consist of a maximum of two member.\n" +
                "2. Every Team has to register for jnanagni-19.\n" +
                "3. The decision of judges and event organiser shall be treated as final and binding to all.\n" +
                "4. A basic knowledge of Digital electronics circuit is necessary.\n" +
                "5. Any malpractice is strictly prohibited.");
        s.setJudcriteria("\n" +
                "Round-1 is evaluated based on number of question answered correctly. Every negative answer will be deduct a -ve marks from total.\n" +
                "Round-2 is based on the solution and approach to a given question and time taken to complete the solution. This round also have a -ve marking.\n" +
                "Round-3 is based on output and time taken to debug the circuit.");
        s.setCoordinators("Shivam kumar: 9870922447\n" +
                "V. Sai Sri Harsha: 9701385951\n" +
                "Nitish satyarth: 7060164843");
        s.setImage(R.drawable.circuit);
        events.add(s);

        s = new Technical();
        s.setTitle("HYDRORISER");
        s.setSummary("EVENT DESCRIPTION \n" +
                "• Teams have to make a rope climbing machine using only hydraulic mechanisms, should be able to push the ball from an adjacent position. \n" +
                "• In this action, it will have to complete with another machine in a knockout tournament. \n" +
                "• There would be two major checkpoint, each major checkpoint has two minor check points. \n" +
                "• The completion of minor checkpoint will be considered as major check points \n" +
                "• The minor checkpoint in a particular major checkpoint can be completed in any order. \n" +
                "• The minor checkpoint will be used for reinstallation during the run. \n" +
                "• The minor checkpoint are : \n" +
                "1. Pushing the ball of the platform. \n" +
                "2. All the part of the bot must cross the corresponding distance line for the \n" +
                "platform i.e. 500mm/1000mm. \n\n" +
               "ARENA DESCRIPTION \n" +
                "• The arena will be 4 ropes. The ropes will looks like corner of a square when arena is seen from top. \n" +
                "• There will be central rigid pipe at the centre of the square mentioned in point 1. \n" +
                "• The ropes will be tide at both the end to rigid surface. The rope will be tuat. \n" +
                "• The horizontal distance between the ropes, diagonally opposite end, will be 600mm. \n" +
                "• The rope would be a jute rope of diameter approx. 40mm. \n" +
                "• There would be platforms at three different levels attached to a support piller at distances of 500mm, 1000mm, 2000mm from the start line. \n" +
                "• There arena is defined for double rope from both the side. \n" +
                "• The distance from rope and platform will be 300mm. \n" +
                "• Distance between centre of rope and near end of piller will be 200mm. \n" +
                "• There will be a table tennis ball of diameter <40mm, kept on the platform at a distance of 50mmfrom end. Or at a distance of 250mm from centre of rope. \n" +
                "• Initially the ball will be held stationary. \n\n"+
               "MACHINE SPECIFICATION \n" +
                "• Machine should fix in a box of dimension 300mm*300mm*300mm. The extensions used to control the machine are excluded. \n" +
                "• Machine should expand or compress during the run. \n" +
                "• Locomotion of any part of machine should be governed by hydraulic force. \n" +
                "• Use of battery or any other sources of energy (electrical motor, spring, compressor) is prohibited. \n\n" +
                "CONTROLS \n" +
                "The machine should only be controlled with the help of syringes (any piston cylinder arrangement). \n" +
                "Maximum of two people will be allowed to control at any point. \n\n"+
                "MATERIAL ALLOWED \n" +
                "1) SYRINGES.\n"+" 2) TUBES.\n"+" 3) WOOD.\n"+" 4) METALLIC FRAME.\n"+" 5) RUBBER BAND.\n"+" 6) PLASTICS \n" +
                "7) WATER '\n"+"8) METAL PULLEYS \n");
        s.setTask("1. The team must adhere to the spirit of healthy competition.\n"+ "2. Any team that is not ready at the time specified will be disqualified from \n" +
                "the competition automatically.\n"+" 3. The organizer reserve all rights to chance of any of the above rule as they deem fit. Change in any rule , if any will be highlighted on the website.\n"+" 4. In case of any discrepancy decision of the judges shall be treated as final \n" +
                "and binding on all. \n");
        s.setJudcriteria("Elimination round: Top 32 teams with minimum time will qualify for the knockout round.\n"+" Knockout Round: The team that drops the top ball first, will be declared as the winner of that particular round. \n" +
                "The maximum time given for completing the task is 6 minutes. A setup time of 2 minutes would be given before the start of the run. The machine should not cross the marked line before the start of the run. \n" +
                "• The machine has to climb the rope using hydraulic mechanisms only. \n" +
                "• The run time start from the moment any part of the machine crosses the starting line and stops the moment the ball on the topmost platform touches the ground. \n" +
                "• Maximum of three interventions are allowed during a trail. The team will platform which is not a height of 500mm and then proceeding to climb a total height of 1000mm. \n" +
                "• The time in this case stops when any part of the machine crosses the 1000mm lines. \n" +
                "• The only checkpoint in this task will be dropped the down and the top 10 teams with the minimum time for the pushes the boll out of the top most platforms first will min the knock out. \n\n"+
               "The Knock –out round: \n" +
                "• Team will go two at a time in a race drop the ball of the topmost platform and the team that pushed the ball out of the top most platform first will win the knock out. \n" +
                "• The participants can not clear a major checkpoint without clearing any previous major checkpoint i.e. a participant cannot drop the ball of the second platform. \n" +
                "• If the organizer fell any necessity to conduct a rerun to differentiate the team then a return will be conducted. \n" +
                "• The tube containing the fluid should not be tut at any point of time while the run is going on and no direct pull or push force should be applied via tubes. \n" +
                "• The machine should not damage the ropes I any form. This might lead to disqualification. \n" +
                "• It is suggested that people add colours to the fluid used in tubes. This might help them while controlling the machine. \n" +
                "• The maximum time limit for the run is 0 minutes. If the team is not able to reach the finish line within the maximum time then point will be awarded in according to path travelled. \n" +
                "• The machine cannot damage the rope in any way. This may attract disqualification from the event. \n" );
        s.setCoordinators("Ratnesh verma : 9651517799.\n"+" Aman Deep : 9368826080.\n"+" Anuj kumar : 9507904737 \n");
        s.setImage(R.drawable.decipher);
        events.add(s);


        s = new Technical();
        s.setTitle("LINE FOLLOWER");
        s.setSummary("LINE FOLLOWER");
        s.setTask("");
        s.setJudcriteria("");
        s.setCoordinators("");
        s.setImage(R.drawable.line);
        events.add(s);


        s = new Technical();
        s.setTitle("NOPC");
        s.setTask("This event will be hosted on Hackerearth.\n" +
                "Round 1:\n" +
                "Quiz competition of MCQ type.\n" +
                "Maximum time limit: 30 minutes\n" +
                "Round 2:\n" +
                "Participants will have to code according to the instructions provided.\n" +
                "\n" +
                "No. of questions : 3\n" +
                "Maximum time limit: 1 hour\n" +
                "\n" );
        s.setSummary("1. All rules of HackerEarth.\n" +
                        "2. Participant can use only C, C++, Java or Python language supported by HackerEarth platform.       \n" +
                        "\n" );
        s.setJudcriteria(
                "Venue:- \n" +
                "IBM Lab  \n" +
                "\n" +
                "Date & Time:- \n" +
                "Day: 01 \n" +
                "Timing: \n" +
                "11:00 AM to 12:00 PM (ROUND - 1)\n" +
                "12:30 PM to 02:00 PM (ROUND - 2)\n" +
                "                    \n" +
                "Judge:-\n" +
                "          \tMr. Suyash Bhardwaj (Faculty Member)\n" +
                "\n");
        s.setCoordinators("Saurabh Yadav\t\tMob: 7565824168(CSE 3rd)\n" +
                "Manish Kumar\t\tMob: 9572830038(CSE 3rd)    ");
        s.setImage(R.drawable.n1);
        events.add(s);


        s = new Technical();
        s.setTitle("PROJECT EXPO");
        s.setSummary(" PROJECT EXPO");
        s.setTask("1. Maximum 3 member per team.\n" +
                "2. Project should based on both hardware as well as software.\n"
                +"Step 1- abstract must be under 400 words, explaining about project idea and components required\n" +
                "with all team member name, branches and team no.\n" +
                "Step 2- the selected abstract were given chance to present in jnanagni, where team have to\n" +
                "represent there project. They also have to prepare a chart paper explaining about there idea and\n" +
                "how project is helpful for human kind.\n" );

        s.setJudcriteria(
                "The best project selected by respective judges will be winner.\n" +
                        "Winner and 1st runner up were awarded with cash prize.");
        s.setCoordinators("Shubham kuamr (8544212156)\n" +
                "Mayank sachan\n" +
                "Satish kumar");
        s.setImage(R.drawable.electronics);
        events.add(s);


        s = new Technical();
        s.setTitle("ROBO SOCCER");
        s.setSummary("ROBO SOCCER");
        s.setTask("");
        s.setJudcriteria("");
        s.setCoordinators("");
        s.setImage(R.drawable.robo);
        events.add(s);


        s = new Technical();
        s.setTitle("ROBO RACE");
        s.setSummary("ROBO RACE");
        s.setTask("");
        s.setJudcriteria("");
        s.setCoordinators("");
        s.setImage(R.drawable.race);
        events.add(s);


        s = new Technical();
        s.setTitle("ROBO WAR");
        s.setSummary("ROBO WAR");
        s.setTask("A");
        s.setJudcriteria("C");
        s.setCoordinators("R");
        s.setImage(R.drawable.war);
        events.add(s);


        s = new Technical();
        s.setTitle("TOWER MAKING");
        s.setSummary("TOWER MAKING");
        s.setTask("");
        s.setJudcriteria("");
        s.setCoordinators("");
        s.setImage(R.drawable.tower);
        events.add(s);


        s = new Technical();
        s.setTitle("WEBER");
        s.setSummary("WEBER.\n\n"+
                "You will have to design a website using markup & programming" +
                " language.There will be no internet connection throughout the event.A website can be static or dynamic as per your ease.\n ");

        s.setTask(" Make sure to check your website in multiple browsers, so that everything appears correctly\n" +
                "\n" +
                "- All the participants must come with their own laptops for presenting their sites.\n" +
                "\n" +
                "- Each team can have maximum of 2 participants(for static) or 3(for dynamic).\n" +
                "\n"
                );
        s.setJudcriteria("This level will terminates in two stages.\n" +
                "\n" +
                "Level 1\n" +
                "Here participants have to present the overview of their site along with the names of their team members & their contribution in making the site via PPT.\n" +
                "\n" +
                "Level 2\n" +
                "Shortlisted students will have to present their web design along with the code (CD).\n" +
                "\n");
        s.setCoordinators("  harshit saxena");
        s.setImage(R.drawable.web);
        events.add(s);


        s = new Technical();
        s.setTitle("TINKERER");
        s.setSummary("TINKERER");
        s.setTask(" Knowledge of 12th standard Physics, Chemistry, Mathmatics and Common-Sense\n");
        s.setJudcriteria("Number of participants should not be more than 3 in a team.\n" +
                "\n" +
                "- If any one found mishandling the given objects he/she will be disqualified.\n" +
                "\n" +
                "- All decisions by the organizers are deemed final and cannot be questioned, however, they can give an explanation if requested");
        s.setCoordinators("nand lal yadav\n" +
                "laxmi narayan pandey(9532299288)");
        s.setImage(R.drawable.tinkerer);
        events.add(s);

        return events;
    }
}
