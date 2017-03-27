package com.android_threefishes.threefish.a3fish.Adapter;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.support.v13.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.android_threefishes.threefish.a3fish.R;

import java.util.List;


/**
 * Created by mml on 17-3-12.
 * Describe: 首页底部功能导航Viewpager Adapter
 */

public class Home_ViewpagerAdapter extends FragmentPagerAdapter {


    private List<Fragment> fragmentList;
  //  private boolean[] tagArray;
    private FragmentManager fm;
    private String[] mnameArray;
    private Context mContext;
    private int[] mIconArray;


    public Home_ViewpagerAdapter(Context context,FragmentManager fm, List<Fragment> fragmentList, String[] nameArray,int[] iconArray) {
        super(fm);
        this.fragmentList = fragmentList;
        this.fm = fm;
       // this.tagArray = mtagArray;
        this.mnameArray = nameArray;
        this.mContext = context;
        this.mIconArray = iconArray;
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
    public CharSequence getPageTitle(int position) {
        return mnameArray[position];
    }

    public View getTabView(int position){
        View view = LayoutInflater.from(mContext).inflate(R.layout.tab_layout, null);
        ImageView img = (ImageView)view.findViewById(R.id.tabImage);
        TextView tv = (TextView) view.findViewById(R.id.tabTv);
        img.setImageResource(mIconArray[position]);
        tv.setText(mnameArray[position]);
        return view;
    }


    /**
     * 动态替换Fragment
     * @param container
     * @param position
     * @return
     */
   /* @Override
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

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }*/
}
