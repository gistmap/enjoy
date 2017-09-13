package com.gistmap.mapper;

import com.gistmap.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User get();

    User findByEmail(String email);

    void save(User user);

    User findByUserName(String username);
}
