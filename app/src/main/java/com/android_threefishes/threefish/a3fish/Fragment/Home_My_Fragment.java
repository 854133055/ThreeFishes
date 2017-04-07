package com.android_threefishes.threefish.a3fish.Fragment;


import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android_threefishes.threefish.a3fish.MyAccount_Activity;
import com.android_threefishes.threefish.a3fish.R;
import com.android_threefishes.threefish.a3fish.Setting_Activity;


/**
 * A simple {@link Fragment} subclass.
 */
public class Home_My_Fragment extends Fragment implements View.OnClickListener{


    public Home_My_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my, container, false);
        initView(view);
        setHasOptionsMenu(true);
        return view;
    }

    private void initView(View view ) {
        TextView tv_usr = (TextView) view.findViewById(R.id.tv_my_myAcount);
        tv_usr.setOnClickListener(this);
        TextView tv_msg = (TextView) view.findViewById(R.id.tv_my_collect);
        tv_msg.setOnClickListener(this);
        TextView tv_yinsi = (TextView) view.findViewById(R.id.tv_my_settings);
        tv_yinsi.setOnClickListener(this);
        TextView tv_tongyong = (TextView) view.findViewById(R.id.tv_my_complain);
        tv_yinsi.setOnClickListener(this);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        menu.clear();
        super.onCreateOptionsMenu(null, inflater);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.tv_my_myAcount:
                Intent intent1 = new Intent(getActivity(), MyAccount_Activity.class);
                startActivity(intent1);
                break;
            case R.id.tv_my_settings:
                Intent intent2 = new Intent(getActivity(), Setting_Activity.class);
                startActivity(intent2);
                break;
        }

    }
}
