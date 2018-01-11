package com.gistmap.web;

import com.gistmap.comm.Response;
import com.gistmap.comm.ResponseData;
import com.gistmap.entity.Music;
import com.gistmap.entity.Story;
import com.gistmap.entity.StoryDto;
import com.gistmap.entity.StoryVO;
import com.gistmap.service.MusicService;
import com.gistmap.service.StoryService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @desc : 故事控制器
 * @author : gistmap
 * @date : 2017/10/7  14:11
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
		story.setBrief(dto.getBrief().substring(0,50));
		Long uid = 1L;
		if (dto.getTagId() == -1) {
			Music music = new Music();
			music.setName(dto.getName());
			music.setUid(uid);
			Long mid = musicService.save(music);
			story.setTagId(mid);
		}
		story.setUid(uid);
		Long id = storyService.save(story);
		String url = "/story/"+id;
		return new ResponseData(url);
	}

	@GetMapping(value = "/{storyId}")
	public String get(@PathVariable("storyId") Long id, Model model) {
		StoryVO story = storyService.get(id);
		model.addAttribute("story", story);
		return "story";
	}

}
