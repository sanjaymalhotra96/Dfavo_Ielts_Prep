package com.dfavo.ielts.activities;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.dfavo.ielts.R;

import com.google.android.material.tabs.TabLayout;

public class VedioViewActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vedio_view);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout_vedioview);
        viewPager = (ViewPager) findViewById(R.id.viewPager_vedioview);

        tabLayout.addTab(tabLayout.newTab().setText("Lectures"));
        tabLayout.addTab(tabLayout.newTab().setText("More"));
        final VedioViewPagerAdaptor adapter = new VedioViewPagerAdaptor(this, getSupportFragmentManager(), tabLayout.getTabCount());
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
