package com.example.homemade.resource;


import java.util.Date;

public class CommentResource {
    private Long id;
    private Date date;
    private String text;
    private Integer likes;

    public Long getId() {
        return id;
    }

    public CommentResource setId(Long id) {
        this.id = id;
        return this;
    }

    public Date getDate() {
        return date;
    }

    public CommentResource setDate(Date date) {
        this.date = date;
        return this;
    }

    public String getText() {
        return text;
    }

    public CommentResource setText(String text) {
        this.text = text;
        return this;
    }

    public Integer getLikes() {
        return likes;
    }

    public CommentResource setLikes(Integer likes) {
        this.likes = likes;
        return this;
    }
}
