package com.android_threefishes.threefish.a3fish.Adapter;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by mml on 17-3-16.
 * Describe:
 */

public class Navig_VIewpagerAdapter extends FragmentPagerAdapter {

    private List<Fragment> fragmentList;

    public Navig_VIewpagerAdapter(FragmentManager fm, List<Fragment> fragmentList) {
        super(fm);
        this.fragmentList = fragmentList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }



}
