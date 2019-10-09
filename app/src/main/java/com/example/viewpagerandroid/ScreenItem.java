package com.example.viewpagerandroid;

public class ScreenItem {

    String Title,Description;
    int ScreenImg;
    String link;

    public ScreenItem(String title, String description, int screenImg, String link) {
        Title = title;
        Description = description;
        ScreenImg = screenImg;
        this.link = link;
    }

    public String getTitle() {
        return Title;
    }

    public String getDescription() {
        return Description;
    }

    public int getScreenImg() {
        return ScreenImg;
    }

    public String getLink() {
        return link;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setScreenImg(int screenImg) {
        ScreenImg = screenImg;
    }

    public void setLink(String link) {
        this.link = link;
    }
}