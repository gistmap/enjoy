package com.gistmap.service;

import com.gistmap.entity.Music;
import com.gistmap.entity.MusicVO;

import java.util.List;

/**
 * @desc : 音乐服务接口
 * @author : gistmap
 * @date : 2017/10/15  21:23
 */
public interface MusicService {

	List<MusicVO> list(String q);

	Long save(Music music);
}
