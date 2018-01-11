package com.gistmap.entity;

import com.gistmap.annotation.Field;
import com.gistmap.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @desc : 故事类
 * @author : gistmap
 * @date : 2017/9/28  23:15
 */
@Data
@TableName(value = "story",  desc = "故事表")
public class Story extends Entity implements Serializable {
	private static final long serialVersionUID = -6705885177482880694L;

	@Field(value="id", desc="ID")
	private Long id;
	@Field(value="uid", desc="用户ID")
	private Long uid;
	@Field(value="title", desc="标题")
	private String title;
	@Field(value ="tag_id", desc = "音乐标签ID")
	private Long tagId;
	@Field(value = "content", desc = "内容")
	private String content;
	@Field(value = "brief", desc = "简要")
	private String brief;
	@Field(value="createTime", desc="创建时间")
	private LocalDateTime createTime;
	@Field(value="modifyTime", desc="修改时间")
	private LocalDateTime modifyTime;
	@Field(value="flag", desc="标记删除（默认为1,删除为0")
	private short flag;
}
