package com.gistmap.entity;

import com.gistmap.annotation.Field;
import com.gistmap.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @desc :
 * @author : gistmap
 * @date : 2017/9/28  22:42
 */
@Data
@TableName(value = "friend",  desc = "用户关系表")
public class Friend extends Entity implements Serializable{

	private static final long serialVersionUID = 6738840890442881625L;

	@Field(value="id", desc="ID")
	private Long id;
	@Field(value="bid", desc="被关注者ID")
	private Long bid;
	@Field(value="fid", desc="关注者ID")
	private Long fid;
	@Field(value="createTime", desc="创建时间")
	private LocalDateTime createTime;
	@Field(value="modifyTime", desc="修改时间")
	private LocalDateTime modifyTime;
	@Field(value="flag", desc="标记删除（默认为1,删除为0")
	private short flag;

}
