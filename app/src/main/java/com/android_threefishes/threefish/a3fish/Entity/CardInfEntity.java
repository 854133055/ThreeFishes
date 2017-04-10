package com.android_threefishes.threefish.a3fish.Entity;

import java.io.Serializable;

/**
 * Created by mml on 17-3-19.
 * Describe: 用户发布的日志的对象类
 */

public class CardInfEntity implements Serializable{

    private int imgSmallbackPath;
    private int imaDetailbackPath;
    private int usrImagePath;
    private String usrName;
    private int artcleFlag;
    private int musicFilePath;
    private String contentDetailText;
    private String contentText;
    private int isfollow;
    private String flags;
    private String comments;
    private int isSupport;
    private int fishPath;
    private int fishNum;
    private double imageScale;
    private int cardBackColor;
    private int commentsNum;


    public CardInfEntity(int imaDetailbackPath,int imgSmallbackPath, String contentDetailText,String contentText, int fishNum, double imageScale, int cardBackColor, int commentsNum, int usrImagePath, String usrName, int artcleFlag, int isfollow, String flags, String comments, int isSupport) {
        this.imgSmallbackPath = imgSmallbackPath;
        this.contentText = contentText;
        this.contentDetailText = contentDetailText;
        this.fishNum = fishNum;
        this.imageScale = imageScale;
        this.cardBackColor = cardBackColor;
        this.commentsNum = commentsNum;
        this.imaDetailbackPath = imaDetailbackPath;
        this.usrImagePath = usrImagePath;
        this.usrName = usrName;
        this.artcleFlag = artcleFlag;
        this.isfollow = isfollow;
        this.flags = flags;
        this.comments = comments;
        this.isSupport = isSupport;
    }



    public CardInfEntity(int imaDetailbackPath,int imgSmallbackPath, String contentDetailText,String contentText, int fishNum, double imageScale, int cardBackColor, int commentsNum, int usrImagePath, String usrName, int artcleFlag, int isfollow, String flags, String comments, int isSupport,int musicFilePath) {
        this.imgSmallbackPath = imgSmallbackPath;
        this.contentText = contentText;
        this.contentDetailText = contentDetailText;
        this.fishNum = fishNum;
        this.imageScale = imageScale;
        this.cardBackColor = cardBackColor;
        this.commentsNum = commentsNum;
        this.imaDetailbackPath = imaDetailbackPath;
        this.usrImagePath = usrImagePath;
        this.usrName = usrName;
        this.artcleFlag = artcleFlag;
        this.isfollow = isfollow;
        this.flags = flags;
        this.comments = comments;
        this.isSupport = isSupport;
        this.musicFilePath = musicFilePath;
    }

    public CardInfEntity(int imaDetailbackPath, int imgSmallbackPath, String contentDetailText, String contentText, String flags, String comments, int isSupport, int isfollow, int musicFilePath, int artcleFlag, String usrName, int usrImagePath) {
        this.imaDetailbackPath = imaDetailbackPath;
        this.imgSmallbackPath = imgSmallbackPath;
        this.contentDetailText = contentDetailText;
        this.contentText = contentText;
        this.flags = flags;
        this.comments = comments;
        this.isSupport = isSupport;
        this.isfollow = isfollow;
        this.musicFilePath = musicFilePath;
        this.artcleFlag = artcleFlag;
        this.usrName = usrName;
        this.usrImagePath = usrImagePath;
    }

    @Override
    public String toString() {
        return "CardInfEntity{" +
                "imgSmallbackPath=" + imgSmallbackPath +
                ", imaDetailbackPath=" + imaDetailbackPath +
                ", usrImagePath=" + usrImagePath +
                ", usrName='" + usrName + '\'' +
                ", artcleFlag=" + artcleFlag +
                ", musicFilePath=" + musicFilePath +
                ", contentText='" + contentText + '\'' +
                ", isfollow=" + isfollow +
                ", flags='" + flags + '\'' +
                ", comments='" + comments + '\'' +
                ", isSupport=" + isSupport +
                ", fishPath=" + fishPath +
                ", fishNum=" + fishNum +
                ", imageScale=" + imageScale +
                ", cardBackColor=" + cardBackColor +
                ", commentsNum=" + commentsNum +
                '}';
    }

    public String getContentDetailText() {
        return contentDetailText;
    }

    public void setContentDetailText(String contentDetailText) {
        this.contentDetailText = contentDetailText;
    }

    public int getImaDetailbackPath() {
        return imaDetailbackPath;
    }

    public void setImaDetailbackPath(int imaDetailbackPath) {
        this.imaDetailbackPath = imaDetailbackPath;
    }

    public int getImgSmallbackPath() {
        return imgSmallbackPath;
    }

    public void setImgSmallbackPath(int imgSmallbackPath) {
        this.imgSmallbackPath = imgSmallbackPath;
    }

    public int getUsrImagePath() {
        return usrImagePath;
    }

    public void setUsrImagePath(int usrImagePath) {
        this.usrImagePath = usrImagePath;
    }

    public String getUsrName() {
        return usrName;
    }

    public void setUsrName(String usrName) {
        this.usrName = usrName;
    }

    public int getArtcleFlag() {
        return artcleFlag;
    }

    public void setArtcleFlag(int artcleFlag) {
        this.artcleFlag = artcleFlag;
    }

    public int getMusicFilePath() {
        return musicFilePath;
    }

    public void setMusicFilePath(int musicFilePath) {
        this.musicFilePath = musicFilePath;
    }

    public String getContentText() {
        return contentText;
    }

    public void setContentText(String contentText) {
        this.contentText = contentText;
    }

    public int getIsfollow() {
        return isfollow;
    }

    public void setIsfollow(int isfollow) {
        this.isfollow = isfollow;
    }

    public String getFlags() {
        return flags;
    }

    public void setFlags(String flags) {
        this.flags = flags;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public int getIsSupport() {
        return isSupport;
    }

    public void setIsSupport(int isSupport) {
        this.isSupport = isSupport;
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

    public double getImageScale() {
        return imageScale;
    }

    public void setImageScale(double imageScale) {
        this.imageScale = imageScale;
    }

    public int getCardBackColor() {
        return cardBackColor;
    }

    public void setCardBackColor(int cardBackColor) {
        this.cardBackColor = cardBackColor;
    }

    public int getCommentsNum() {
        return commentsNum;
    }

    public void setCommentsNum(int commentsNum) {
        this.commentsNum = commentsNum;
    }
}
