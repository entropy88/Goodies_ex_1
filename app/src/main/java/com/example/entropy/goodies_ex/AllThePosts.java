package com.example.entropy.goodies_ex;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * Created by entropy on 4/9/2018.
 */

public class AllThePosts {
    private static List<Post> postList;

    public static List<Post> getPostList(){
if (postList==null){
    postList=generatePosts();
}
return postList;
    }

    private static List<Post> generatePosts() {
        return Arrays.asList(
                new Post("Francisco Watson", "Today, 10:52","mambo_number5", R.mipmap.image_story, R.mipmap.avatar_1),
        new Post("Le Me", "Today, 11:30","tralalalalalalalala",R.mipmap.ic_launcher_round, R.mipmap.avatar_2)
        );

    }
}
