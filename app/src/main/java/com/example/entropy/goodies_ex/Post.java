package com.example.entropy.goodies_ex;

/**
 * Created by entropy on 4/6/2018.
 */

public class Post {
    private String title;
    private String imageUrl;

    public Post (String title, String imageUrl) {
        this.title = title;
        this.imageUrl = imageUrl;

    }

    public String getTitle(){
        return title;
    }
    public String getImageUrl(){
        return imageUrl;
    }

}
