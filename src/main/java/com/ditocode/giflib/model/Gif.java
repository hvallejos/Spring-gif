package com.ditocode.giflib.model;

import java.time.LocalDate;

/**
 * Created by hector on 14/10/16.
 */
public class Gif {
    private String name;
    private int categoryId;
    private LocalDate dateUploaded;
    private String username;
    private boolean favorite;

    public Gif(){}
    public Gif(String name, int categoryId,LocalDate dateUploaded, String username, boolean favorite) {
        this.name = name;
        this.categoryId = categoryId;
        this.dateUploaded = dateUploaded;
        this.username = username;
        this.favorite = favorite;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateUploaded() {
        return dateUploaded;
    }

    public void setDateUploaded(LocalDate dateUploaded) {
        this.dateUploaded = dateUploaded;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}
