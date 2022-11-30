package com.phamtantb24.finalexam;

import java.io.Serializable;

public class Literary implements Serializable {
    private String author;
    private String title;
    private String recap;
    private int stars;

    public Literary() {
    }

    public Literary(String author,String title, String recap, int stars) {
        this.author = author;
        this.title = title;
        this.recap = recap;
        this.stars = stars;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRecap() {
        return recap;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setRecap(String recap) {
        this.recap = recap;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }
}
