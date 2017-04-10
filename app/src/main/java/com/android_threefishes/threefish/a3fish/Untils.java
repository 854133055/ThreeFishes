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
                R.drawable.icon_head_2, "安稳随性 ", R.drawable.listen, R.drawable.ic_follow, "#  文摘聆听  文学  情感  书评", "   暂无评论", R.drawable.heard22);
        usrCardObjectlist.add(mUserCard);

        mUserCard = new CardInfEntity(R.drawable.origin3, R.drawable.origin3_1, getLongContentResource(context, "other_content_origin3"), "“别跟着我，小屁孩！”\n" +
                "“别赶我走，师父！”", 1, 1.336, mResource.getColor(R.color.white), 0,
                R.drawable.ichead_orgin3, "以薛之名谦你手", R.drawable.listen, R.drawable.ic_follow, "#  原创聆听  影评", " 暂无评论", R.drawable.heard22);
        usrCardObjectlist.add(mUserCard);

        mUserCard = new CardInfEntity(R.drawable.article3, R.drawable.article3_1, getLongContentResource(context, "other_content_article3"), "你是不是也和我一样，好久回去没看看老屋了。", 33, 1.325, mResource.getColor(R.color.white), 0,
                R.drawable.icon_head_3, "终年不遇", R.drawable.listen, R.drawable.ic_follow, "#  文摘聆听  情感", "   暂无评论", R.drawable.heard22);
        usrCardObjectlist.add(mUserCard);

        mUserCard = new CardInfEntity(R.drawable.space4, R.drawable.space4_1, getLongContentResource(context, "other_content_space4"), "是卢瑟恩，还是Luzern\n" +
                "是琉森吧 更多的人还是喜欢琉森这个梦幻十足的名字\n" +
                "这座人口只有7 万的小镇地处瑞士中部的高原地区，拉丁文意为“光”，即光城。", 1, 1.46, mResource.getColor(R.color.white), 0,
                R.drawable.ichead_space4, "薄荷蓝", R.drawable.play, R.drawable.ic_follow, "#  空间旅行", " 暂无评论", R.drawable.heard22);
        usrCardObjectlist.add(mUserCard);

        mUserCard = new CardInfEntity(R.drawable.newfood4, R.drawable.newfood4_1, getLongContentResource(context, "other_content_traditionfood4"), "不时不食，步履不停。", 3, 1.03, mResource.getColor(R.color.white), 0,
                R.drawable.ichead_trad4, "带你吃遍全世界", R.drawable.eat, R.drawable.ic_follow, "#  新潮美食  IN吃法", " 暂无评论", R.drawable.heard22);
        usrCardObjectlist.add(mUserCard);

        mUserCard = new CardInfEntity(R.drawable.space5, R.drawable.space5_1, getLongContentResource(context, "other_content_space5"), "我已记不清我在长沙\n" +
                "生活了几个年头了\n" +
                "大概和长沙的名字一样\n" +
                "漫长如漏斗里来回的流沙", 1, 1.33, mResource.getColor(R.color.white), 0,
                R.drawable.ichead_space5, "老板，来三斤龙虾", R.drawable.play, R.drawable.ic_follow, "#  空间旅行  人文", " 暂无评论", R.drawable.heard22);
        usrCardObjectlist.add(mUserCard);

        mUserCard = new CardInfEntity(R.drawable.space2, R.drawable.space2_1, getLongContentResource(context, "other_content_travel2"), "“世界末日”，追寻祖国最北的星光\n" +
                "一路向北，去北方，去最北的北方。", 1, 1.5, mResource.getColor(R.color.white), 0,
                R.drawable.ichead_space2, "Galaxy Rover", R.drawable.play, R.drawable.ic_follow, "#  空间旅行  星空摄影", " 暂无评论", R.drawable.heard22);
        usrCardObjectlist.add(mUserCard);

        mUserCard = new CardInfEntity(R.drawable.time1, R.drawable.time1_1, getLongContentResource(context, "other_content_travel3"), "月朦胧，鸟朦胧，帘卷海棠红", 2, 1.435, mResource.getColor(R.color.white), 0,
                R.drawable.ichead_time1, "温州流浪者", R.drawable.play, R.drawable.ic_follow, "#  时间旅行  情感  文学", " 暂无评论", R.drawable.heard22);
        usrCardObjectlist.add(mUserCard);

        return usrCardObjectlist;
    }

    public static List<CardInfEntity> initArticleDate(Context context) {
        Resources mResource = context.getResources();
        List<CardInfEntity> usrCardObjectlist = new ArrayList<>();
        CardInfEntity mUserCard;

        mUserCard = new CardInfEntity(R.drawable.article1, R.drawable.article1_1, getLongContentResource(context, "other_content_article1"), "“情之所钟，虽丑不嫌。八窗尽落，清风徐来，纨扇罗衫，剖瓜解暑。夏月荷花除开时，晚含而晓放...", 6, 1.213, mResource.getColor(R.color.white), 2,
                R.drawable.icon_head_1, "虐人心", R.drawable.listen, R.drawable.ic_follow, "#  文摘聆听  古文  校园文学  书评", "张秦峰：生活闲趣，有心者观之，古人能在常事中自得其乐，又将其书写的兴趣盎然。\n顏子樂：难得的恩爱眷侣，然而生活还是坎坷。虽然总是称快游，其实是四处飘零，苦中作乐而已。很美的文字，很好的生活态度！", R.drawable.heard22,1);
        usrCardObjectlist.add(mUserCard);

        mUserCard = new CardInfEntity(R.drawable.article02, R.drawable.article02, getLongContentResource(context, "other_content_article2"), "你根本说不清楚什么叫爱，什么叫恨的时候就是人生中的“纠缠”...", 2, 1.4719, mResource.getColor(R.color.white), 0,
                R.drawable.icon_head_2, "安稳随性 ", R.drawable.listen, R.drawable.ic_follow, "#  文摘聆听  文学  情感  书评", "   暂无评论", R.drawable.heard22,1);
        usrCardObjectlist.add(mUserCard);

        mUserCard = new CardInfEntity(R.drawable.article3, R.drawable.article3_1, getLongContentResource(context, "other_content_article3"), "你是不是也和我一样，好久回去没看看老屋了。", 33, 1.325, mResource.getColor(R.color.white), 0,
                R.drawable.icon_head_3, "终年不遇", R.drawable.listen, R.drawable.ic_follow, "#  文摘聆听  情感", "   暂无评论", R.drawable.heard22,1);
        usrCardObjectlist.add(mUserCard);

        mUserCard = new CardInfEntity(R.drawable.article4, R.drawable.article4_1, getLongContentResource(context, "other_content_article4"), "我在冰封的深海，找寻希望的缺口。却在午夜惊醒时，蓦然瞥见绝美的月光。—— 几米", 8, 1.33, mResource.getColor(R.color.white), 0,
                R.drawable.icon_head_4, "花落成雨", R.drawable.listen, R.drawable.ic_follow, "#  文摘聆听  书评  情感", "   暂无评论", R.drawable.heard22,1);
        usrCardObjectlist.add(mUserCard);

        mUserCard = new CardInfEntity(R.drawable.article5, R.drawable.article5_1, getLongContentResource(context, "other_content_article5"), "一座城，一城山色，半城湖光，总有几分姿容，清浅于笔墨，安然于心中。生活得久了，便也习惯了繁星黎明，不息泉水。", 8, 1.7714, mResource.getColor(R.color.white), 0,
                R.drawable.icon_head_5, "黄昏时", R.drawable.listen, R.drawable.ic_follow, "#  文摘聆听  文学", "   暂无评论", R.drawable.heard22,1);
        usrCardObjectlist.add(mUserCard);

        return usrCardObjectlist;
    }

    public static List<CardInfEntity> initSongDate(Context context){
        Resources mResource = context.getResources();
        List<CardInfEntity> usrCardObjectlist = new ArrayList<>();
        CardInfEntity mUserCard;

        mUserCard = new CardInfEntity(R.drawable.song1, R.drawable.song1_1, getLongContentResource(context, "other_content_song1"), "那是我竭尽了自己灵魂所能触及的深度、宽度和高度……我对你的爱是每一天最基本的需求/就像我需求太阳和烛光/我对你的爱不由自主得就像人们对真理的追逐/我对你的爱纯粹得无须称赞也不求回报”", 3, 1.77, mResource.getColor(R.color.white), 0,
                R.drawable.ichead_song1, "小奇", R.drawable.listen, R.drawable.ic_follow, "#  诗歌聆听  情感", " 暂无评论", R.drawable.heard22,1);
        usrCardObjectlist.add(mUserCard);

        mUserCard = new CardInfEntity(R.drawable.song2, R.drawable.song2_1, getLongContentResource(context, "other_content_song2"), "他的心是一座孤城...", 4, 1.303, mResource.getColor(R.color.white), 0,
                R.drawable.ichead_song2, "三十", R.drawable.listen, R.drawable.ic_follow, "#  诗歌聆听  情感", " 暂无评论", R.drawable.heard22,1);
        usrCardObjectlist.add(mUserCard);

        mUserCard = new CardInfEntity(R.drawable.song3, R.drawable.song3, getLongContentResource(context, "other_content_song3"), "你...", 1, 1.496, mResource.getColor(R.color.white), 0,
                R.drawable.ichead_song3, "张楠", R.drawable.listen, R.drawable.ic_follow, "#  诗歌聆听  张国荣", " 暂无评论", R.drawable.heard22,1);
        usrCardObjectlist.add(mUserCard);

        mUserCard = new CardInfEntity(R.drawable.song4, R.drawable.song4_1, getLongContentResource(context, "other_content_song4"), "我愿意看你入睡 \n" +
                "也许你根本睡不着。\n" +
                "我愿意睡意朦胧地，\n" +
                "看着你。", 2, 1.773, mResource.getColor(R.color.white), 0,
                R.drawable.ichead_song4, "汤媛", R.drawable.listen, R.drawable.ic_follow, "#  诗歌聆听  感情", " 暂无评论", R.drawable.heard22,1);
        usrCardObjectlist.add(mUserCard);

        mUserCard = new CardInfEntity(R.drawable.song5, R.drawable.song5_1, getLongContentResource(context, "other_content_song5"), "苏堤清明即事", 4, 1.5, mResource.getColor(R.color.white), 0,
                R.drawable.ichead_song5, "朱卫东", R.drawable.listen, R.drawable.ic_follow, "#  诗歌朗读  宋诗", " 暂无评论", R.drawable.heard22,1);
        usrCardObjectlist.add(mUserCard);

        return usrCardObjectlist;
    }


    public static List<CardInfEntity> initOriginDate(Context context) {
        Resources mResource = context.getResources();
        List<CardInfEntity> usrCardObjectlist = new ArrayList<>();
        CardInfEntity mUserCard;

        mUserCard = new CardInfEntity(R.drawable.origin1, R.drawable.origin1_1, getLongContentResource(context, "other_content_origin1"), "“荷西，我回来了，几个月前一袭黑衣离去，而今穿着彩衣回来...", 6, 1.4359, mResource.getColor(R.color.white), 0,
                R.drawable.ichead_origin1, "爱读书的鬼", R.drawable.listen, R.drawable.ic_follow, "#  原创聆听  书评", " 暂无评论", R.drawable.heard22,1);
     //   usrCardObjectlist.add(mUserCard);

        mUserCard = new CardInfEntity(R.drawable.origin2, R.drawable.orgin2_1, getLongContentResource(context, "other_content_origin2"), "整个故事，充满了错位—当他是至尊宝的时候，他没有法力救回自己的娘子；当紫霞爱他的时候...", 2, 1.4936, mResource.getColor(R.color.white), 0,
                R.drawable.ichead_origin2, "执", R.drawable.listen, R.drawable.ic_follow, "#  原创聆听  影评  爱情", " 暂无评论", R.drawable.heard22,1);
        usrCardObjectlist.add(mUserCard);

        mUserCard = new CardInfEntity(R.drawable.origin3, R.drawable.origin3_1, getLongContentResource(context, "other_content_origin3"), "“别跟着我，小屁孩！”\n" +
                "“别赶我走，师父！”", 1, 1.336, mResource.getColor(R.color.white), 0,
                R.drawable.ichead_orgin3, "以薛之名谦你手", R.drawable.listen, R.drawable.ic_follow, "#  原创聆听  影评", " 暂无评论", R.drawable.heard22,1);
        usrCardObjectlist.add(mUserCard);

        mUserCard = new CardInfEntity(R.drawable.origin4, R.drawable.origin4_1, getLongContentResource(context, "other_content_origin4"), "很多年前，在我迷上宫崎骏的时候，曾经有过这样一个念头——啊，能够与宫崎骏活在同一个时代真是很幸福啊。", 2, 1.305, mResource.getColor(R.color.white), 0,
                R.drawable.ichead_origin4, "琦语", R.drawable.listen, R.drawable.ic_follow, "#  原创  宫崎骏  漫画", " 暂无评论", R.drawable.heard22,1);
        usrCardObjectlist.add(mUserCard);

        mUserCard = new CardInfEntity(R.drawable.origin5, R.drawable.origin5_1, getLongContentResource(context, "other_content_origin5"), "我总以为大兴安岭奇峰怪石，高不可攀。这回有机会看到它，并且走进原始森林，脚落在积得几尺厚的松针上...", 2, 1.51, mResource.getColor(R.color.white), 0,
                R.drawable.ichead_origin5, "岩色", R.drawable.listen, R.drawable.ic_follow, "#  原创聆听  旅行", " 暂无评论", R.drawable.heard22,1);
        usrCardObjectlist.add(mUserCard);

        return usrCardObjectlist;
    }

    public static List<CardInfEntity> initTradFoodData(Context context){
        Resources mResource = context.getResources();
        List<CardInfEntity> usrCardObjectlist = new ArrayList<>();
        CardInfEntity mUserCard;

        mUserCard = new CardInfEntity(R.drawable.tradition_1, R.drawable.tradition1_1, getLongContentResource(context, "other_content_traditionfood1"), "进来喝点汤，暖暖胃吧", 2, 1.5, mResource.getColor(R.color.white), 0,
                R.drawable.ichead_trad1, "学会爱自己", R.drawable.eat, R.drawable.ic_follow, "#  传统美食  情感", " 暂无评论", R.drawable.heard22);
        usrCardObjectlist.add(mUserCard);

        mUserCard = new CardInfEntity(R.drawable.tradition2, R.drawable.tradition2_1, getLongContentResource(context, "other_content_traditionfood2"), "好好珍惜只此一生的缘分，下辈子，无论爱或不爱，都不会再遇见。", 8, 1.0, mResource.getColor(R.color.white), 0,
                R.drawable.ichead_trad2, "爱吃肉的大碗君", R.drawable.eat, R.drawable.ic_follow, "#  传统美食  情感", " 暂无评论", R.drawable.heard22);
      //  usrCardObjectlist.add(mUserCard);

        mUserCard = new CardInfEntity(R.drawable.tradition3, R.drawable.tradition3_1, getLongContentResource(context, "other_content_tradfood3"), "人生可以挑剔，但不能挑食。\n" +
                "不要因为偏见，\n" +
                "拒绝了食物所有的可能。", 3, 1.3, mResource.getColor(R.color.white), 0,
                R.drawable.ichead_tradfood3, "果冻女孩", R.drawable.eat, R.drawable.ic_follow, "#  传统美食  情感", " 暂无评论", R.drawable.heard22);
        usrCardObjectlist.add(mUserCard);

        mUserCard = new CardInfEntity(R.drawable.tradition4, R.drawable.tradition4_1, getLongContentResource(context, "other_content_tradfood4"), "我们最常忽略，如雷贯耳的爱，\n" +
                "如同最常浪费，唾手可食的菜。", 8, 1.153, mResource.getColor(R.color.white), 0,
                R.drawable.ichead_tradfood4, "你好，再见", R.drawable.eat, R.drawable.ic_follow, "#  传统美食  情感", " 暂无评论", R.drawable.heard22);
        usrCardObjectlist.add(mUserCard);

        mUserCard = new CardInfEntity(R.drawable.tradition5, R.drawable.tradition5_1, getLongContentResource(context, "other_content_tradfood5"), "每一丝牛奶，都是纯白的浪漫", 8, 1.336, mResource.getColor(R.color.white), 0,
                R.drawable.ichead_tradfood5, "夏末", R.drawable.eat, R.drawable.ic_follow, "#  传统美食  历史  人文", " 暂无评论", R.drawable.heard22);
        usrCardObjectlist.add(mUserCard);

        return usrCardObjectlist;
    }

    public static List<CardInfEntity> initNewFoodData(Context context){
        Resources mResource = context.getResources();
        List<CardInfEntity> usrCardObjectlist = new ArrayList<>();
        CardInfEntity mUserCard;

        mUserCard = new CardInfEntity(R.drawable.newfood1, R.drawable.newfood1_1, getLongContentResource(context, "other_content_newfood1"), "一日三餐只是身体的刚需，\n" +
                "甜点才是生命的诗与真谛。\n" +
                "而每做一个蛋糕，都是一场甜蜜的冒险", 8, 1.1, mResource.getColor(R.color.white), 0,
                R.drawable.ichead_newfood1, "大碗", R.drawable.eat, R.drawable.ic_follow, "#  新潮美食  IN做法", " 暂无评论", R.drawable.heard22);
        usrCardObjectlist.add(mUserCard);

        mUserCard = new CardInfEntity(R.drawable.newfood2, R.drawable.newfood2_1, getLongContentResource(context, "other_content_newfood2"), "所有迷恋\n" +
                "新鲜是必要条件。\n" +
                "而事物的巅峰口感，比青春还短。",2, 1.18, mResource.getColor(R.color.white), 0, R.drawable.ichead_newfood2, "太阳其实不暖", R.drawable.eat, R.drawable.ic_follow, "#  新潮美食  IN吃法", " 暂无评论", R.drawable.heard22);
        usrCardObjectlist.add(mUserCard);

        mUserCard = new CardInfEntity(R.drawable.newfood3, R.drawable.newfood3_1, getLongContentResource(context, "other_content_traditionfood3"), "两个人吃的是饭，一个人吃的是饲料。", 8, 2.08, mResource.getColor(R.color.white), 0,
                R.drawable.ichead_trad3, "Mato", R.drawable.eat, R.drawable.ic_follow, "#  新潮美食  IN吃法  情感", " 暂无评论", R.drawable.heard22);
      //  usrCardObjectlist.add(mUserCard);

        mUserCard = new CardInfEntity(R.drawable.newfood4, R.drawable.newfood4_1, getLongContentResource(context, "other_content_traditionfood4"), "不时不食，步履不停。", 3, 1.03, mResource.getColor(R.color.white), 0,
                R.drawable.ichead_trad4, "带你吃遍全世界", R.drawable.eat, R.drawable.ic_follow, "#  新潮美食  IN吃法", " 暂无评论", R.drawable.heard22);
        usrCardObjectlist.add(mUserCard);

        mUserCard = new CardInfEntity(R.drawable.newfood5, R.drawable.newfood5_1, getLongContentResource(context, "other_content_traditionfood5"), "每个食材，都是自然的一场奇迹。", 3, 1.03, mResource.getColor(R.color.white), 0,
                R.drawable.ichead_trad5, "土豆爱白菜", R.drawable.eat, R.drawable.ic_follow, "#  新潮美食  IN吃法  IN食材", " 暂无评论", R.drawable.heard22);
        usrCardObjectlist.add(mUserCard);



        return usrCardObjectlist;
    }

    public static List<CardInfEntity> initSpaceTraveling(Context context){
        Resources mResource = context.getResources();
        List<CardInfEntity> usrCardObjectlist = new ArrayList<>();
        CardInfEntity mUserCard;

        mUserCard = new CardInfEntity(R.drawable.space1, R.drawable.space1, getLongContentResource(context, "other_content_travel1"), "兰州想像出来的城市\n" +
                "兰州是另一座被想象出来的城市，总是生活在别处。\n" +
                "黄河的水不停地流 ", 2, 1.342, mResource.getColor(R.color.white), 0,
                R.drawable.ichead_space1, "景琦", R.drawable.play, R.drawable.ic_follow, "#  空间旅行  情感  原创", " 暂无评论", R.drawable.heard22);
        usrCardObjectlist.add(mUserCard);

        mUserCard = new CardInfEntity(R.drawable.space2, R.drawable.space2_1, getLongContentResource(context, "other_content_travel2"), "“世界末日”，追寻祖国最北的星光\n" +
                "一路向北，去北方，去最北的北方。", 1, 1.5, mResource.getColor(R.color.white), 0,
                R.drawable.ichead_space2, "Galaxy Rover", R.drawable.play, R.drawable.ic_follow, "#  空间旅行  星空摄影", " 暂无评论", R.drawable.heard22);
        usrCardObjectlist.add(mUserCard);

        mUserCard = new CardInfEntity(R.drawable.space3, R.drawable.space3_1, getLongContentResource(context, "other_content_space3"), "在北国边陲，有这样一个神奇的地方...", 1, 1.46, mResource.getColor(R.color.white), 0,
                R.drawable.ichead_space3, "青田", R.drawable.play, R.drawable.ic_follow, "#  空间旅行", " 暂无评论", R.drawable.heard22);
        usrCardObjectlist.add(mUserCard);

        mUserCard = new CardInfEntity(R.drawable.space4, R.drawable.space4_1, getLongContentResource(context, "other_content_space4"), "是卢瑟恩，还是Luzern\n" +
                "是琉森吧 更多的人还是喜欢琉森这个梦幻十足的名字\n" +
                "这座人口只有7 万的小镇地处瑞士中部的高原地区，拉丁文意为“光”，即光城。", 1, 1.46, mResource.getColor(R.color.white), 0,
                R.drawable.ichead_space4, "薄荷蓝", R.drawable.play, R.drawable.ic_follow, "#  空间旅行", " 暂无评论", R.drawable.heard22);
        usrCardObjectlist.add(mUserCard);

        mUserCard = new CardInfEntity(R.drawable.space5, R.drawable.space5_1, getLongContentResource(context, "other_content_space5"), "我已记不清我在长沙\n" +
                "生活了几个年头了\n" +
                "大概和长沙的名字一样\n" +
                "漫长如漏斗里来回的流沙", 1, 1.33, mResource.getColor(R.color.white), 0,
                R.drawable.ichead_space5, "老板，来三斤龙虾", R.drawable.play, R.drawable.ic_follow, "#  空间旅行  人文", " 暂无评论", R.drawable.heard22);
        usrCardObjectlist.add(mUserCard);

        mUserCard = new CardInfEntity(R.drawable.space6, R.drawable.space6, getLongContentResource(context, "other_Content_space6"), "之所以将波恩选作德国行的最后一站，不仅是因为这个小城曾是西德的首都，更是因为德国之声的总部就在波恩。这个帮助我开启外面的世界，接触多元信息，构建世界观的电台，今天我终于可以来看你了。", 1, 0.721, mResource.getColor(R.color.white), 0,
                R.drawable.ichead_space3, "邻云", R.drawable.play, R.drawable.ic_follow, "#  空间旅行  原创", " 暂无评论", R.drawable.heard22);
        usrCardObjectlist.add(mUserCard);

        return usrCardObjectlist;
    }

    public static List<CardInfEntity> initTimeTraveling(Context context) {
        Resources mResource = context.getResources();
        List<CardInfEntity> usrCardObjectlist = new ArrayList<>();
        CardInfEntity mUserCard;

        mUserCard = new CardInfEntity(R.drawable.time1, R.drawable.time1_1, getLongContentResource(context, "other_content_travel3"), "月朦胧，鸟朦胧，帘卷海棠红", 2, 1.435, mResource.getColor(R.color.white), 0,
                R.drawable.ichead_time1, "温州流浪者", R.drawable.play, R.drawable.ic_follow, "#  时间旅行  情感  文学", " 暂无评论", R.drawable.heard22);
        usrCardObjectlist.add(mUserCard);

        mUserCard = new CardInfEntity(R.drawable.time2, R.drawable.time2_1, getLongContentResource(context, "other_content_time2"), "世间所有的相遇都是久别重逢", 2,1.5 , mResource.getColor(R.color.white), 0,
                R.drawable.ichead_time2, "碧池", R.drawable.play, R.drawable.ic_follow, "#  时间旅行  建筑  历史  人文", " 暂无评论", R.drawable.heard22);
        usrCardObjectlist.add(mUserCard);

        mUserCard = new CardInfEntity(R.drawable.time3, R.drawable.time3, getLongContentResource(context, "other_content_time3"), "北方的村庄住着一位叫芬兰的姑娘，她总是喜欢穿着蓝色的衣服站在路旁。她的话不多但笑起来是那么平静悠扬，她柔软的眼神里装的是什么？是思念的忧伤。", 2,1.458 , mResource.getColor(R.color.white), 0,
                R.drawable.ichead_time3, "李太白", R.drawable.play, R.drawable.ic_follow, "#  时间旅行  人文", " 暂无评论", R.drawable.heard22);
        usrCardObjectlist.add(mUserCard);

        mUserCard = new CardInfEntity(R.drawable.time4, R.drawable.time4_1, getLongContentResource(context, "other_content_time4"), "南京1912街区（Nanjing 1912 pub street），东邻南京总统府，南抵长江路，是由17幢民国风格建筑及共和、博爱、新世纪、太平洋4个街心广场组成...", 2,1.367 , mResource.getColor(R.color.white), 0,
                R.drawable.ichead_time4, "金陵梦", R.drawable.play, R.drawable.ic_follow, "#  时间旅行  情感  建筑  人文", " 暂无评论", R.drawable.heard22);
        usrCardObjectlist.add(mUserCard);



        return usrCardObjectlist;
    }


}
