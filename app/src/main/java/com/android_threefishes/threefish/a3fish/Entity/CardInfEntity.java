package com.android_threefishes.threefish.a3fish.Entity;

/**
 * Created by mml on 17-3-19.
 * Describe: 用户发布的日志的对象类
 */

public class CardInfEntity {

    private int usrImgPath;
    private String contentText;
    private int fishPath;
    private int fishNum;
    private double imageScale;
    private int cardBackColor;
    private int commentsNum;

    public CardInfEntity(String contentText, int usrImgPath, int fishNum, double imageScale, int commentsNum) {
        this.contentText = contentText;
        this.usrImgPath = usrImgPath;
        this.fishNum = fishNum;
        this.imageScale = imageScale;
        this.commentsNum = commentsNum;
    }

    public CardInfEntity(int usrImgPath, String contentText, int fishNum, double imageScale, int cardBackColor, int commentsNum) {
        this.usrImgPath = usrImgPath;
        this.contentText = contentText;
        this.fishNum = fishNum;
        this.imageScale = imageScale;
        this.cardBackColor = cardBackColor;
        this.commentsNum = commentsNum;
    }

    public int getCommentsNum() {
        return commentsNum;
    }

    public int getCardBackColor() {
        return cardBackColor;
    }

    public void setCardBackColor(int cardBackColor) {
        this.cardBackColor = cardBackColor;
    }

    public double getImageScale() {
        return imageScale;
    }

    public void setImageScale(double imageScale) {
        this.imageScale = imageScale;
    }

    public int getUsrImgPath() {

        return usrImgPath;
    }

    public void setUsrImgPath(int usrImgPath) {
        this.usrImgPath = usrImgPath;
    }

    public String getContentText() {
        return contentText;
    }

    public void setContentText(String contentText) {
        this.contentText = contentText;
    }

    public int getFishPath() {
        return fishPath;
    }

    public void setFishPath(int fishPath) {
        this.fishPath = fishPath;
    }

    public int getFishNum() {
        return fishNum;
    }

    public void setFishNum(int fishNum) {
        this.fishNum = fishNum;
    }
}
