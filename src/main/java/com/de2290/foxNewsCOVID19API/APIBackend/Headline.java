package com.de2290.foxNewsCOVID19API.APIBackend;

public class Headline {

    private String headline = "";
    private String link = "";
    private String imgUrl = "";

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }


    public Headline(String headline, String link, String imgUrl) {
        this.headline = headline;
        this.link = link;
        this.imgUrl = imgUrl;
    }
}
