package com.gistmap.entity;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @desc : 故事显示对象
 * @author : gistmap
 * @date : 2017/10/17  22:29
 */
@Data
public class StoryVO {
	private Long id;
	private String title;
	private String author;
	private String name;
	private String content;
	private String brief;
	private Date createTime;
	private String dateStr;
}
