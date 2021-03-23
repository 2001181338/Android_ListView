package com.example.myapplication;

import java.io.Serializable;

public class Nation implements Serializable {

    private int image;
    private String name, popular;

    public Nation(int image, String name, String popular) {
        this.image = image;
        this.name = name;
        this.popular = popular;
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

    public String getPopular() {
        return popular;
    }

    public void setPopular(String popular) {
        this.popular = popular;
    }
}
