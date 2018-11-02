package com.codeup.springblog.services;

import com.codeup.springblog.models.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends CrudRepository<Post, Long> {
        List<Post> findAllByTitleOrDescription(String str, String str2);


}
