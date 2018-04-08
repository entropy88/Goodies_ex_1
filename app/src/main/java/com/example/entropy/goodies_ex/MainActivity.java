package com.example.entropy.goodies_ex;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    MenuItem prevMenuItem;
    Toolbar toolbar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        toolbar = (Toolbar) findViewById(R.id.toolbar) ;

        bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.action_feed:
                                viewPager.setCurrentItem(0);
                                toolbar.setTitle("FEED");
                                break;
                            case R.id.action_scanner:
                                viewPager.setCurrentItem(1);
                                toolbar.setTitle("SCANNER");
                                break;
                            case R.id.action_gifts:
                                viewPager.setCurrentItem(2);
                                toolbar.setTitle("GIFTS");
                                break;
                            case R.id.action_profile:
                                viewPager.setCurrentItem(3);
                                toolbar.setTitle("PROFILE");
                                break;
                        }
                        return false;
                    }
                });

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (prevMenuItem != null) {
                    prevMenuItem.setChecked(false);
                }
                else
                {
                    bottomNavigationView.getMenu().getItem(0).setChecked(false);
                }

                bottomNavigationView.getMenu().getItem(position).setChecked(true);
                prevMenuItem = bottomNavigationView.getMenu().getItem(position);

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });



        setupViewPager(viewPager);
    }

    private void setupViewPager(final ViewPager viewPager) {
        BottomAdapter bottomAdapter = new BottomAdapter(getSupportFragmentManager());
        FeedFragment feedFragment = new FeedFragment();
        ScannerFragment scannerFragment = new ScannerFragment();
        GiftsFragment giftsFragment = new GiftsFragment();
        ProfileFragment profileFragment = new ProfileFragment();
        bottomAdapter.addFragment(feedFragment);
        bottomAdapter.addFragment(scannerFragment);
        bottomAdapter.addFragment(giftsFragment);
        bottomAdapter.addFragment(profileFragment);
        viewPager.setAdapter(bottomAdapter);


//select tab

//        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
//        tabLayout.addTab(tabLayout.newTab().setText("STORIES"));
//        tabLayout.addTab(tabLayout.newTab().setText("CAMPAIGNS"));
//
//        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
//
//
//        final PagerAdapter adapter = new PagerAdapter
//                (getSupportFragmentManager(), tabLayout.getTabCount());
//        viewPager.setAdapter(adapter);
//        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
//        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//                viewPager.setCurrentItem(tab.getPosition());
//            }
//
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
//
//            }
//
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//
//            }
//        });
//    }




    }
}
