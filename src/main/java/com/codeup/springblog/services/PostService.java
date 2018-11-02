package com.codeup.springblog.services;
import com.codeup.springblog.models.Post;
import org.springframework.stereotype.Service;

@Service
public class PostService  {
//    private Iterable<Post> posts;
    private final PostRepository repository;

    public PostService(PostRepository repository){
        this.repository = repository;
    }

    public Iterable<Post> all(){
        return repository.findAll();
    }

    public Post save(Post post){
       return repository.save(post);
    }

    public Post edit(Post post) {
       return repository.save(post);
    }

    public Post findOne(long id){
        return repository.findOne(id);
    }

    public void delete(long id) {
        repository.delete(id);
    }

//    private void createPosts(){
//        this.save(new Post("My first post", "It's about my feelings", 1));
//        this.save(new Post("A good day", "Yay", 2));
//        this.save(new Post("A bad day", "Meh", 3));
//    }

}