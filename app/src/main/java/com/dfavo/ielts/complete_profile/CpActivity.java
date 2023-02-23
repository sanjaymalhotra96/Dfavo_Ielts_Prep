package com.dfavo.ielts.complete_profile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.dfavo.ielts.R;
import com.dfavo.ielts.activities.EnterPasscodeActivity;
import com.dfavo.ielts.activities.OtpActivity;

public class CpActivity extends AppCompatActivity {

    ViewPager2 viewpager;
    CpActivityVpAdaptor completProfileAdaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_profile);
        viewpager =findViewById(R.id.viewpager2);

        completProfileAdaptor = new CpActivityVpAdaptor(getSupportFragmentManager(), getLifecycle());

        // add Fragments in your ViewPagerFragmentAdapter class
        completProfileAdaptor.addFragment(new CpPage1());
        completProfileAdaptor.addFragment(new CpPage2());
        completProfileAdaptor.addFragment(new CpPage3());
        completProfileAdaptor.addFragment(new CpPage4());
        completProfileAdaptor.addFragment(new CpPage5());
        completProfileAdaptor.addFragment(new CpPage6());

        viewpager.setAdapter(completProfileAdaptor);


    }
}