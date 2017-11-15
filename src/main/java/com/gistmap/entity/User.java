package com.gistmap.entity;

import com.gistmap.annotation.Field;
import com.gistmap.annotation.TableName;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @desc : 用户类
 * @author : gistmap
 * @date : 2017/9/6  22:18
 */
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public byte getFlag() {
        return flag;
    }

    public void setFlag(byte flag) {
        this.flag = flag;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


}
