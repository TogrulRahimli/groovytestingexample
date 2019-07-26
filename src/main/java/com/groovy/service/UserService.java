package com.groovy.service;

import com.groovy.model.User;

import java.util.List;

public interface UserService {

    List<User> getUsers();

    User getUser(int id);
}
