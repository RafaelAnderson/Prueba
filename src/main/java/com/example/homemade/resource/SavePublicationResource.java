package com.example.homemade.resource;

import java.util.Date;

public class SavePublicationResource {

    private Date date;
    private String text;
    private Integer likes;

    public Date getDate() {
        return date;
    }

    public SavePublicationResource setDate(Date date) {
        this.date = date;
        return this;
    }

    public String getText() {
        return text;
    }

    public SavePublicationResource setText(String text) {
        this.text = text;
        return this;
    }

    public Integer getLikes() {
        return likes;
    }

    public SavePublicationResource setLikes(Integer likes) {
        this.likes = likes;
        return this;
    }
}
