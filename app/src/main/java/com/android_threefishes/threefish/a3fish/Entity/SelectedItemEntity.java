package com.android_threefishes.threefish.a3fish.Entity;

/**
 * Created by mml on 17-3-27.
 * Describe:
 */

public class SelectedItemEntity {
    private int imagePath;
    private String content;
    private String flags;
    private int imageHeartPath;


    public SelectedItemEntity(int imagePath, String flags, String content, Boolean isShow) {
        this.imagePath = imagePath;
        this.flags = flags;
        this.content = content;

    }

    public int getImagePath() {
        return imagePath;
    }

    public void setImagePath(int imagePath) {
        this.imagePath = imagePath;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFlags() {
        return flags;
    }

    public void setFlags(String flags) {
        this.flags = flags;
    }

    public int getImageHeartPath() {
        return imageHeartPath;
    }

    public void setImageHeartPath(int imageHeartPath) {
        this.imageHeartPath = imageHeartPath;
    }


}
