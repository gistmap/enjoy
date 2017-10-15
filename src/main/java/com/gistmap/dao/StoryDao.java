package com.gistmap.dao;

import com.gistmap.entity.Story;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Desc :
 * @User : gistmap
 * @Date : 2017/10/11 19:10
 */

@Mapper
public interface StoryDao {

    Long save(Story story);

}
