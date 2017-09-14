package com.gistmap.service;

import com.gistmap.entity.User;
import com.gistmap.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Desc : 用户Service接口实现
 * @User : gistmap
 * @Date : 2017/9/6  22:25
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findByEmail(String email) {
        return userMapper.findByEmail(email);
    }

    @Override
    public User findByUserName(String username) {
        return userMapper.findByUserName(username);
    }

    @Override
    public void save(User user) {
        userMapper.save(user);
    }

    @Override
    public User findByEmailOrName(String username, String email) {
        return userMapper.findByEmailOrName(email, username);
    }

}
