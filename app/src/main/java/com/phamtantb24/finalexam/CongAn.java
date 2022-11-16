package com.phamtantb24.finalexam;

public class CongAn {
    private int image;
    private String name;
    private String level;
    private String workPlace;
    private String country;
    private int numStar;

    public CongAn(int image, String name, String level, String workPlace, String country, int numStar) {
        this.image = image;
        this.name = name;
        this.level = level;
        this.workPlace = workPlace;
        this.country = country;
        this.numStar = numStar;
    }

    public CongAn(String name, String level, String workPlace, String country, int numStar) {
        this.name = name;
        this.level = level;
        this.workPlace = workPlace;
        this.country = country;
        this.numStar = numStar;
    }

    public CongAn() {
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getNumStar() {
        return numStar;
    }

    public void setNumStar(int numStar) {
        this.numStar = numStar;
    }
}
