package com.android_threefishes.threefish.a3fish;

import android.content.Context;
import android.content.res.Resources;
import android.view.WindowManager;

import com.android_threefishes.threefish.a3fish.Entity.CardInfEntity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mml on 17-3-21.
 * Describe:
 */

public class Untils {
    /**
     * 获取屏幕宽度
     *
     * @param context
     * @return
     */
    public static int getSrceenWidth(Context context) {
        WindowManager vm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        int width = vm.getDefaultDisplay().getWidth();
        return width;
    }

    public static int dip2px(Context context, int dip) {
        float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dip * scale + .5f);
    }

    private static String getLongContentResource(Context context, String filename) {
        String result = "";
        try {
            InputStreamReader reader = new InputStreamReader(context.getResources().getAssets().open(filename));
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                result += line + "\n";
            }
            return result;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static String getJsonContentResource(Context context, String filename) {
        String result = "";
        try {
            InputStreamReader reader = new InputStreamReader(context.getResources().getAssets().open(filename));
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                result += line;
            }
            return result;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }


    public static List<CardInfEntity> initFindDate(Context context) {
        List<CardInfEntity> usrCardObjectlist;
        CardInfEntity mUserCard;

        usrCardObjectlist = new ArrayList<>();
        Resources mResource = context.getResources();

        mUserCard = new CardInfEntity(R.drawable.article02, R.drawable.article02, getLongContentResource(context, "other_content_article2"), "你根本说不清楚什么叫爱，什么叫恨的时候就是人生中的“纠缠”...", 2, 1.4719, mResource.getColor(R.color.white), 0,
                R.drawable.icon_head_2, "安稳随性 ", R.drawable.ic_follow, R.drawable.ic_follow, "#  文摘聆听  文学  情感  书评", "   暂无评论", R.drawable.heardbig);
        usrCardObjectlist.add(mUserCard);

        mUserCard = new CardInfEntity(R.drawable.origin3, R.drawable.origin3_1, getLongContentResource(context, "other_content_origin3"), "“别跟着我，小屁孩！”\n" +
                "“别赶我走，师父！”", 1, 1.336, mResource.getColor(R.color.white), 0,
                R.drawable.ichead_orgin3, "以薛之名谦你手", R.drawable.ic_follow, R.drawable.ic_follow, "#  原创聆听  影评", " 暂无评论", R.drawable.heardbig);
        usrCardObjectlist.add(mUserCard);

        mUserCard = new CardInfEntity(R.drawable.article3, R.drawable.article3_1, getLongContentResource(context, "other_content_article3"), "你是不是也和我一样，好久回去没看看老屋了。", 33, 1.325, mResource.getColor(R.color.white), 0,
                R.drawable.icon_head_3, "终年不遇", R.drawable.ic_follow, R.drawable.ic_follow, "#  文摘聆听  情感", "   暂无评论", R.drawable.heardbig);
        usrCardObjectlist.add(mUserCard);

        mUserCard = new CardInfEntity(R.drawable.tradition2, R.drawable.tradition2_1, getLongContentResource(context, "other_content_traditionfood2"), "好好珍惜只此一生的缘分，下辈子，无论爱或不爱，都不会再遇见。", 8, 1.0, mResource.getColor(R.color.white), 0,
                R.drawable.ichead_trad2, "爱吃肉的大碗君", R.drawable.ic_follow, R.drawable.ic_follow, "#  传统美食  情感", " 暂无评论", R.drawable.heardbig);
        usrCardObjectlist.add(mUserCard);

        mUserCard = new CardInfEntity(R.drawable.tradition4, R.drawable.tradition4_1, getLongContentResource(context, "other_content_traditionfood4"), "不时不食，步履不停。", 3, 1.03, mResource.getColor(R.color.white), 0,
                R.drawable.ichead_trad4, "带你吃遍全世界", R.drawable.ic_follow, R.drawable.ic_follow, "#  新潮美食  IN吃法", " 暂无评论", R.drawable.heardbig);
        usrCardObjectlist.add(mUserCard);

        mUserCard = new CardInfEntity(R.drawable.space2, R.drawable.space2_1, getLongContentResource(context, "other_content_travel2"), "“世界末日”，追寻祖国最北的星光\n" +
                "一路向北，去北方，去最北的北方。", 1, 1.5, mResource.getColor(R.color.white), 0,
                R.drawable.ichead_space2, "Galaxy Rover", R.drawable.ic_follow, R.drawable.ic_follow, "#  空间旅行  星空摄影", " 暂无评论", R.drawable.heardbig);
        usrCardObjectlist.add(mUserCard);

        mUserCard = new CardInfEntity(R.drawable.space3, R.drawable.space3_1, getLongContentResource(context, "other_content_travel3"), "月朦胧，鸟朦胧，帘卷海棠红", 2, 1.435, mResource.getColor(R.color.white), 0,
                R.drawable.ichead_space3, "温州流浪者", R.drawable.ic_follow, R.drawable.ic_follow, "#  时间旅行  情感  文学", " 暂无评论", R.drawable.heardbig);
        usrCardObjectlist.add(mUserCard);

        return usrCardObjectlist;
    }

    public static List<CardInfEntity> initArticleDate(Context context) {
        Resources mResource = context.getResources();
        List<CardInfEntity> usrCardObjectlist = new ArrayList<>();
        CardInfEntity mUserCard;

        mUserCard = new CardInfEntity(R.drawable.article1, R.drawable.article1_1, getLongContentResource(context, "other_content_article1"), "“情之所钟，虽丑不嫌。八窗尽落，清风徐来，纨扇罗衫，剖瓜解暑。夏月荷花除开时，晚含而晓放...", 6, 1.213, mResource.getColor(R.color.white), 2,
                R.drawable.icon_head_1, "虐人心", R.drawable.ic_follow, R.drawable.ic_follow, "#  文摘聆听  古文  校园文学  书评", "张秦峰：生活闲趣，有心者观之，古人能在常事中自得其乐，又将其书写的兴趣盎然。\n顏子樂：难得的恩爱眷侣，然而生活还是坎坷。虽然总是称快游，其实是四处飘零，苦中作乐而已。很美的文字，很好的生活态度！", R.drawable.heardbig);
        usrCardObjectlist.add(mUserCard);

        mUserCard = new CardInfEntity(R.drawable.article02, R.drawable.article02, getLongContentResource(context, "other_content_article2"), "你根本说不清楚什么叫爱，什么叫恨的时候就是人生中的“纠缠”...", 2, 1.4719, mResource.getColor(R.color.white), 0,
                R.drawable.icon_head_2, "安稳随性 ", R.drawable.ic_follow, R.drawable.ic_follow, "#  文摘聆听  文学  情感  书评", "   暂无评论", R.drawable.heardbig);
        usrCardObjectlist.add(mUserCard);

        mUserCard = new CardInfEntity(R.drawable.article3, R.drawable.article3_1, getLongContentResource(context, "other_content_article3"), "你是不是也和我一样，好久回去没看看老屋了。", 33, 1.325, mResource.getColor(R.color.white), 0,
                R.drawable.icon_head_3, "终年不遇", R.drawable.ic_follow, R.drawable.ic_follow, "#  文摘聆听  情感", "   暂无评论", R.drawable.heardbig);
        usrCardObjectlist.add(mUserCard);

        mUserCard = new CardInfEntity(R.drawable.article4, R.drawable.article4_1, getLongContentResource(context, "other_content_article4"), "我在冰封的深海，找寻希望的缺口。却在午夜惊醒时，蓦然瞥见绝美的月光。—— 几米", 8, 1.33, mResource.getColor(R.color.white), 0,
                R.drawable.icon_head_4, "花落成雨", R.drawable.ic_follow, R.drawable.ic_follow, "#  文摘聆听  书评  情感", "   暂无评论", R.drawable.heardbig);
        usrCardObjectlist.add(mUserCard);

        mUserCard = new CardInfEntity(R.drawable.article5, R.drawable.article5_1, getLongContentResource(context, "other_content_article5"), "一座城，一城山色，半城湖光，总有几分姿容，清浅于笔墨，安然于心中。生活得久了，便也习惯了繁星黎明，不息泉水。", 8, 1.7714, mResource.getColor(R.color.white), 0,
                R.drawable.icon_head_5, "黄昏时", R.drawable.ic_follow, R.drawable.ic_follow, "#  文摘聆听  文学", "   暂无评论", R.drawable.heardbig);
        usrCardObjectlist.add(mUserCard);

        return usrCardObjectlist;
    }

    public static List<CardInfEntity> initOriginDate(Context context) {
        Resources mResource = context.getResources();
        List<CardInfEntity> usrCardObjectlist = new ArrayList<>();
        CardInfEntity mUserCard;

        mUserCard = new CardInfEntity(R.drawable.origin1, R.drawable.origin1_1, getLongContentResource(context, "other_content_origin1"), "“荷西，我回来了，几个月前一袭黑衣离去，而今穿着彩衣回来...", 6, 1.4359, mResource.getColor(R.color.white), 0,
                R.drawable.ichead_origin1, "爱读书的鬼", R.drawable.ic_follow, R.drawable.ic_follow, "#  原创聆听  书评", " 暂无评论", R.drawable.heardbig);
        usrCardObjectlist.add(mUserCard);

        mUserCard = new CardInfEntity(R.drawable.origin2, R.drawable.orgin2_1, getLongContentResource(context, "other_content_origin2"), "整个故事，充满了错位—当他是至尊宝的时候，他没有法力救回自己的娘子；当紫霞爱他的时候，他爱500年后的娘子白晶晶...", 2, 1.4936, mResource.getColor(R.color.white), 0,
                R.drawable.ichead_origin2, "执", R.drawable.ic_follow, R.drawable.ic_follow, "#  原创聆听  影评  爱情", " 暂无评论", R.drawable.heardbig);
        usrCardObjectlist.add(mUserCard);

        mUserCard = new CardInfEntity(R.drawable.origin3, R.drawable.origin3_1, getLongContentResource(context, "other_content_origin3"), "“别跟着我，小屁孩！”\n" +
                "“别赶我走，师父！”", 1, 1.336, mResource.getColor(R.color.white), 0,
                R.drawable.ichead_orgin3, "以薛之名谦你手", R.drawable.ic_follow, R.drawable.ic_follow, "#  原创聆听  影评", " 暂无评论", R.drawable.heardbig);
        usrCardObjectlist.add(mUserCard);

        return usrCardObjectlist;
    }

    public static List<CardInfEntity> initFoodData(Context context){
        Resources mResource = context.getResources();
        List<CardInfEntity> usrCardObjectlist = new ArrayList<>();
        CardInfEntity mUserCard;

        mUserCard = new CardInfEntity(R.drawable.tradition_1, R.drawable.tradition1_1, getLongContentResource(context, "other_content_traditionfood1"), "进来喝点汤，暖暖胃吧", 2, 1.5, mResource.getColor(R.color.white), 0,
                R.drawable.ichead_trad1, "学会爱自己", R.drawable.ic_follow, R.drawable.ic_follow, "#  传统美食  情感", " 暂无评论", R.drawable.heardbig);
        usrCardObjectlist.add(mUserCard);

        mUserCard = new CardInfEntity(R.drawable.tradition2, R.drawable.tradition2_1, getLongContentResource(context, "other_content_traditionfood2"), "好好珍惜只此一生的缘分，下辈子，无论爱或不爱，都不会再遇见。", 8, 1.0, mResource.getColor(R.color.white), 0,
                R.drawable.ichead_trad2, "爱吃肉的大碗君", R.drawable.ic_follow, R.drawable.ic_follow, "#  传统美食  情感", " 暂无评论", R.drawable.heardbig);
        usrCardObjectlist.add(mUserCard);

        mUserCard = new CardInfEntity(R.drawable.tradition3, R.drawable.tradition3_1, getLongContentResource(context, "other_content_traditionfood3"), "两个人吃的是饭，一个人吃的是饲料。", 8, 2.08, mResource.getColor(R.color.white), 0,
                R.drawable.ichead_trad3, "Mato", R.drawable.ic_follow, R.drawable.ic_follow, "#  新潮美食  IN吃法  情感", " 暂无评论", R.drawable.heardbig);
        usrCardObjectlist.add(mUserCard);

        mUserCard = new CardInfEntity(R.drawable.tradition4, R.drawable.tradition4_1, getLongContentResource(context, "other_content_traditionfood4"), "不时不食，步履不停。", 3, 1.03, mResource.getColor(R.color.white), 0,
                R.drawable.ichead_trad4, "带你吃遍全世界", R.drawable.ic_follow, R.drawable.ic_follow, "#  新潮美食  IN吃法", " 暂无评论", R.drawable.heardbig);
        usrCardObjectlist.add(mUserCard);

        mUserCard = new CardInfEntity(R.drawable.tradition5, R.drawable.tradition5_1, getLongContentResource(context, "other_content_traditionfood5"), "每个食材，都是自然的一场奇迹。", 3, 1.03, mResource.getColor(R.color.white), 0,
                R.drawable.ichead_trad5, "土豆爱白菜", R.drawable.ic_follow, R.drawable.ic_follow, "#  新潮美食  IN吃法  IN食材", " 暂无评论", R.drawable.heardbig);
        usrCardObjectlist.add(mUserCard);


        return usrCardObjectlist;
    }

    public static List<CardInfEntity> initTraveling(Context context){
        Resources mResource = context.getResources();
        List<CardInfEntity> usrCardObjectlist = new ArrayList<>();
        CardInfEntity mUserCard;

        mUserCard = new CardInfEntity(R.drawable.space1, R.drawable.space1, getLongContentResource(context, "other_content_travel1"), "兰州想像出来的城市\n" +
                "兰州是另一座被想象出来的城市，总是生活在别处。\n" +
                "黄河的水不停地流 ", 2, 1.342, mResource.getColor(R.color.white), 0,
                R.drawable.ichead_space1, "景琦", R.drawable.ic_follow, R.drawable.ic_follow, "#  空间旅行  情感  原创", " 暂无评论", R.drawable.heardbig);
        usrCardObjectlist.add(mUserCard);

        mUserCard = new CardInfEntity(R.drawable.space2, R.drawable.space2_1, getLongContentResource(context, "other_content_travel2"), "“世界末日”，追寻祖国最北的星光\n" +
                "一路向北，去北方，去最北的北方。", 1, 1.5, mResource.getColor(R.color.white), 0,
                R.drawable.ichead_space2, "Galaxy Rover", R.drawable.ic_follow, R.drawable.ic_follow, "#  空间旅行  星空摄影", " 暂无评论", R.drawable.heardbig);
        usrCardObjectlist.add(mUserCard);

        mUserCard = new CardInfEntity(R.drawable.space3, R.drawable.space3_1, getLongContentResource(context, "other_content_travel3"), "月朦胧，鸟朦胧，帘卷海棠红", 2, 1.435, mResource.getColor(R.color.white), 0,
                R.drawable.ichead_space3, "温州流浪者", R.drawable.ic_follow, R.drawable.ic_follow, "#  时间旅行  情感  文学", " 暂无评论", R.drawable.heardbig);
        usrCardObjectlist.add(mUserCard);

        return usrCardObjectlist;
    }





}
