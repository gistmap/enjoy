package com.gistmap.service;

import com.gistmap.entity.User;

/**
 * @Desc : 用户Service接口
 * @User : gistmap
 * @Date : 2017/9/6  22:25
 */

public interface UserService {

    /**
     * 根据Email查询User对象
     * @param email
     * @return
     */
    User findByEmail(String email);

    /**
     * 根据用户名查询User对象
     * @param username
     * @return
     */
    User findByUserName(String username);

    /**
     * 保存用户
     * @param user
     */
    void save(User user);

    /**
     * 根据用户名或邮箱查询User对象
     * @param username
     * @param email
     * @return
     */
    User findByEmailOrName(String username, String email);



}
