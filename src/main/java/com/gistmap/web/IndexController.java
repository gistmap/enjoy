package com.gistmap.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @desc : 跳转
 * @author : gistmap
 * @date : 2017/9/16  11:50
 */
@Controller
public class IndexController {

	@GetMapping("/")
	public String home() {
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
