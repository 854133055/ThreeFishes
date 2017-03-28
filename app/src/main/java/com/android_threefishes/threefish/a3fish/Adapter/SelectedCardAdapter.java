package com.android_threefishes.threefish.a3fish.Adapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.android_threefishes.threefish.a3fish.Entity.SelectedItemEntity;
import com.android_threefishes.threefish.a3fish.R;
import com.view.jameson.library.CardAdapterHelper;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by jameson on 8/30/16.
 */
public class SelectedCardAdapter extends RecyclerView.Adapter<SelectedCardAdapter.ViewHolder> {
    private List<SelectedItemEntity> mList = new ArrayList<>();
    private SelectedItemEntity mEntity;

    private CardAdapterHelper mCardAdapterHelper = new CardAdapterHelper();

    public SelectedCardAdapter(List<SelectedItemEntity> mList) {
        this.mList = mList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.frag_selection_carditem, parent, false);
        int width = mCardAdapterHelper.onCreateViewHolder(parent, itemView);
        ViewHolder holder = new ViewHolder(itemView);
        holder.getmImageView().getLayoutParams().height = (int)(width * 1.0);
        return holder;
    }
/**/
    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        mCardAdapterHelper.onBindViewHolder(holder.itemView, position, getItemCount());
        mEntity = mList.get(position);
        holder.mImageView.setImageResource(mEntity.getImagePath());
        holder.mTextView.setText(mEntity.getContent());
        holder.mTextView1.setText(mEntity.getFlags());
        holder.mIV_heart.setImageResource(R.drawable.heardbig);
        holder.mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return mList.size();
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
