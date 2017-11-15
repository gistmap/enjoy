package com.gistmap.dao;

import com.gistmap.entity.Story;
import com.gistmap.entity.StoryDto;
import com.gistmap.entity.StoryVO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @desc :
 * @author : gistmap
 * @date : 2017/10/11 19:10
 */

@Mapper
public interface StoryDao {

    Long save(Story story);

	StoryVO get(Long id);
}
