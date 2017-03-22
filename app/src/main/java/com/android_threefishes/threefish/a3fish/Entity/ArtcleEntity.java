package com.android_threefishes.threefish.a3fish.Entity;

import com.android_threefishes.threefish.a3fish.DB.Article;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mml on 17-3-19.
 * Describe: 用以转换-数据库对象-的对象
 */

public class ArtcleEntity {

    private long id;
    private byte[] usrImg;
    private String usrName;
    private byte[] imageBig;
    private byte[] imageSmall;
    // private Object sounds;
    private String soundsPath;
    private String context;
    private String[] frags;
    private List<Comments> comments;
    private int agreeNum;
    private String contextColor;

    public ArtcleEntity(byte[] usrImg, String usrName, byte[] imageBig, byte[] imageSmall,
                        String soundsPath, String context, String[] frags,
                        List<Comments> comments, int agreeNum, String contextColor) {
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    /**
     * 将article的getFrags获得的String按|分割得String[]
     */
    public String[] getFrags(Article article) {
        return article.getFrags().split("//|");
    }

    /**
     * 切割Comments对象获得list<Comments>
     */
    public List<Comments> getComments(Article article) {
        List<Comments> list = new ArrayList<>();
        String[] tmp = article.getComments().split("//|");
        String[] index;
        for (int i=0;i<tmp.length;i++){
            index = tmp[i].split("//+");
            list.add(new Comments(index[0], index[1]));
        }
        return list;
    }

    public void setFrags(String[] frags) {
        this.frags = frags;
    }

    public void setComments(List<Comments> comments) {
        this.comments = comments;
    }

    public byte[] getUsrImg() {
        return usrImg;
    }

    public void setUsrImg(byte[] usrImg) {
        this.usrImg = usrImg;
    }

    public String getUsrName() {
        return usrName;
    }

    public void setUsrName(String usrName) {
        this.usrName = usrName;
    }

    public byte[] getImageBig() {
        return imageBig;
    }

    public void setImageBig(byte[] imageBig) {
        this.imageBig = imageBig;
    }

    public byte[] getImageSmall() {
        return imageSmall;
    }

    public void setImageSmall(byte[] imageSmall) {
        this.imageSmall = imageSmall;
    }

    public String getSoundsPath() {
        return soundsPath;
    }

    public void setSoundsPath(String soundsPath) {
        this.soundsPath = soundsPath;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }



    public int getAgreeNum() {
        return agreeNum;
    }

    public void setAgreeNum(int agreeNum) {
        this.agreeNum = agreeNum;
    }

    public String getContextColor() {
        return contextColor;
    }

    public void setContextColor(String contextColor) {
        this.contextColor = contextColor;
    }



    class Comments{
        private String name;
        private String commentContext;

        public Comments(String name, String commentContext) {
            this.name = name;
            this.commentContext = commentContext;
        }
    }


}
