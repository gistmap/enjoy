package com.gistmap.web;

import com.gistmap.entity.Music;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

/**
 * @Desc :
 * @User : gistmap
 * @Date : 2017/9/27  22:42
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {

	@GetMapping
	@RequestMapping("/getName")
	public List<Music> getName() {
		List<Music> musics = Arrays.asList(new Music(1,"不再让你孤单"),new Music(2,"不再联系"),new Music(3,"不跟你玩了"));
		return musics;
	}

	@GetMapping
	@RequestMapping("/test")
	public void test() {

	}
}
