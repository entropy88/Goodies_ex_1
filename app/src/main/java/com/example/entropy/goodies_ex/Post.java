package com.example.entropy.goodies_ex;

import android.media.Image;

/**
 * Created by entropy on 4/6/2018.
 */

public class Post {
    private String name;
    private String placeAndDate;
    private String content;
    private int imageId;
    private int profileImageId;


    public Post (String name, String placeAndDate, String content, int imageId, int profileImageId) {
        this.name = name;
        this.placeAndDate = placeAndDate;
        this.content = content;
        this.imageId= imageId;
        this.profileImageId=profileImageId;

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
    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
    public void setProfileImageId (int profileImageId){this.profileImageId=profileImageId; }


    public String getName() {
        return name;
    }

    public String getPlaceAndDate() {
        return placeAndDate;
    }

    public String getContent() {
        return content;
    }
    public int getImageId () {return imageId; }
    public int getProfileImageId () {return profileImageId; }







}
