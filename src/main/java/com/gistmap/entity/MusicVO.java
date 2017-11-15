package com.gistmap.entity;

/**
 * @desc :
 * @author : gistmap
 * @date : 2017/10/7  14:14
 */
public class MusicVO {
	private int id;
	private String text;

	public MusicVO() {
	}

	public MusicVO(int id, String text) {
		this.id = id;
		this.text = text;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "MusicVO{" +
				"id=" + id +
				", text='" + text + '\'' +
				'}';
	}
}
