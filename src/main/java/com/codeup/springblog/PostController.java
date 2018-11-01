package com.codeup.springblog;


import com.codeup.springblog.services.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class PostController {

        private PostService postService;

        public PostController(PostService postService) {
            this.postService = postService;
        }
    @GetMapping("/posts")
    public String posts(Model vModel) {
            vModel.addAttribute("posts", postService.all());


        return "posts/index";
    }
    @GetMapping("/posts/{id}")
    public String individualPost(@PathVariable int id, Model vModel) {
        vModel.addAttribute("post", postService.findOne(id));
        return "posts/show";
    }
    @GetMapping("/posts/create")
    public String create(Model vModel) {
            vModel.addAttribute("post", new Post());
        return "posts/create";

    }

    @PostMapping("/posts/create")
    public String createPost(@ModelAttribute Post post, Model vModel) {
            postService.save(post);
        vModel.addAttribute("posts", postService.all());

        return "posts/index";

    }
    @GetMapping("/posts/{id}/edit")
    public String editPost(@ModelAttribute Post post, Model vModel, @PathVariable long id) {
        vModel.addAttribute("post", postService.findOne(id));
        return "posts/edit";

    }

    @GetMapping("/posts/{id}/delete")
    public String deletePost(@ModelAttribute Post post, Model vModel, @PathVariable long id) {
        vModel.addAttribute("post", postService.findOne(id));
        return "posts/delete";

    }
    @PostMapping("/posts/{id}/delete")
    public String deletePost(@ModelAttribute Post post, Model vModel) {
            postService.delete(post.getId());
            vModel.addAttribute("posts", postService.all());


            return "posts/index";
    }

    @PostMapping("/posts/{id}/edit")
    public String editPost(@ModelAttribute Post post, Model vModel) {
         postService.edit(post);
        vModel.addAttribute("posts", postService.all());
        return "posts/index";

    }
}
