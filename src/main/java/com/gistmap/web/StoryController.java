package com.gistmap.web;

import com.gistmap.comm.Response;
import com.gistmap.entity.Story;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Desc :
 * @User : gistmap
 * @Date : 2017/10/7  14:11
 */
@Controller
public class StoryController extends BaseController {

	@PostMapping("/story/add")
	@ResponseBody
	public Response save(@RequestBody Story story){
		Long uid = getUserId();
		story.setUid(uid);
		return null;
	}
}
