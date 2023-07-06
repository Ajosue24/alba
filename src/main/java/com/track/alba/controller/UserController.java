package com.track.alba.controller;

import com.track.alba.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping
    User getUser() {
        var user = new User();
        user.setId(1L);
        user.setName("John Doe");
        user.setEmail( "some@gmail.com");
        //Hola luis
        return user;
    }

    @PostMapping
    void createUser(@RequestBody User user) {
        System.out.println(user);

    }
}
