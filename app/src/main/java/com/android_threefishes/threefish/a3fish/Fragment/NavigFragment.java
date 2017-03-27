package com.android_threefishes.threefish.a3fish.Fragment;


import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android_threefishes.threefish.a3fish.Adapter.Navig_VIewpagerAdapter;
import com.android_threefishes.threefish.a3fish.R;
import com.balysv.materialmenu.MaterialMenuDrawable;

import java.util.ArrayList;
import java.util.List;


/**
 *
 */
public class NavigFragment extends Fragment {

    private MaterialMenuDrawable materialMenuDrawable;
    private List<Fragment> fragmentList;
    private ViewPager mViewpager;
    private TextView tv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_navig, container, false);
        mViewpager = (ViewPager) view.findViewById(R.id.navigViewpager);
        materialMenuDrawable = new MaterialMenuDrawable(getActivity(), Color.BLACK, MaterialMenuDrawable.Stroke.THIN);
        materialMenuDrawable.setIconState(MaterialMenuDrawable.IconState.ARROW);

        initFragmentList();
        Navig_VIewpagerAdapter mViewAdapter = new Navig_VIewpagerAdapter(getFragmentManager(),fragmentList);
        mViewpager.setAdapter(mViewAdapter);
        return view;
    }

    private void initFragmentList(){
        fragmentList = new ArrayList<>();
        fragmentList.add(new Listener_Fragment());
        fragmentList.add(new Eat_Fragment());
        fragmentList.add(new Play_Fragment());
    }


    /**
     * 回调函数 Fragment和MainAcitvity之间
     */
    public interface Callback_Navig{
        void navigFraOnclick(int num);
    }

    Callback_Navig callback;

    public void setCallback_Navig(Callback_Navig callbackNavig){
        this.callback = callbackNavig;
    }

}
