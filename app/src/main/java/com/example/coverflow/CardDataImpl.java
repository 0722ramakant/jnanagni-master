package com.example.coverflow;

import com.ramotion.expandingcollection.ECCardData;

import java.util.ArrayList;

public class CardDataImpl implements ECCardData<String> {

    private String cardTitle;
    private Integer mainBackgroundResource;
    private Integer headBackgroundResource;
    private ArrayList<String> listItems;

    public CardDataImpl(String cardTitle, Integer mainBackgroundResource, Integer headBackgroundResource) {
        this.mainBackgroundResource = mainBackgroundResource;
        this.headBackgroundResource = headBackgroundResource;

        this.cardTitle = cardTitle;
    }

    public static ArrayList<ECCardData> generateExampleData() {
        ArrayList<ECCardData> list = new ArrayList<>();
        list.add(new CardDataImpl(" Win a game without ever hurting another player", R.drawable.vkg4, R.drawable.ep));
        list.add(new CardDataImpl("Register", R.drawable.vkg, R.drawable.rp));

        list.add(new CardDataImpl("GALLERY", R.drawable.gal, R.drawable.gala));
        list.add(new CardDataImpl("The Flare Gun’s currently only available to use", R.drawable.flare, R.drawable.spon));
        list.add(new CardDataImpl("Contact us", R.drawable.contactus1, R.drawable.contactus));
        list.add(new CardDataImpl("When you start the game, you will find the map", R.drawable.drop, R.drawable.at));


        return list;
    }

    @Override
    public Integer getMainBackgroundResource() {
        return mainBackgroundResource;
    }

    @Override
    public Integer getHeadBackgroundResource() {
        return headBackgroundResource;
    }

    @Override
    public ArrayList<String> getListItems() {
        return listItems;
    }

    public String getCardTitle() {
        return cardTitle;
    }


}