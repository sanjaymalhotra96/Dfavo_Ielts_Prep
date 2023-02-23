package com.dfavo.ielts.delete_me.listening;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.dfavo.ielts.R;
import com.google.android.material.tabs.TabLayout;

public class Listening extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listening);
        tabLayout=(TabLayout)findViewById(R.id.tabLayout_listening);
        viewPager=(ViewPager)findViewById(R.id.viewPager_listening);

        tabLayout.addTab(tabLayout.newTab().setText("Essay(197)"));
        tabLayout.addTab(tabLayout.newTab().setText("Graphs(100)"));
        tabLayout.addTab(tabLayout.newTab().setText("More"));
        final ListeningPagerAdaptor adapter = new ListeningPagerAdaptor(this,getSupportFragmentManager(), tabLayout.getTabCount());
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