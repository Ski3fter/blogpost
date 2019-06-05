package com.example.blog.controllers;

import com.example.blog.entities.Post;
import com.example.blog.entities.User;
import com.example.blog.repositories.PostRepository;
import com.example.blog.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PostController {

    @Autowired
    private PostRepository postRepository;

    @GetMapping("/posts")
    public List<Post> getUsers() {
        return (List<Post>) postRepository.findAll();
    }

    @PostMapping("/posts")
    void addPosts(@RequestBody Post user) {
        postRepository.save(user);
    }

}
