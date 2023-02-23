package com.dfavo.ielts.speaking;


import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.dfavo.ielts.R;
import com.google.android.material.tabs.TabLayout;

public class SpeakingActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speaking);
       tabLayout=(TabLayout)findViewById(R.id.tabLayout_speaking);
        viewPager=(ViewPager)findViewById(R.id.viewPager_speaking);



        tabLayout.addTab(tabLayout.newTab().setText("Parts"));
        tabLayout.addTab(tabLayout.newTab().setText("About"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final SpeakingActivityVpAdaptor adapter = new SpeakingActivityVpAdaptor(this,getSupportFragmentManager(), tabLayout.getTabCount());
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