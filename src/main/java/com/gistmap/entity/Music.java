package com.gistmap.entity;

/**
 * @Desc :
 * @User : gistmap
 * @Date : 2017/10/7  14:14
 */
public class Music {
	private int id;
	private String text;

	public Music() {
	}

	public Music(int id, String text) {
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
}
