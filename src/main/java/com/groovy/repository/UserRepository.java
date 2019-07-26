package com.groovy.repository;

import com.groovy.model.User;

import java.util.List;

public interface UserRepository {

    List<User> getUsers();

    User getUser(int id);
}
