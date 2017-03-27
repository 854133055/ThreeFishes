package com.android_threefishes.threefish.a3fish;

import android.content.Context;
import android.view.WindowManager;

import com.android_threefishes.threefish.a3fish.Entity.CardInfEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mml on 17-3-21.
 * Describe:
 */

public class Untils {
    /**
     * 获取屏幕宽度
     * @param context
     * @return
     */
    public static int getSrceenWidth(Context context){
        WindowManager vm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        int width = vm.getDefaultDisplay().getWidth();
        return width;
    }

    public static int dip2px(Context context,int dip) {
        float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dip * scale + .5f);
    }


    public static List<CardInfEntity> initDate(Context mcontext){
        List<CardInfEntity> usrCardObjectlist;
        CardInfEntity mUserCard;
        String content = "桃花灼灼，树叶溱溱，妖娆伤眼。\n记忆可以封存，可心有时也会背叛，忘得了前世情缘,忘不了桃林十里，亦忘不了十里桃林中玄衣的少年。";
        String content_short = "桃花灼灼，树叶记忆可以";
        String content_short3 = "桃花灼灼，树叶记忆可以封存，可心有时时也时也";
        String content_short2 = "桃花灼灼，树叶溱溱，妖娆伤眼。记忆可以封存，可心有时也会背叛，忘得了前";
        usrCardObjectlist = new ArrayList<>();
        mUserCard = new CardInfEntity(R.drawable.iv01,content,33,1.4128,mcontext.getResources().getColor(R.color.white),11);
        usrCardObjectlist.add(mUserCard);
        mUserCard = new CardInfEntity(R.drawable.meizhi004,content_short,99,1,mcontext.getResources().getColor(R.color.white),11);
        usrCardObjectlist.add(mUserCard);
        mUserCard = new CardInfEntity(R.drawable.meizhi004, content_short2,  99, 1, mcontext.getResources().getColor(R.color.white),11);
        usrCardObjectlist.add(mUserCard);
        mUserCard = new CardInfEntity(R.drawable.iv01,content_short3,99,1.4128,mcontext.getResources().getColor(R.color.white),11);
        usrCardObjectlist.add(mUserCard);
        mUserCard = new CardInfEntity(R.drawable.iv01,content,23,1.4128,mcontext.getResources().getColor(R.color.white),11);
        usrCardObjectlist.add(mUserCard);
        mUserCard = new CardInfEntity(R.drawable.meizhi004,content_short3,99,1,mcontext.getResources().getColor(R.color.white),11);
        usrCardObjectlist.add(mUserCard);
        mUserCard = new CardInfEntity(R.drawable.iv01,content,99,1.4128,mcontext.getResources().getColor(R.color.white),11);
        usrCardObjectlist.add(mUserCard);
        return usrCardObjectlist;
    }
}
