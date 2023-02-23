package com.dfavo.ielts.on_boarding;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class ObActivityVpAdaptor extends FragmentStateAdapter {
    private ArrayList<Fragment> fragmentList = new ArrayList<>();

    public ObActivityVpAdaptor(FragmentManager supportFragmentManager, Lifecycle lifecycle) {
        super(supportFragmentManager, lifecycle);
    }


    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return fragmentList.get(position);
    }

    public void addFragment(Fragment fragment) {
        fragmentList.add(fragment);
    }

    @Override
    public int getItemCount() {
        return fragmentList.size();
    }

}