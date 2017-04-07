package com.android_threefishes.threefish.a3fish;

import android.app.Fragment;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.android_threefishes.threefish.a3fish.Adapter.Home_ViewpagerAdapter;
import com.android_threefishes.threefish.a3fish.Fragment.Home_Find_Fragment;
import com.android_threefishes.threefish.a3fish.Fragment.Home_My_Fragment;
import com.android_threefishes.threefish.a3fish.Fragment.Home_Selection_Fragment;
import com.balysv.materialmenu.MaterialMenuDrawable;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity  {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private Home_ViewpagerAdapter mViewPagerAdapter;
    private List<Fragment> fragmentList;
    private Home_Find_Fragment findFragment;
    private TabLayout.Tab myTab;
    private MaterialMenuDrawable materialMenuDrawable;
    private TextView tv_main_titile;
    private  TextView tv_drawer_item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView(){
        tv_main_titile = (TextView) findViewById(R.id.title_text);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_main);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);
        materialMenuDrawable = new MaterialMenuDrawable(this, Color.BLACK, MaterialMenuDrawable.Stroke.THIN);
        materialMenuDrawable.setIconState(MaterialMenuDrawable.IconState.BURGER);

        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.usrCommentNum, R.string.usrReportNum);
        drawerLayout.setDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        tabLayout = (TabLayout) findViewById(R.id.tablayout);
        viewPager = (ViewPager)findViewById(R.id.viewpager);
        mViewPagerAdapter = new Home_ViewpagerAdapter(this,getFragmentManager(), initFragment(),functionKeysName(),Default_functionKeysIcon());
        viewPager.setAdapter(mViewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
        initTabLayout(functionKeysName(), Default_functionKeysIcon(),Selected_functionKeysIcon());
    }

    private void initDrawlayout(){
        tv_drawer_item = (TextView) findViewById(R.id.tv_artical);
        tv_drawer_item = (TextView) findViewById(R.id.tv_song);
        tv_drawer_item = (TextView) findViewById(R.id.tv_newC);
        tv_drawer_item = (TextView) findViewById(R.id.tv_origin);
        tv_drawer_item = (TextView) findViewById(R.id.tv_tradition);
        tv_drawer_item = (TextView) findViewById(R.id.tv_time);
        tv_drawer_item = (TextView) findViewById(R.id.tv_space);
    }

    public void mClick(View view){
        Intent intent;
        switch (view.getId()) {
           case R.id.tv_artical:
               intent = new Intent(this, Other_Activity.class);
               intent.putExtra("title","聆听·文摘 1");
               startActivity(intent);
                break;

           case R.id.tv_song:
               intent = new Intent(this, Other_Activity.class);
               intent.putExtra("title","聆听·诗歌 2");
               startActivity(intent);
               break;

            case R.id.tv_origin:
                intent = new Intent(this, Other_Activity.class);
                intent.putExtra("title","聆听·原创 3");
                startActivity(intent);
                break;

            case R.id.tv_newC:
                intent = new Intent(this, Other_Activity.class);
                intent.putExtra("title","美食·新潮 4");
                startActivity(intent);
                break;

            case R.id.tv_tradition:
                intent = new Intent(this, Other_Activity.class);
                intent.putExtra("title","美食·传统 5");
                startActivity(intent);
                break;

            case R.id.tv_time:
                intent = new Intent(this, Other_Activity.class);
                intent.putExtra("title","旅行·时间 6");
                startActivity(intent);
                break;

            case R.id.tv_space:
                intent = new Intent(this, Other_Activity.class);
                intent.putExtra("title","旅行·空间 7");
                startActivity(intent);
                break;
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.searchbtn,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
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
                        tv_main_titile.setText("三条鱼");
                        break;
                    case 1:
                        iv.setImageResource(R.drawable.ic_selected_pressed);
                        tv_main_titile.setText("精选");
                        break;
                    case 2:
                        iv.setImageResource(R.drawable.ic_my_pressed);
                        tv_main_titile.setText("我的");
                        break;
                }

            }

            public void setUnTabSelected(TabLayout.Tab tab,int num){
                View view = tab.getCustomView();
                ImageView iv = (ImageView) view.findViewById(R.id.tabImage);
                switch (num){
                    case 0:
                        iv.setImageResource(R.drawable.ic_find);
                        tv_main_titile.setText("三条鱼");
                        break;
                    case 1:
                        iv.setImageResource(R.drawable.ic_selected);
                        tv_main_titile.setText("精选");
                        break;
                    case 2:
                        iv.setImageResource(R.drawable.ic_my);
                        tv_main_titile.setText("我的");
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


    private List<Fragment> initFragment(){
        fragmentList = new ArrayList<>();
        findFragment = new Home_Find_Fragment();
        fragmentList.add(findFragment);
        fragmentList.add(new Home_Selection_Fragment());
        fragmentList.add(new Home_My_Fragment());
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
