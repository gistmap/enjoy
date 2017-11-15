package com.gistmap.service;

import com.gistmap.dao.MusicDao;
import com.gistmap.entity.Music;
import com.gistmap.entity.MusicVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @desc :
 * @author : gistmap
 * @date : 2017/10/15  21:29
 */
@Service
public class MusicServiceImpl implements MusicService {

	@Autowired
	private MusicDao musicDao;

	@Override
	public List<MusicVO> list(String q) {
		return musicDao.list(q);
	}

	@Override
	public Long save(Music music) {
		return musicDao.save(music);
	}
}
