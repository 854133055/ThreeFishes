package com.android_threefishes.threefish.a3fish.Adapter;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v13.app.FragmentPagerAdapter;
import android.view.ViewGroup;

import java.util.List;


/**
 * Created by mml on 17-3-12.
 * Describe: 首页底部功能导航Viewpager Adapter
 */

public class Home_ViewpagerAdapter extends FragmentPagerAdapter {


    private List<Fragment> fragmentList;
    private boolean[] tagArray;
    private FragmentManager fm;
    private String[] mnameArray;


    public Home_ViewpagerAdapter(FragmentManager fm, List<Fragment> fragmentList, boolean[] mtagArray, String[] nameArray) {
        super(fm);

        this.fragmentList = fragmentList;
        this.fm = fm;
        this.tagArray = mtagArray;
        this.mnameArray = nameArray;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        return mnameArray[position];
    }



    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        Fragment fragment = (Fragment)super.instantiateItem(container, position);
        String mTag = fragment.getTag();
        if(tagArray[position]){
            FragmentTransaction ft = fm.beginTransaction();
            ft.remove(fragment);
            fragment = fragmentList.get(position);
            ft.add(container.getId(), fragment, mTag);
            ft.attach(fragment);
            ft.commit();
            tagArray[position] = false;
        }
        return fragment;
    }
}
