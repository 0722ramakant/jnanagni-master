package com.example.coverflow.Contact;

import com.example.coverflow.R;

import java.util.ArrayList;


public class Contactcollection2 {

    public static ArrayList<Contact> getContact()
    {
        ArrayList<Contact> events=new ArrayList<>();

        Contact s=new Contact();

        s.setName("VIKASH KUMAR GUPTA");
        s.setGmail("vikashkumar220698@gmail.com");
        s.setDevelop("HEAD APP DEVELOPER");
        s.setImage(R.drawable.v);
        s.setCall("9507537301");
        events.add(s);

        s=new Contact();
        s.setName("RAMAKANT SHAKYA");
        s.setGmail("ramakant0722@gmail.com");
        s.setDevelop("FrontEnd APP DEVELOPER");
        s.setImage(R.drawable.r);
        s.setCall("8630500420");
        events.add(s);


        s=new Contact();
        s.setName("JAPNEET SINGH");
        s.setGmail("");
        s.setDevelop(" BACKEND APP DEVELOPER");
        s.setImage(R.drawable.pubg3);
        s.setCall("7317587827");
        events.add(s);

        s=new Contact();

        s.setName("VIKAS YADAV");
        s.setGmail("vikas090497@gmail.com");
        s.setDevelop("BACKEND APP DEVELOPER");
        s.setImage(R.drawable.vikasyadav);
        s.setCall("8233081931");
        events.add(s);

        return events;
    }
}
