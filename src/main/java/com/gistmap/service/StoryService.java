package com.gistmap.service;

import com.gistmap.entity.Story;

/**
 * @Desc :
 * @User : gistmap
 * @Date : 2017/10/11 19:01
 */
public interface StoryService {

    /**
     * 保存故事
     * @param story
     */
    Long save(Story story);

}
