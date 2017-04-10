package com.android_threefishes.threefish.a3fish.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android_threefishes.threefish.a3fish.Entity.CardInfEntity;
import com.android_threefishes.threefish.a3fish.R;
import com.android_threefishes.threefish.a3fish.Untils;
import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Describe:  发现 Recycle Adapter
 */

public class MyRecyAdaper extends RecyclerView.Adapter<MyViewHolder> implements View.OnClickListener{

    private List<CardInfEntity> cardInfEntityList;
    private Context mContext;
    private CardInfEntity cardInfEntity;
    private int width;
    private int imageHeigh;
    private int cardViewHeigh;

    public MyRecyAdaper(List<CardInfEntity> cardInfEntityList, Context mContext) {
        this.cardInfEntityList = cardInfEntityList;
        this.mContext = mContext;
        //获取屏幕宽度,并计算出每栏的宽度
        this.width = Untils.getSrceenWidth(mContext) / 2 - 10;//14
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.recycle_carditem, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        view.setOnClickListener(this);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        cardInfEntity = cardInfEntityList.get(position);
        imageHeigh = (int) (cardInfEntity.getImageScale() * width +0.5f);
     //   cardViewHeigh = imageHeigh + 3*getDeviceLineHeigh(holder,cardInfEntity.getContentText(),width) + getTextViewHeigh(holder, cardInfEntity.getContentText(), width);


        //重新设置itemview的布局宽,不用设置长
        ViewGroup.LayoutParams mLayoutParams = holder.itemView.getLayoutParams();
        mLayoutParams.width = width;


        holder.itemView.setLayoutParams(mLayoutParams);
        holder.itemView.setTag(position);
      //  holder.getIv_background().setImageResource(cardInfEntity.getImgSmallbackPath());
        Glide.with(mContext).load(cardInfEntity.getImgSmallbackPath()).into(holder.getIv_background());
        holder.getTv_context().setText(cardInfEntity.getContentText());
        holder.getIv_fishes().setImageResource(R.drawable.heard3);
        holder.getCardView().setCardBackgroundColor(cardInfEntity.getCardBackColor());
        holder.getTv_number().setText(cardInfEntity.getFishNum()+"");
        holder.getTv_number().setTextColor(mContext.getResources().getColor(R.color.myBlue));
        holder.getTv_comments().setText(cardInfEntity.getCommentsNum()+"");
        holder.getTv_comments().setTextColor(mContext.getResources().getColor(R.color.myRed));
        holder.getIv_commentImg().setImageResource(R.drawable.comment);

    }

    @Override
    public int getItemCount() {
        return cardInfEntityList.size();
    }

    @Override
    public void onClick(View v) {
        if (onRecycleItemlistener != null){
            onRecycleItemlistener.onItemClick(v,(int)v.getTag());
        }
    }

    private OnRecycleItemlistener onRecycleItemlistener = null;

    public void setOnItemClickListener(OnRecycleItemlistener listener) {
        this.onRecycleItemlistener = listener;
    }


    public interface OnRecycleItemlistener{
        void onItemClick(View view, int postion);
    }

    /**
     * get TextView-other_content Heigh
     * @param holder
     * @param content
     * @param width
     * @return
     */
    public int getTextViewHeigh(MyViewHolder holder,String content,int width){
        TextPaint mpaint = holder.getTv_context().getPaint();
        StaticLayout mStaticlayout = new StaticLayout(content, mpaint, width, Layout.Alignment.ALIGN_NORMAL, 1.25f, 0,false);
        return mStaticlayout.getHeight();
    }

    public int getTextViewLines(MyViewHolder holder,String content,int width){
        TextPaint mpaint = holder.getTv_context().getPaint();
        StaticLayout mStaticlayout = new StaticLayout(content, mpaint, width, Layout.Alignment.ALIGN_NORMAL, 1.25f, 0,false);
        return mStaticlayout.getLineCount();
    }

    public int getDeviceLineHeigh(MyViewHolder holder,String content,int width){
        int lineHeight = getTextViewHeigh(holder, content, width);
        int lineCount = getTextViewLines(holder, content, width);
        return lineHeight / lineCount;

    }


}
