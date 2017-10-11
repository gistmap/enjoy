package com.gistmap.service;

import com.gistmap.dao.StoryDao;
import com.gistmap.entity.Story;
import com.gistmap.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Desc :
 * @User : gistmap
 * @Date : 2017/10/11 19:08
 */
public class StoryServiceImpl implements StoryService{

    @Autowired
    private StoryDao storyDao;

    @Override
    public int save(Story story) {
        return storyDao.save(story);
    }
}
