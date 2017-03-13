package com.android_threefishes.threefish.a3fish;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.balysv.materialmenu.MaterialMenuDrawable;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private List<Fragment> fragmentList;
    private TabLayout.Tab myTab;
    private Toolbar mbar;
    private TextView textView;
    private MaterialMenuDrawable materialMenuDrawable;
    private MaterialMenuDrawable.AnimationState mAnimationState;
    private int iconStates = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initToolbar();
        initView();
    }

    private void initView(){
        tabLayout = (TabLayout) findViewById(R.id.tablayout);
        viewPager = (ViewPager)findViewById(R.id.viewpager);
        viewPager.setAdapter(new Home_ViewpagerAdapter
                (getFragmentManager(),initFragmentlist()));
        tabLayout.setupWithViewPager(viewPager);
        initTabLayout(functionKeysName(), Default_functionKeysIcon(),Selected_functionKeysIcon());

    }

    private void initToolbar(){
        textView = (TextView) findViewById(R.id.title_text);
        mbar = (Toolbar) findViewById(R.id.toolbar);
        mbar.setTitle("");
        mbar.inflateMenu(R.menu.searchbtn);
        toolbarIconEvent();
        mbar.setNavigationIcon(materialMenuDrawable);
        mbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if (item.getItemId() == R.id.search_btn){
                    Toast.makeText(MainActivity.this,"搜素图标",Toast.LENGTH_LONG).show();
                }
                return true;
            }
        });
    }

    /**
     * NavigationIcon的变化动画与处理,存疑?
     */
    private void toolbarIconEvent(){
        materialMenuDrawable = new MaterialMenuDrawable
                (this, Color.BLACK, MaterialMenuDrawable.Stroke.THIN);
        //mAnimationState = MaterialMenuDrawable.AnimationState.BURGER_ARROW;
        materialMenuDrawable.animateIconState(MaterialMenuDrawable.IconState.BURGER);
        mbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //      materialMenuDrawable.setTransformationOffset(mAnimationState, 1);
                switch (iconStates){
                    case 1:
                        materialMenuDrawable.animateIconState(MaterialMenuDrawable.IconState.BURGER);
                        iconStates = 0;
                        break;
                    case 0:
                        materialMenuDrawable.animateIconState(MaterialMenuDrawable.IconState.ARROW);
                        iconStates = 1;
                        break;
                }
            }
        });

    }



    /**
     * for循环设定tab的icon,name
     * @param nameArray 导航tab名称
     * @param D_iconArray 导航tablayout默认icon数组
     * @param C_iconArray 导航tablayout被选中icon数组
     */
    public void initTabLayout(String[] nameArray,final int[] D_iconArray,final int C_iconArray[]){

        for (int i = 0;i < nameArray.length;i++){
            myTab = tabLayout.newTab();
            myTab = tabLayout.getTabAt(i);
            myTab.setText(nameArray[i]).setIcon(D_iconArray[i]);
        }

        //创建tab对象,并需要为每个tab指定specified index, 点击时通过tablayout.getPosition获取位置,
        //存疑:getPosition取得的值是否为specified index??
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                tabLayout.getTabAt(tab.getPosition()).setIcon(C_iconArray[tab.getPosition()]);
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                tabLayout.getTabAt(tab.getPosition()).setIcon(D_iconArray[tab.getPosition()]);
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    private List<Fragment> initFragmentlist(){
        fragmentList = new ArrayList<Fragment>();
        fragmentList.add(new Find_Fragment());
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
        return new int[]{R.drawable.find_black_24dp, R.drawable.select_black,R.drawable.my_black};
    }

    /**
     * @return 底部导航被选中icon数组
     */
    private int[] Selected_functionKeysIcon(){
        return new int[]{R.drawable.find_origen_24dp, R.drawable.select_orig,R.drawable.my_orig};
    }

}
