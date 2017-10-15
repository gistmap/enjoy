package com.gistmap.entity;

import com.gistmap.annotation.Field;

import java.io.Serializable;

/**
 * @Desc :
 * @User : gistmap
 * @Date : 2017/10/15  21:54
 */
public class StoryDto extends Entity {

	private Long id;
	private Long uid;
	private String title;
	private Long tagId;
	private String content;
	private String brief;

	private String name;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
