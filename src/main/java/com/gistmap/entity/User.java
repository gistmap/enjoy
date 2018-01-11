package com.gistmap.entity;

import com.gistmap.annotation.Field;
import com.gistmap.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @desc : 用户类
 * @author : gistmap
 * @date : 2017/9/6  22:18
 */
@Data
@TableName(value = "user",  desc = "用户表")
public class User extends Entity implements Serializable
{
    private static final long serialVersionUID = 6944948506315766997L;

    @Field(value="id", desc="ID")
    private Long id;

    @Field(value="name", desc="用户名")
    private String name;

    @Field(value="username", desc="用户账号")
    private String username;

    @Field(value="password", desc="密码")
    private String password;

    @Field(value="email", desc="邮箱")
    private String email;

    @Field(value="phone", desc="手机号")
    private String phone;

    @Field(value="flag", desc="标记删除（默认为1,删除为0")
    private byte flag;

    @Field(value="createTime", desc="创建时间")
    private LocalDateTime createTime;

    @Field(value="modifyTime", desc="修改时间")
    private LocalDateTime modifyTime;

}
