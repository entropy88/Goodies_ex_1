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
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    MenuItem prevMenuItem;
    android.support.v7.widget.Toolbar toolbar;
    TextView toolbarTitleTv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
       final android.support.v7.widget.Toolbar toolbar=(android.support.v7.widget.Toolbar)  findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("My title");
        toolbarTitleTv= (TextView)findViewById(R.id.txt_toolbar_title);

        bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.action_feed:
                                viewPager.setCurrentItem(0);
                                toolbarTitleTv.setText("FEED");
                                break;
                            case R.id.action_scanner:
                                viewPager.setCurrentItem(1);
                                toolbarTitleTv.setText("SCANNER");
                                break;
                            case R.id.action_gifts:
                                viewPager.setCurrentItem(2);
                                toolbarTitleTv.setText("GIFTS");
                                break;
                            case R.id.action_profile:
                                viewPager.setCurrentItem(3);
                                toolbarTitleTv.setText("PROFILE");
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

    }
}
