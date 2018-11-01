package com.codeup.springblog;


import javax.persistence.*;

@Entity
@Table(name="posts")
public class Post {
    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false)
    private String description;

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
