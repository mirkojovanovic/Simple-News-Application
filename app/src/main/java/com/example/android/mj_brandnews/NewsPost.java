package com.example.android.mj_brandnews;

public class NewsPost {
    private String title;
    private String description;
    private String image;
    private int type;

    public NewsPost(String title, String description, String image, int type) {
        this.title = title;
        this.description = description;
        this.image = image;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
