package com.dfavo.ielts;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.dfavo.ielts.R;
import com.dfavo.ielts.fragments.FragCommunity;
import com.dfavo.ielts.fragments.FragExplore;
import com.dfavo.ielts.fragments.FragMockTest;
import com.dfavo.ielts.fragments.FragPrepare;
import com.dfavo.ielts.fragments.FragVideos;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.explore);

    }

    FragExplore fragExplore = new FragExplore();
    FragPrepare fragPrepare = new FragPrepare();
    FragVideos fragVideos = new FragVideos();
    FragMockTest fragMockTest = new FragMockTest();
    FragCommunity fragCommunity = new FragCommunity();

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.explore:
                getSupportFragmentManager().beginTransaction().replace(R.id.frameContainer, fragExplore).commit();
                return true;

            case R.id.prepare:
                getSupportFragmentManager().beginTransaction().replace(R.id.frameContainer, fragPrepare).commit();
                return true;

            case R.id.videos:
                getSupportFragmentManager().beginTransaction().replace(R.id.frameContainer, fragVideos).commit();
                return true;
            case R.id.mock_test:
                getSupportFragmentManager().beginTransaction().replace(R.id.frameContainer, fragMockTest).commit();
                return true;
            case R.id.community:
                getSupportFragmentManager().beginTransaction().replace(R.id.frameContainer, fragCommunity).commit();
                return true;
        }
        return false;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}