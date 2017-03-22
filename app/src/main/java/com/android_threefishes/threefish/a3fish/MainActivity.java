package com.android_threefishes.threefish.a3fish;

import android.app.Fragment;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.android_threefishes.threefish.a3fish.Adapter.Home_ViewpagerAdapter;
import com.android_threefishes.threefish.a3fish.Fragment.Find_Fragment;
import com.android_threefishes.threefish.a3fish.Fragment.My_Fragment;
import com.android_threefishes.threefish.a3fish.Fragment.NavigFragment;
import com.android_threefishes.threefish.a3fish.Fragment.Selection_Fragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private Home_ViewpagerAdapter mViewPagerAdapter;
    private List<Fragment> fragmentList;
    private boolean[] fragmentFlagArray = new boolean[]{false,false,false,false,false,false};;
    private Find_Fragment findFragment;
    private NavigFragment navFragment;
    private TabLayout.Tab myTab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        findFragment.setCallback_find(new Find_Fragment.Callback_Find() {
            @Override
            public void findFraOnclick(int num) {
                fragmentCallback(num);
            }
        });
        navFragment.setCallback_Navig(new NavigFragment.Callback_Navig() {
            @Override
            public void navigFraOnclick(int num) {
                fragmentCallback(num);
            }
        });
    }

    private void initView(){
        tabLayout = (TabLayout) findViewById(R.id.tablayout);
        viewPager = (ViewPager)findViewById(R.id.viewpager);
        mViewPagerAdapter = new Home_ViewpagerAdapter(this,getFragmentManager(), initFragment(),fragmentFlagArray,functionKeysName(),Default_functionKeysIcon());
        viewPager.setAdapter(mViewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
        initTabLayout(functionKeysName(), Default_functionKeysIcon(),Selected_functionKeysIcon());

    }

    /**
     * find_fragment和navigFragment回调Activity,来通知viewpager更新fragment
     * @param num 特征值
     */
    private void fragmentCallback(int num){
        switch (num) {
            case 0:
                fragmentFlagArray[0] = true;
                fragmentList.set(0, findFragment);
                mViewPagerAdapter.notifyDataSetChanged();
                initTabLayout(functionKeysName(), Default_functionKeysIcon(),Selected_functionKeysIcon());
                break;
            case 1:
                fragmentFlagArray[0] = true;
                fragmentList.set(0, navFragment);
                mViewPagerAdapter.notifyDataSetChanged();
                initTabLayout(functionKeysName(), Default_functionKeysIcon(),Selected_functionKeysIcon());
                break;
        }
    }



    /**
     * for循环设定tab的icon,name
     * @param nameArray 导航tab名称
     * @param D_iconArray 导航tablayout默认icon数组
     * @param C_iconArray 导航tablayout被选中icon数组
     */
    public void initTabLayout(String[] nameArray,final int[] D_iconArray,final int C_iconArray[]){

        for (int i = 0;i < tabLayout.getTabCount();i++){
            if(tabLayout.getTabCount() != 0){
                myTab = tabLayout.getTabAt(i);
                myTab.setIcon(D_iconArray[i]).setText(nameArray[i]);
                myTab.setCustomView(mViewPagerAdapter.getTabView(i));
            }
        }


        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Log.e("here", "case0"+tab.getPosition()+"");
                setTabSelected(tab, tab.getPosition());
                viewPager.setCurrentItem(tab.getPosition());

            }

            public void setTabSelected(TabLayout.Tab tab,int num){
                View view = tab.getCustomView();
                ImageView iv = (ImageView) view.findViewById(R.id.tabImage);
                switch (num){
                    case 0:
                        iv.setImageResource(R.drawable.ic_findpressed);
                        break;
                    case 1:
                        iv.setImageResource(R.drawable.ic_selected_pressed);
                        break;
                    case 2:
                        iv.setImageResource(R.drawable.ic_my_pressed);
                        break;
                }

            }

            public void setUnTabSelected(TabLayout.Tab tab,int num){
                View view = tab.getCustomView();
                ImageView iv = (ImageView) view.findViewById(R.id.tabImage);
                switch (num){
                    case 0:
                        iv.setImageResource(R.drawable.ic_find);
                        break;
                    case 1:
                        iv.setImageResource(R.drawable.ic_selected);
                        break;
                    case 2:
                        iv.setImageResource(R.drawable.ic_my);
                        break;
                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                setUnTabSelected(tab, tab.getPosition());
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    /*private void resetTab(){
        Log.e("here", "reset it");
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_find);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_selected);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_my);
    }*/



    private List<Fragment> initFragment(){
        fragmentList = new ArrayList<Fragment>();
        findFragment = new Find_Fragment();
        navFragment = new NavigFragment();
        fragmentList.add(findFragment);
        fragmentList.add(new Selection_Fragment());
        fragmentList.add(new My_Fragment());
        return fragmentList;
    }

    /**
     * @return 导航栏tab名称
     */
    private String[] functionKeysName(){
        return new String[]{"发现", "精选", "我的"};
    }

    /**
     * @return 底部导航默认icon数组
     */
    private int[] Default_functionKeysIcon(){
        return new int[]{
                R.drawable.ic_findpressed,
                R.drawable.ic_selected,
                R.drawable.ic_my
        };
    }

    /**
     * @return 底部导航被选中icon数组
     */
    private int[] Selected_functionKeysIcon(){
        return new int[]{
                R.drawable.ic_find,
                R.drawable.ic_selected_pressed,
                R.drawable.ic_my_pressed};
    }

}
