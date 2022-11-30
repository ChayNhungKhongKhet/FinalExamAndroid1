package com.phamtantb24.finalexam;

import java.io.Serializable;
import java.util.List;

public class Author implements Serializable {
    private int image;
    private String name;
    private String described;
    private int numStar;
    private List<Literary> literaries;

    public Author(int image, String name, String described, int numStar,List<Literary> literaries) {
        this.image = image;
        this.name = name;
        this.described = described;
        this.numStar = numStar;
        this.literaries = literaries;
    }

    public Author(String name, String described, int numStar) {
        this.name = name;
        this.described = described;
        this.numStar = numStar;
    }

    public Author() {
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

    public String getDescribed() {
        return described;
    }

    public void setDescribed(String described) {
        this.described = described;
    }

    public int getNumStar() {
        return numStar;
    }

    public List<Literary> getLiteraries() {
        return literaries;
    }

    public void setLiteraries(List<Literary> literaries) {
        this.literaries = literaries;
    }

    public void setNumStar(int numStar) {
        this.numStar = numStar;


    }
}
