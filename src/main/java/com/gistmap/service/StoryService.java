package com.gistmap.service;

import com.gistmap.entity.Story;
import com.gistmap.entity.StoryDto;
import com.gistmap.entity.StoryVO;

import java.util.List;

/**
 * @desc :
 * @author : gistmap
 * @date : 2017/10/11 19:01
 */
public interface StoryService {

    /**
     * 保存故事
     * @param story
     */
    Long save(Story story);

	/**
	 * 查询故事
	 * @param id
	 * @return
	 */
	StoryVO get(Long id);

	/**
	 * 查询所有故事
	 * @return
	 */
	List<StoryVO> list(Long uid);

}
