package com.groovy.controller;

import com.groovy.model.User;
import com.groovy.service.UserService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "users", produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<User> getUsers() {
       return userService.getUsers();
    }

    @GetMapping(value = "users/{id}",produces = {MediaType.APPLICATION_JSON_VALUE})
    public User getUser(@PathVariable(value = "id") int id){
        return userService.getUser(id);
    }
}
