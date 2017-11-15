package com.gistmap.dao;

import com.gistmap.entity.User;
import org.apache.ibatis.annotations.Mapper;


/**
 * @desc : 用户Mapper
 * @author : gistmap
 * @date : 2017/9/6  22:20
 */

@Mapper
public interface UserDao {

    User get();

    User getByEmail(String email);

    void save(User user);

    User getByUserName(String username);

    User getByEmailOrName(String username);
}
