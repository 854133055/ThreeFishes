package com.android_threefishes.threefish.a3fish.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android_threefishes.threefish.a3fish.Adapter.SelectedCardAdapter;
import com.android_threefishes.threefish.a3fish.Entity.SelectedItemEntity;
import com.android_threefishes.threefish.a3fish.R;
import com.view.jameson.library.CardScaleHelper;

import java.util.ArrayList;
import java.util.List;


public class Selection_Fragment extends Fragment {

    private List<SelectedItemEntity> list = new ArrayList<>();
    private SelectedItemEntity itemEnity;
    private CardScaleHelper mCardScaleHelper = null;
    private static String s = "当提起小竹桶时,清澈的水撒向远方,撒出记忆的藏宝图,我站在板凳上,看时针指引的正确方向,踏着水流向前方探险";
    private static String s1 = "#  听书  文学  青年文学  校园";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_selection, container, false);
        RecyclerView mRecycle = (RecyclerView) view.findViewById(R.id.recyclerView_selected);
        LinearLayoutManager manager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        mRecycle.setLayoutManager(manager);
        init();
        mRecycle.setAdapter(new SelectedCardAdapter(list));
        mCardScaleHelper = new CardScaleHelper();
        mCardScaleHelper.setCurrentItemPos(2);
        mCardScaleHelper.attachToRecyclerView(mRecycle);
        return view;
    }

    private void init() {
  /*      itemEnity = new SelectedItemEntity(R.drawable.listen01,s1,s,true);
        list.add(itemEnity);*/
        itemEnity = new SelectedItemEntity(R.drawable.fishpicture,s1,s,false);
        list.add(itemEnity);
        itemEnity = new SelectedItemEntity(R.drawable.fishpicture,s1,s,false);
        list.add(itemEnity);
        itemEnity = new SelectedItemEntity(R.drawable.fishpicture,s1,s,false);
        list.add(itemEnity);
        itemEnity = new SelectedItemEntity(R.drawable.fishpicture,s1,s,true);
        list.add(itemEnity);
        itemEnity = new SelectedItemEntity(R.drawable.fishpicture,s1,s,false);
        list.add(itemEnity);
       /* itemEnity = new SelectedItemEntity(R.drawable.listen10,s1,s,false);
        list.add(itemEnity);
        itemEnity = new SelectedItemEntity(R.drawable.listen11,s1,s,false);
        list.add(itemEnity);
        itemEnity = new SelectedItemEntity(R.drawable.listen13,s1,s,true);
        list.add(itemEnity);
        itemEnity = new SelectedItemEntity(R.drawable.listen14,s1,s,false);
        list.add(itemEnity);
        itemEnity = new SelectedItemEntity(R.drawable.listen16,s1,s,false);
        list.add(itemEnity);
        itemEnity = new SelectedItemEntity(R.drawable.listen18,s1,s,true);
        list.add(itemEnity);*/
    }



}
