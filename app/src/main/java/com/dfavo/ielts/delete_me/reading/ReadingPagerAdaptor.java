package com.dfavo.ielts.delete_me.reading;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ReadingPagerAdaptor extends FragmentPagerAdapter {
    private Context myContext;
    int totalTabs;

    public ReadingPagerAdaptor(ReadingActivity readingActivity, FragmentManager supportFragmentManager, int tabCount) {
        super(supportFragmentManager);
        myContext = myContext;
        this.totalTabs = tabCount;
    }


    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Rd1 rd1 = new Rd1();
                return rd1;
            case 1:
                Rd2 rd2 = new Rd2();
                return rd2;
            case 2:
                Rd3 rd3 = new Rd3();
                return rd3;

            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return totalTabs;
    }
}

