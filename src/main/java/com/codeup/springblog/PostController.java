package com.codeup.springblog;


import com.codeup.springblog.services.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;


@Controller
public class PostController {

        private PostService postService;

        public PostController(PostService postService) {
            this.postService = postService;
        }
    @GetMapping("/posts")
    public String posts(Model vModel) {
            vModel.addAttribute("posts", postService.findAll());


        return "posts/index";
    }
    @GetMapping("/posts/{id}")
    public String individualPost(@PathVariable int id, Model vModel) {
        vModel.addAttribute("post", postService.findOne(id));
        return "posts/show";
    }
    @GetMapping("/posts/create")
    @ResponseBody
    public String create() {
        return "view the form for creating a post";

    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String createTwo() {
        return "create a new post";
    }


}
