package com.dfavo.ielts.rwl;


import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;


import androidx.appcompat.app.AppCompatActivity;

import androidx.viewpager.widget.ViewPager;

import com.dfavo.ielts.R;
import com.google.android.material.tabs.TabLayout;

public class RWLActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_writing);

        //find id
        tabLayout = (TabLayout) findViewById(R.id.tabLayout1);
        viewPager = (ViewPager) findViewById(R.id.viewPager1);

        tabLayout.addTab(tabLayout.newTab().setText("Essay(197)"));
        tabLayout.addTab(tabLayout.newTab().setText("Graphs(100)"));
        tabLayout.addTab(tabLayout.newTab().setText("More"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final RWLActivityVpAdaptor adapter = new RWLActivityVpAdaptor(this, getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}