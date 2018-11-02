package com.codeup.springblog.models;


import com.codeup.springblog.models.User;

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

    @OneToOne
    private User user;

    public Post() {

    }

    public Post(User user, String title, String description, long id) {
        this.title = title;
        this.description = description;
        this.id = id;
        this.user = user;
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

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {

        return user;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
