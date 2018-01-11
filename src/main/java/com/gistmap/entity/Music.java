package com.gistmap.entity;

import com.gistmap.annotation.Field;
import com.gistmap.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @desc : 音乐标签
 * @author : gistmap
 * @date : 2017/9/27  22:45
 */
@Data
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

}
