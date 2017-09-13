package com.gistmap.service;

import com.gistmap.entity.User;

public interface UserService {

    User findByEmail(String email);

    User findByUserName(String username);

    void save(User user);

    User findByEmailOrName(String username, String email);
}
