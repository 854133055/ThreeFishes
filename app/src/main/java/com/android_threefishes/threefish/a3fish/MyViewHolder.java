package com.android_threefishes.threefish.a3fish;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Describe:
 *
 */

public class MyViewHolder extends RecyclerView.ViewHolder {

    private ImageView iv_background;
    private TextView tv_context;
    private ImageView iv_fishes;
    private TextView tv_number;
    private CardView cardView;

    public MyViewHolder(View itemView) {
        super(itemView);
        iv_background = (ImageView) itemView.findViewById(R.id.iv_background);
        tv_context = (TextView) itemView.findViewById(R.id.tv_context);
        iv_fishes = (ImageView) itemView.findViewById(R.id.iv_fishes);
        tv_number = (TextView) itemView.findViewById(R.id.tv_num);
        cardView = (CardView) itemView.findViewById(R.id.cardview_item);
    }

    public ImageView getIv_background() {
        return iv_background;
    }

    public TextView getTv_context() {
        return tv_context;
    }

    public ImageView getIv_fishes() {
        return iv_fishes;
    }

    public TextView getTv_number() {
        return tv_number;
    }

    public CardView getCardView() {
        return cardView;
    }
}
