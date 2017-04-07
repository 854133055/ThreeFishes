package com.android_threefishes.threefish.a3fish.Adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.android_threefishes.threefish.a3fish.Entity.CardInfEntity;
import com.android_threefishes.threefish.a3fish.R;
import com.bumptech.glide.Glide;
import com.view.jameson.library.CardAdapterHelper;

import java.util.ArrayList;
import java.util.List;


/**
 * 精选 RecycleView Adapter
 */
public class SelectedCardAdapter extends RecyclerView.Adapter<SelectedCardAdapter.ViewHolder> implements View.OnClickListener{
    private List<CardInfEntity> mList = new ArrayList<>();
    private CardInfEntity mEntity;
    private Context mContext;

    private CardAdapterHelper mCardAdapterHelper = new CardAdapterHelper();

    public SelectedCardAdapter(Context mContext,List<CardInfEntity> mList) {
        this.mContext = mContext;
        this.mList = mList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.frag_selection_carditem, parent, false);
        int width = mCardAdapterHelper.onCreateViewHolder(parent, itemView);
        itemView.setOnClickListener(this);
        ViewHolder holder = new ViewHolder(itemView);
        holder.getmImageView().getLayoutParams().height = (int)(width * 0.9);//1.0
        return holder;
    }


    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        mCardAdapterHelper.onBindViewHolder(holder.itemView, position, getItemCount());
        mEntity = mList.get(position);
        holder.itemView.setTag(position);
     //   holder.mImageView.setImageResource(mEntity.getImgSmallbackPath());
        Glide.with(mContext).load(mEntity.getImgSmallbackPath()).into(holder.mImageView);
        holder.mTextView.setText(mEntity.getContentText());
        holder.mTextView1.setText(mEntity.getFlags());
     //   holder.mIV_heart.setImageResource(R.drawable.heardbig);
        Glide.with(mContext).load(R.drawable.heardbig).into(holder.mIV_heart);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    @Override
    public void onClick(View v) {
        if (onRecycleItemlistener != null){
            onRecycleItemlistener.onItemClick(v,(int)(v.getTag()));
        }
    }

    private OnRecycleItemlistener onRecycleItemlistener = null;

    public void setOnItemClickListener(OnRecycleItemlistener listener) {
        this.onRecycleItemlistener = listener;
    }


    public static interface OnRecycleItemlistener{
        void onItemClick(View view, int postion);
    }


    class ViewHolder extends RecyclerView.ViewHolder {

        public final ImageView mImageView;
        public final TextView mTextView;
        public final TextView mTextView1;
        public final ImageView mIV_heart;
        public final CardView mCardView;
      //  public final ImageView mIV_listenflag;

        public ViewHolder(final View itemView) {
            super(itemView);
            mImageView = (ImageView) itemView.findViewById(R.id.imageView);
            mTextView = (TextView) itemView.findViewById(R.id.selected_tv_content);
            mTextView1 = (TextView) itemView.findViewById(R.id.selected_tv_flags);
            mIV_heart = (ImageView) itemView.findViewById(R.id.selected_iv_heartbig);
            mCardView = (CardView) itemView.findViewById(R.id.selected_cardView);
           // mIV_listenflag = (ImageView) itemView.findViewById(R.id.listenflag);
        }

        public ImageView getmImageView() {
            return mImageView;
        }
    }

}
