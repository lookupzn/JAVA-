package com.chapter14.homework_;

import java.util.Arrays;

public class News {
    private String title;
    private String textNews;

    public News(String title) {
        this.title = title;
    }

    public String getTitle() {
        if(title.length() < 15)
        return title;
        else
        {
            char[] title15 = title.toCharArray();
            String s = new String();
            for(int i = 0; i < 15; i++)
        {
            s += title15[i];
        }
            return s + "...";
        }

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTextNews() {
        return textNews;
    }

    public void setTextNews(String textNews) {
        this.textNews = textNews;
    }



    @Override
    public String toString() {


        return "News: "  + getTitle() ;
    }
}
