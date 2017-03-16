package com.android_threefishes.threefish.a3fish.Fragment;


import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android_threefishes.threefish.a3fish.R;
import com.balysv.materialmenu.MaterialMenuDrawable;


/**
 *
 */
public class Find_Fragment extends Fragment {

    private MaterialMenuDrawable materialMenuDrawable;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_find, container, false);
        Toolbar toolbar= (Toolbar) view.findViewById(R.id.toolbar_find);
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
