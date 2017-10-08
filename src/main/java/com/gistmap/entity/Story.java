package com.gistmap.entity;

import com.gistmap.annotation.Field;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @Desc : 故事类
 * @User : gistmap
 * @Date : 2017/9/28  23:15
 */
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Long getTagId() {
		return tagId;
	}

	public void setTagId(Long tagId) {
		this.tagId = tagId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
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

	public short getFlag() {
		return flag;
	}

	public void setFlag(short flag) {
		this.flag = flag;
	}
}
