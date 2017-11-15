package com.gistmap.entity;

import com.gistmap.annotation.Field;
import com.gistmap.annotation.TableName;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @desc : 音乐标签
 * @author : gistmap
 * @date : 2017/9/27  22:45
 */
@TableName(value = "music",  desc = "音乐标签表")
public class Music extends Entity implements Serializable{
	private static final long serialVersionUID = 7719228421237372788L;

	@Field(value="id", desc="ID")
	private Long id;
	@Field(value="name", desc="歌曲名")
	private String name;
	@Field(value="type", desc="类型")
	private String type;
	@Field(value="uid", desc="用户ID")
	private Long uid;
	@Field(value="createTime", desc="创建时间")
	private LocalDateTime createTime;


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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public LocalDateTime getCreateTime() {
		return createTime;
	}

	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}
}
