package com.android_threefishes.threefish.a3fish.Fragment;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by mml on 17-3-24.
 * Describe:
 */

public class SpacesItemDecoration extends RecyclerView.ItemDecoration {

    private int space;

    public SpacesItemDecoration(int space) {
        this.space=space;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        outRect.left=space;
        outRect.right=space;
        outRect.bottom=space;
        //注释这两行是为了上下间距相同
//        if(parent.getChildAdapterPosition(view)==0){
        outRect.top=space;
//        }
    }
}
