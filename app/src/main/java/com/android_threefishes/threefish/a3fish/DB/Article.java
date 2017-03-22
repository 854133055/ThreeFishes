package com.android_threefishes.threefish.a3fish.DB;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by mml on 17-3-19.
 * Describe: 数据库存储对象
 */

@Entity
public class Article {
    private long id;
    private byte[] usrImg;
    private String usrName;
    private byte[] imageBig;
    private byte[] imageSmall;
   // private Object sounds;
    private String soundsPath;
    private String context;
    private String frags;
    private String comments;
    private int agreeNum;
    private String contextColor;


    @Generated(hash = 516749047)
    public Article(long id, byte[] usrImg, String usrName, byte[] imageBig,
            byte[] imageSmall, String soundsPath, String context, String frags,
            String comments, int agreeNum, String contextColor) {
        this.id = id;
        this.usrImg = usrImg;
        this.usrName = usrName;
        this.imageBig = imageBig;
        this.imageSmall = imageSmall;
        this.soundsPath = soundsPath;
        this.context = context;
        this.frags = frags;
        this.comments = comments;
        this.agreeNum = agreeNum;
        this.contextColor = contextColor;
    }
    @Generated(hash = 742516792)
    public Article() {
    }

    
    public long getId() {
        return this.id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public byte[] getUsrImg() {
        return this.usrImg;
    }
    public void setUsrImg(byte[] usrImg) {
        this.usrImg = usrImg;
    }
    public String getUsrName() {
        return this.usrName;
    }
    public void setUsrName(String usrName) {
        this.usrName = usrName;
    }
    public byte[] getImageBig() {
        return this.imageBig;
    }
    public void setImageBig(byte[] imageBig) {
        this.imageBig = imageBig;
    }
    public byte[] getImageSmall() {
        return this.imageSmall;
    }
    public void setImageSmall(byte[] imageSmall) {
        this.imageSmall = imageSmall;
    }
    public String getSoundsPath() {
        return this.soundsPath;
    }
    public void setSoundsPath(String soundsPath) {
        this.soundsPath = soundsPath;
    }
    public String getContext() {
        return this.context;
    }
    public void setContext(String context) {
        this.context = context;
    }
    public String getFrags() {
        return this.frags;
    }
    public void setFrags(String frags) {
        this.frags = frags;
    }
    public String getComments() {
        return this.comments;
    }
    public void setComments(String comments) {
        this.comments = comments;
    }
    public int getAgreeNum() {
        return this.agreeNum;
    }
    public void setAgreeNum(int agreeNum) {
        this.agreeNum = agreeNum;
    }
    public String getContextColor() {
        return this.contextColor;
    }
    public void setContextColor(String contextColor) {
        this.contextColor = contextColor;
    }

}

