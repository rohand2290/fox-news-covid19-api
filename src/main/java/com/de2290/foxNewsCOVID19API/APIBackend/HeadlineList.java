package com.de2290.foxNewsCOVID19API.APIBackend;

import java.util.ArrayList;

public class HeadlineList {

    private ArrayList<Headline> headlines = new ArrayList<Headline>();

    public ArrayList<Headline> getHeadlines() {
        return headlines;
    }

    public void setHeadlines(ArrayList<Headline> headlines) {
        this.headlines = headlines;
    }

    public void addHeadline(String headline, String url, String imageUrl) {
        headlines.add(new Headline(headline, url, imageUrl));
    }
}
