package com.android_threefishes.threefish.a3fish.Fragment;


import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android_threefishes.threefish.a3fish.Adapter.MyRecyAdaper;
import com.android_threefishes.threefish.a3fish.DetailActivity;
import com.android_threefishes.threefish.a3fish.Entity.CardInfEntity;
import com.android_threefishes.threefish.a3fish.R;
import com.android_threefishes.threefish.a3fish.Untils;

import static android.util.TypedValue.COMPLEX_UNIT_SP;


/**
 *
 */
public class Home_Find_Fragment extends Fragment {

    private CardInfEntity mCardEntity;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_find, container, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycleView_find);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        MyRecyAdaper adapter = new MyRecyAdaper(Untils.initFindDate(getActivity()), getActivity());
        //设置padding距离,讲sp转化为px

        int paddingnum = (int) TypedValue.applyDimension(COMPLEX_UNIT_SP,5, this.getResources().getDisplayMetrics());

        recyclerView.setPadding(paddingnum,paddingnum,paddingnum,paddingnum);
        recyclerView.addItemDecoration(new SpacesItemDecoration(paddingnum));
        recyclerView.setAdapter(adapter);
        adapter.setOnItemClickListener(new MyRecyAdaper.OnRecycleItemlistener() {
            @Override
            public void onItemClick(View view, int postion) {
                mCardEntity = Untils.initFindDate(getActivity()).get(postion);
                Log.e("Onclickstate: ", mCardEntity+"");
                Intent intent = new Intent(getActivity(), DetailActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("object",mCardEntity);
                intent.putExtra("object", bundle);
                startActivity(intent);
            }
        });
        return view;
    }
}
