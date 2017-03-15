package com.android_threefishes.threefish.a3fish;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class Selection_Fragment extends Fragment {

    public Selection_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_selection, container, false);
        Toolbar toolbar= (Toolbar) view.findViewById(R.id.toolbar_find);
        return view;
    }


}
