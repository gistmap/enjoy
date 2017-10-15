package com.gistmap.dao;

import com.gistmap.entity.Music;
import com.gistmap.entity.MusicVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Desc :
 * @User : gistmap
 * @Date : 2017/10/15  21:29
 */
@Mapper
public interface MusicDao {

	List<MusicVO> list(@Param(value="text") String q);

	Long save(Music music);
}
