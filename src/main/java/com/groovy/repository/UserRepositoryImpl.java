package com.groovy.repository;

import com.groovy.model.User;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private List<User> users = Arrays.asList(
            new User(1, "Togrul", 27),
            new User(2, "Aga", 28));

    @Override
    public List<User> getUsers() {
        return users;
    }

    @Override
    public User getUser(int id) {
        return users.stream().filter(user -> user.getId() == id).findFirst().orElse(null);
    }
}
