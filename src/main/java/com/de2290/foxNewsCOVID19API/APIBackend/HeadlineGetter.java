package com.de2290.foxNewsCOVID19API.APIBackend;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class HeadlineGetter {
    public HeadlineList getHeadlineList() throws IOException {
        HeadlineList h = new HeadlineList();
        String url = "https://www.foxnews.com/category/health/infectious-disease/coronavirus";
        Document doc = Jsoup.connect(url).get();
        Elements articleContent = doc.select("div.article-list");

        for (Element articleElem: articleContent) {
            Elements articles = articleElem.select("article.article");

            for (Element articleMain : articles) {
                Elements divInfo = articleMain.select("div.info");
                for (Element div : divInfo) {
                    Elements headers = div.select("header.info-header");
                    for (Element header : headers) {
                        Elements headings = header.select("h4.title");
                        for (Element heading : headings) {
                            h.addHeadline(heading.text());

                        }
                    }

                }
            }

        }

        return h;


    }
}
