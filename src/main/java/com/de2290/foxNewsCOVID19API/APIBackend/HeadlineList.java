package com.de2290.foxNewsCOVID19API.APIBackend;

import java.util.ArrayList;

public class HeadlineList {

    private ArrayList<String> headlines = new ArrayList<String>();

    public ArrayList<String> getHeadlines() {
        return headlines;
    }

    public void setHeadlines(ArrayList<String> headlines) {
        this.headlines = headlines;
    }

    public void addHeadline(String headline) {
        headlines.add(headline);
    }
}
