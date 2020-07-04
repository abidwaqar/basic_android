package com.example.ecommerce;

public class Post {

    public enum PROPERTIES {THUMBNAIL, TITLE, DESCRIPTION}

    private int thumbnail;
    private String title;
    private String description;

    public Post(int thumbnail, String title , String description){
        this.thumbnail = thumbnail;
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
