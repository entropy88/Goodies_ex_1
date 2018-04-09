package com.example.entropy.goodies_ex;

import android.media.Image;

/**
 * Created by entropy on 4/6/2018.
 */

public class Post {
    private String name;
    private String placeAndDate;
    private String content;


    public Post (String name, String placeAndDate, String content) {
        this.name = name;
        this.placeAndDate = placeAndDate;
        this.content = content;


    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlaceAndDate(String placeAndDate) {
        this.placeAndDate = placeAndDate;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public String getName() {
        return name;
    }

    public String getPlaceAndDate() {
        return placeAndDate;
    }

    public String getContent() {
        return content;
    }







}
