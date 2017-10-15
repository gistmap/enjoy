package com.gistmap.web;

import com.gistmap.comm.Response;
import com.gistmap.comm.ResponseData;
import com.gistmap.entity.Music;
import com.gistmap.entity.Story;
import com.gistmap.entity.StoryDto;
import com.gistmap.service.MusicService;
import com.gistmap.service.StoryService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Desc :
 * @User : gistmap
 * @Date : 2017/10/7  14:11
 */
@Controller
@RequestMapping("/story")
public class StoryController extends BaseController {

	@Autowired
	private StoryService storyService;
	@Autowired
	private MusicService musicService;

	@PostMapping("/add")
	@ResponseBody
	public Response save(@RequestBody StoryDto dto){

		Story story = new Story();
		BeanUtils.copyProperties(dto,story);
		Long uid = 1L;
		if (dto.getTagId() == null) {
			Music music = new Music();
			music.setName(dto.getName());
			music.setUid(uid);
			Long mid = musicService.save(music);
			story.setTagId(mid);
		}
		Long id = storyService.save(story);
		String url = "/story/"+id;
		return new ResponseData(url);
	}
}
