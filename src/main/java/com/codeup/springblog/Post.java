package com.codeup.springblog;

public class Post {
    private String title;
    private String description;
    private long id;

    public Post() {

    }

    public Post(String title, String description, long id) {
        this.title = title;
        this.description = description;
        this.id = id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {

        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
