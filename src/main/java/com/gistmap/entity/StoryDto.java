package com.gistmap.entity;

import com.gistmap.annotation.Field;
import lombok.Data;

import java.io.Serializable;

/**
 * @desc :
 * @author : gistmap
 * @date : 2017/10/15  21:54
 */
@Data
public class StoryDto extends Entity {

	private Long id;
	private Long uid;
	private String title;
	private Long tagId;
	private String content;
	private String brief;
	private String name;

}
