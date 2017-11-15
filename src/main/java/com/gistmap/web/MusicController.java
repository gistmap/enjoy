package com.gistmap.web;

import com.gistmap.entity.MusicVO;
import com.gistmap.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @desc :
 * @author : gistmap
 * @date : 2017/10/15  21:21
 */
@RestController
@RequestMapping("/music")
public class MusicController extends BaseController {

	@Autowired
	private MusicService musicService;

	@GetMapping("/list")
	public List<MusicVO> list(String q){
		return musicService.list(q);
	}
}
