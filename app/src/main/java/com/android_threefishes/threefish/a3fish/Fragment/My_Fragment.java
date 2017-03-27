package com.android_threefishes.threefish.a3fish.Fragment;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android_threefishes.threefish.a3fish.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class My_Fragment extends Fragment {


    public My_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my, container, false);
        return view;
    }



}
