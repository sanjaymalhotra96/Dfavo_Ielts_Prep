package com.dfavo.ielts.delete_me.listening;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ListeningPagerAdaptor extends FragmentPagerAdapter {
    private Context myContext;
    int totalTabs;

    public ListeningPagerAdaptor(Listening listening, FragmentManager supportFragmentManager, int tabCount) {
        super(supportFragmentManager);
        myContext = myContext;
        this.totalTabs = tabCount;
    }


    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Lt1 lt1 = new Lt1();
                return lt1;
            case 1:
                Lt2 lt2 = new Lt2();
                return lt2;
            case 2:
                Lt3 lt3 = new Lt3();
                return lt3;

            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return totalTabs;
    }
}

