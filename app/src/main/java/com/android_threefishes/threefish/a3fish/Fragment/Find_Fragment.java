package com.android_threefishes.threefish.a3fish.Fragment;


import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android_threefishes.threefish.a3fish.Adapter.MyRecyAdaper;
import com.android_threefishes.threefish.a3fish.R;
import com.android_threefishes.threefish.a3fish.Untils;
import com.balysv.materialmenu.MaterialMenuDrawable;

import static android.util.TypedValue.COMPLEX_UNIT_SP;


/**
 *
 */
public class Find_Fragment extends Fragment {

    private MaterialMenuDrawable materialMenuDrawable;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_find, container, false);
        Toolbar toolbar= (Toolbar) view.findViewById(R.id.toolbar_find);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycleView_find);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        MyRecyAdaper adapter = new MyRecyAdaper(Untils.initDate(getActivity()), getActivity());
        //设置padding距离,讲sp转化为px
        int paddingnum = (int) TypedValue.applyDimension(COMPLEX_UNIT_SP,7, this.getResources().getDisplayMetrics());
        recyclerView.setPadding(paddingnum,paddingnum,paddingnum,paddingnum);
        recyclerView.addItemDecoration(new SpacesItemDecoration(paddingnum));
        recyclerView.setAdapter(adapter);

        materialMenuDrawable = new MaterialMenuDrawable(getActivity(), Color.BLACK, MaterialMenuDrawable.Stroke.THIN);
        materialMenuDrawable.setIconState(MaterialMenuDrawable.IconState.BURGER);
        toolbar.setNavigationIcon(materialMenuDrawable);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                materialMenuDrawable.animateIconState(MaterialMenuDrawable.IconState.ARROW);
                callback.findFraOnclick(1);
            }
        });
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
