package com.android_threefishes.threefish.a3fish.Fragment;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.android_threefishes.threefish.a3fish.Adapter.SelectedCardAdapter;
import com.android_threefishes.threefish.a3fish.DetailActivity;
import com.android_threefishes.threefish.a3fish.Entity.CardInfEntity;
import com.android_threefishes.threefish.a3fish.R;
import com.view.jameson.library.CardScaleHelper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Home_Selection_Fragment extends Fragment {

    private List<CardInfEntity> list = new ArrayList<>();
    private CardInfEntity itemEnity;
    private CardScaleHelper mCardScaleHelper = null;
    private static String s = "当提起小竹桶时,清澈的水撒向远方,撒出记忆的藏宝图,我站在板凳上,看时针指引的正确方向,踏着水流向前方探险";
    private static String s1 = "#  听书  文学  青年文学  校园";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_selection, container, false);
        RecyclerView mRecycle = (RecyclerView) view.findViewById(R.id.recyclerView_selected);
        mRecycle.setHasFixedSize(true);
        LinearLayoutManager manager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        mRecycle.setLayoutManager(manager);
        init();
        setHasOptionsMenu(true);
        SelectedCardAdapter mAdapter = new SelectedCardAdapter(getActivity(),list);
        mRecycle.setAdapter(mAdapter);
        mAdapter.setOnItemClickListener(new SelectedCardAdapter.OnRecycleItemlistener() {
            @Override
            public void onItemClick(View view, int postion) {
                itemEnity = list.get(postion);
                Log.e("Onclickstate: ", itemEnity+"");
                Intent intent = new Intent(getActivity(), DetailActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("object",itemEnity);
                intent.putExtra("object", bundle);
                startActivity(intent);
            }
        });
        mCardScaleHelper = new CardScaleHelper();
        mCardScaleHelper.setCurrentItemPos(2);
        mCardScaleHelper.attachToRecyclerView(mRecycle);
        return view;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        menu.clear();
        inflater.inflate(R.menu.selectedmenu,menu);
        super.onCreateOptionsMenu(menu, inflater);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.selected_add){
            Intent intent = new Intent(getActivity(), Add_Activity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    private void init() {

        itemEnity = new CardInfEntity(R.drawable.selected1_1,R.drawable.selected1_1,getContentResource("content01"),"在写这篇书评之前我先请你们原谅我把它定义成少年心事里埋藏的一段故事，所以我读到的这个故事关于如何缄默来自成人世界的...",s1," 暂无评论",R.drawable.heardbig,R.drawable.ic_follow,R.raw.top,R.drawable.ic_listen_flag,"jeffery",R.drawable.icon_head);
        list.add(itemEnity);
        itemEnity = new CardInfEntity(R.drawable.selected2_1,R.drawable.selected2_1,getContentResource("content02"),"“我孤独是因为爱”，小王子为什么会孤独？\n" +
                "因为他对那朵玫瑰念念不忘。\n" +
                "念，念，不，忘。"
                ,s1," 暂无评论",R.drawable.heardbig,R.drawable.ic_follow,R.raw.middle,R.drawable.ic_listen_flag,"jeffery",R.drawable.icon_head);
        list.add(itemEnity);
        itemEnity = new CardInfEntity(R.drawable.selected3_1,R.drawable.selected3_1,getContentResource("content03"),"在地球里小王子遇见了一只狐狸，它告诉小王子人类的朋友关系需要去驯服。后来，他遇见遇见了一花园的玫瑰 \n“你们很美，但你们是空虚的。”",s1," 暂无评论",R.drawable.heardbig,R.drawable.ic_follow,R.raw.under,R.drawable.ic_listen_flag,"jeffery",R.drawable.icon_head);
        list.add(itemEnity);
        itemEnity = new CardInfEntity(R.drawable.seleted4_1,R.drawable.seleted4_1,getContentResource("content04"),"“原来你在这里” \n" + "“她把他当人来看待，在这片荒原上，这可是很稀罕的事情。灵魂都沉浸在自己消亡的悲伤中...",s1," 暂无评论",R.drawable.heardbig,R.drawable.ic_follow,R.raw.when,R.drawable.ic_listen_flag,"阡陌",R.drawable.icon_head);
        list.add(itemEnity);
        itemEnity = new CardInfEntity(R.drawable.selected5_1,R.drawable.selected5_1,getContentResource("content05"),"每至黄昏我便划一个句号作别，当清晨你再叩响门扉之时，便声声都是惊喜。\n翻开这本小书，像是翻开自己曾经的十六岁。烈日下难堪的挽留...",s1," 暂无评论",R.drawable.heardbig,R.drawable.ic_follow,0,R.drawable.ic_listen_flag,"梦玥",R.drawable.icon_head);
        list.add(itemEnity);
    }

    /**
     * 从assets文件中读取内容
     * @param filename
     * @return
     */
    private String getContentResource(String filename){
        String result = "";
        try {
            InputStreamReader reader = new InputStreamReader(getResources().getAssets().open(filename));
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line = "";
            while((line = bufferedReader.readLine()) != null){
                result += line+"\n";
            }
            return result;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
