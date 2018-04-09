package com.example.entropy.goodies_ex;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by entropy on 4/6/2018.
 */

public class StoriesFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.stories_fragment_layout, container, false);

        RecyclerView recyclerView=(RecyclerView) view.findViewById(R.id.rec_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        List<Post> data=AllThePosts.getPostList();
        StoriesAdapter adapter= new StoriesAdapter(data);
        recyclerView.setAdapter(adapter);
        return view;


    }
}



