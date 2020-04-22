package com.de2290.foxNewsCOVID19API.APIBackend;

public class Headline {

    private String headline = "";
    private String link = "";

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public Headline(String headline, String link) {
        this.headline = headline;
        this.link = link;
    }
}
