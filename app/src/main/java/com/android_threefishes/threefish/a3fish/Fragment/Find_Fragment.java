package com.android_threefishes.threefish.a3fish.Fragment;


import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android_threefishes.threefish.a3fish.Adapter.MyRecyAdaper;
import com.android_threefishes.threefish.a3fish.R;
import com.android_threefishes.threefish.a3fish.Untils;

import static android.util.TypedValue.COMPLEX_UNIT_SP;


/**
 *
 */
public class Find_Fragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_find, container, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycleView_find);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        MyRecyAdaper adapter = new MyRecyAdaper(Untils.initDate(getActivity()), getActivity());
        //设置padding距离,讲sp转化为px
        int paddingnum = (int) TypedValue.applyDimension(COMPLEX_UNIT_SP,7, this.getResources().getDisplayMetrics());
        recyclerView.setPadding(paddingnum,paddingnum,paddingnum,paddingnum);
        recyclerView.addItemDecoration(new SpacesItemDecoration(paddingnum));
        recyclerView.setAdapter(adapter);
        return view;
    }


    /**
     * 回调函数 Fragment和MainAcitvity之间
     */
    public interface Callback_Find{
        void findFraOnclick(int num);
    }

    Callback_Find callback;

    public void setCallback_find(Callback_Find callbackfind){
        this.callback = callbackfind;
    }

}
