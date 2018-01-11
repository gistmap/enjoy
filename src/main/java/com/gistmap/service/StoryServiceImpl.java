package com.gistmap.service;

import com.gistmap.dao.StoryDao;
import com.gistmap.entity.Story;
import com.gistmap.entity.StoryDto;
import com.gistmap.entity.StoryVO;
import com.gistmap.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @desc :
 * @author : gistmap
 * @date : 2017/10/11 19:08
 */
@Service
public class StoryServiceImpl implements StoryService{

    @Autowired
    private StoryDao storyDao;

    @Override
    public Long save(Story story) {
        return storyDao.save(story);
    }

    @Override
    public StoryVO get(Long id) {
        return storyDao.get(id);
    }

    @Override
    public List<StoryVO> list(Long uid) {
        return storyDao.list(uid);
    }
}
