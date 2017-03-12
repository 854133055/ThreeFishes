package com.android_threefishes.threefish.a3fish;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentPagerAdapter;

import java.util.List;


/**
 * Created by mml on 17-3-12.
 * Describe: 首页底部功能导航Viewpager Adapter
 */

public class Home_ViewpagerAdapter extends FragmentPagerAdapter {


    private List<Fragment> fragmentList;

    public Home_ViewpagerAdapter(FragmentManager fm, List<Fragment> fragmentList) {
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
