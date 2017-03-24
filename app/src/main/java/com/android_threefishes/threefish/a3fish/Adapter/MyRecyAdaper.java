package com.android_threefishes.threefish.a3fish.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android_threefishes.threefish.a3fish.Entity.CardInfEntity;
import com.android_threefishes.threefish.a3fish.MyViewHolder;
import com.android_threefishes.threefish.a3fish.R;
import com.android_threefishes.threefish.a3fish.Untils;

import java.util.List;

/**
 * Describe: Recycle Adapter
 */

public class MyRecyAdaper extends RecyclerView.Adapter<MyViewHolder> {

    private List<CardInfEntity> cardInfEntityList;
    private Context mContext;
    private CardInfEntity cardInfEntity;

    public MyRecyAdaper(List<CardInfEntity> cardInfEntityList, Context mContext) {
        this.cardInfEntityList = cardInfEntityList;
        this.mContext = mContext;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.recycle_carditem, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        cardInfEntity = cardInfEntityList.get(position);
        int srceenWidth = Untils.getSrceenWidth(mContext);
        int width = srceenWidth/2 - 14;
        int imageHeigh = (int) (cardInfEntityList.get(position).getImageScale() * width +0.5f);
        int allHeigh = imageHeigh + 3*getDeviceLineHeigh(holder,cardInfEntity.getContentText(),width) + getTextViewHeigh(holder, cardInfEntity.getContentText(), width);
        Log.e("get date", "width: " + width + " imageHeigh: " + imageHeigh + " TextViewheigh: " + getTextViewHeigh(holder, cardInfEntityList.get(position).getContentText(),width) + " allHeigh: " + allHeigh);
        Log.e("textviewline", getTextViewLines(holder, cardInfEntityList.get(position).getContentText(), width)+"");
        ViewGroup.LayoutParams mLayoutParams = holder.itemView.getLayoutParams();
        mLayoutParams.width = width;
        mLayoutParams.height = allHeigh;


        holder.itemView.setLayoutParams(mLayoutParams);

        holder.getIv_background().setImageResource(cardInfEntityList.get(position).getUsrImgPath());
        holder.getTv_context().setText(cardInfEntityList.get(position).getContentText());
        holder.getIv_fishes().setImageResource(cardInfEntityList.get(position).getFishPath());
        int color = cardInfEntityList.get(position).getCardBackColor();
        holder.getCardView().setCardBackgroundColor(cardInfEntityList.get(position).getCardBackColor());
        //   holder.getTv_number().setText(cardInfEntityList.get(position).getFishNum());

    }

    @Override
    public int getItemCount() {
        return cardInfEntityList.size();
    }

    /**
     * get TextView-content Heigh
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
