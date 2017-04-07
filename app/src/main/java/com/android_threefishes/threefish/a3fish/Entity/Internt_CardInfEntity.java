package com.android_threefishes.threefish.a3fish.Entity;

import java.io.Serializable;

/**
 * Created by lml on 2017/4/2.
 */

public class Internt_CardInfEntity implements Serializable {
    private String imgSmallbackPath;
    private String imaDetailbackPath;
    private String usrImagePath;
    private String usrName;
    private String artcleFlag;
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

    public Internt_CardInfEntity() {
    }

    public Internt_CardInfEntity(String imgSmallbackPath, String imaDetailbackPath, String usrImagePath, String usrName, String artcleFlag, String contentDetailText, String contentText, int isfollow, String flags, String comments, int fishNum, int commentsNum) {
        this.imgSmallbackPath = imgSmallbackPath;
        this.imaDetailbackPath = imaDetailbackPath;
        this.usrImagePath = usrImagePath;
        this.usrName = usrName;
        this.artcleFlag = artcleFlag;
        this.contentDetailText = contentDetailText;
        this.contentText = contentText;
        this.isfollow = isfollow;
        this.flags = flags;
        this.comments = comments;
        this.fishNum = fishNum;
        this.commentsNum = commentsNum;
    }

    public String getImgSmallbackPath() {
        return imgSmallbackPath;
    }

    public void setImgSmallbackPath(String imgSmallbackPath) {
        this.imgSmallbackPath = imgSmallbackPath;
    }

    public String getImaDetailbackPath() {
        return imaDetailbackPath;
    }

    public void setImaDetailbackPath(String imaDetailbackPath) {
        this.imaDetailbackPath = imaDetailbackPath;
    }

    public String getUsrImagePath() {
        return usrImagePath;
    }

    public void setUsrImagePath(String usrImagePath) {
        this.usrImagePath = usrImagePath;
    }

    public String getUsrName() {
        return usrName;
    }

    public void setUsrName(String usrName) {
        this.usrName = usrName;
    }

    public int getMusicFilePath() {
        return musicFilePath;
    }

    public void setMusicFilePath(int musicFilePath) {
        this.musicFilePath = musicFilePath;
    }

    public String getArtcleFlag() {
        return artcleFlag;
    }

    public void setArtcleFlag(String artcleFlag) {
        this.artcleFlag = artcleFlag;
    }

    public String getContentDetailText() {
        return contentDetailText;
    }

    public void setContentDetailText(String contentDetailText) {
        this.contentDetailText = contentDetailText;
    }

    public String getContentText() {
        return contentText;
    }

    public void setContentText(String contentText) {
        this.contentText = contentText;
    }

    public String getFlags() {
        return flags;
    }

    public void setFlags(String flags) {
        this.flags = flags;
    }

    public int getIsfollow() {
        return isfollow;
    }

    public void setIsfollow(int isfollow) {
        this.isfollow = isfollow;
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
