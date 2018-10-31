package com.codeup.springblog.services;
import com.codeup.springblog.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService  {
    private List<Post> posts;

    public PostService(){
        posts = new ArrayList<>();
        createPosts();

    }

    public List<Post> findAll(){
        return posts;
    }

    public Post save(Post post){
        post.setId(posts.size() + 1);
        posts.add(post);
        return post;
    }

    public Post findOne(long id){
        return posts.get( (int) id - 1);
    }

    private void createPosts(){
        this.save(new Post("My first ad", "It's about my feelings", 1));
        this.save(new Post("A good day", "Yay", 2));
        this.save(new Post("A bad day", "Meh", 3));
    }

}