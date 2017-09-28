package com.gistmap.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Desc : 跳转
 * @User : gistmap
 * @Date : 2017/9/16  11:50
 */
@Controller
public class IndexController {

	@GetMapping("/login")
	public String login(){
		return "login";
	}

	@GetMapping("/regist")
	public String regist() {
		return "regist";
	}

	@GetMapping("/main")
	public String main() {
		return "main";
	}
}
