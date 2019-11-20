package com.example.android.mj_brandnews;

public class NewsPost {
    private String title;
    private String description;
    private String image;
    private int type;

    public NewsPost(String title, String description, String image) {
        this.title = title;
        this.description = description;
        this.image = image;
        this.type = (image == null || image.length() == 0) ? 1 : 0;
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
}
