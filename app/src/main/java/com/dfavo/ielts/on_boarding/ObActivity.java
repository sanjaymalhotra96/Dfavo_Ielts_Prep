package com.dfavo.ielts.on_boarding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.dfavo.ielts.R;
import com.dfavo.ielts.Splash;
import com.dfavo.ielts.activities.LoginActivity;

import me.relex.circleindicator.CircleIndicator3;

public class ObActivity extends AppCompatActivity {

    ViewPager2 viewpager;
    CircleIndicator3 indicator;
    ObActivityVpAdaptor myAdapter;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding);
        button=findViewById(R.id.get_started_click);
        viewpager = findViewById(R.id.viewpager);
        indicator = findViewById(R.id.indicator);
        myAdapter = new ObActivityVpAdaptor(getSupportFragmentManager(), getLifecycle());

        // add Fragments in your ViewPagerFragmentAdapter class
        myAdapter.addFragment(new ObPage1());
        myAdapter.addFragment(new ObPage2());
        myAdapter.addFragment(new ObPage3());

        viewpager.setAdapter(myAdapter);

        indicator.createIndicators(2, 0);
        indicator.setViewPager(viewpager);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ObActivity.this, LoginActivity.class);
                startActivity(intent);

            }
        });
    }
}