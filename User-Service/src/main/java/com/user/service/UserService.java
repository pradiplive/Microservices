package com.user.service;

import com.user.entities.User;

import java.util.List;

public interface UserService {

    //create
    User saveUser(User user);

    //get all users
    List<User> getAllUser();

    //get user by id
    User getUser(String userId);

    //delete user

    //update user
}
