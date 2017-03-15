package com.android_threefishes.threefish.a3fish;


import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.balysv.materialmenu.MaterialMenuDrawable;


/**
 * A simple {@link Fragment} subclass.
 */
public class NavigFragment extends Fragment {

    private MaterialMenuDrawable materialMenuDrawable;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_navig, container, false);
        Toolbar mbar = (Toolbar)view.findViewById(R.id.toolbar_navig);
        materialMenuDrawable = new MaterialMenuDrawable(getActivity(), Color.BLACK, MaterialMenuDrawable.Stroke.THIN);
        materialMenuDrawable.setIconState(MaterialMenuDrawable.IconState.ARROW);
        mbar.setNavigationIcon(materialMenuDrawable);
        mbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                materialMenuDrawable.animateIconState(MaterialMenuDrawable.IconState.BURGER);
                callback.navigFraOnclick(0);
            }
        });
        Log.e("here is done", "onclick");
        return view;
    }

    /**
     * 回调函数 Fragment和MainAcitvity之间
     */
    interface Callback_Navig{
        void navigFraOnclick(int num);
    }

    Callback_Navig callback;

    public void setCallback_Navig(Callback_Navig callbackNavig){
        this.callback = callbackNavig;
    }

}
