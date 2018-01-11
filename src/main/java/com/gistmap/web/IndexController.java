package com.gistmap.web;

import com.gistmap.entity.StoryVO;
import com.gistmap.service.StoryService;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @desc : 跳转
 * @author : gistmap
 * @date : 2017/9/16  11:50
 */
@Controller
public class IndexController {

	@Autowired
	private StoryService storyService;

	@GetMapping("/")
	public String home(Model model) {
		List<StoryVO> list = storyService.list(null);
		model.addAttribute("stories",list);
		return "main";
	}
	@GetMapping("/login")
	public String login(){
		return "login";
	}
	@GetMapping("/regist")
	public String regist() {
		return "regist";
	}
	@GetMapping("/write")
	public String write() {
		return "write";
	}
}
