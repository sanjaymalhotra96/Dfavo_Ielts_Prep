package com.dfavo.ielts.rwl.graphs;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.dfavo.ielts.delete_me.graphs.Graphs1;
import com.dfavo.ielts.delete_me.graphs.Graphs2;
import com.dfavo.ielts.delete_me.graphs.Graphs3;
import com.dfavo.ielts.delete_me.graphs.Graphs4;

public class UserInputGraphsActivityVpAdaptor extends FragmentPagerAdapter {
    private Context myContext;
    int totalTabs;

    public UserInputGraphsActivityVpAdaptor(UserInputGraphsActivity userInputGraphsActivity, FragmentManager supportFragmentManager, int tabCount) {
        super(supportFragmentManager);
        myContext = myContext;
        this.totalTabs = tabCount;
    }


    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Graphs1 graphs1 = new Graphs1();
                return graphs1;
            case 1:
                Graphs2 graphs2= new Graphs2();
                return graphs2;
            case 2:
                Graphs3 graphs3 = new Graphs3();
                return graphs3;

            case 3:
                Graphs4 graphs4 = new Graphs4();
                return graphs4;
            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return totalTabs;
    }
}
