package com.gistmap.service;

import com.gistmap.entity.User;
import com.gistmap.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @desc : 用户Service接口实现
 * @author : gistmap
 * @date : 2017/9/6  22:25
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getByEmail(String email) {
        return userDao.getByEmail(email);
    }

    @Override
    public User getByUserName(String username) {
        return userDao.getByUserName(username);
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public User getByEmailOrName(String username) {
        return userDao.getByEmailOrName(username);
    }

}
