package com.gistmap.web;

import com.gistmap.comm.Const;
import com.gistmap.comm.ExceptionMsg;
import com.gistmap.comm.Response;
import com.gistmap.entity.User;
import com.gistmap.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @Desc :
 * @User : gistmap
 * @Date : 2017/10/8  17:32
 */
@RestController
public class LoginController extends BaseController {
	@Autowired
	private UserService userService;

	@PostMapping("/signUp")
	public Response signUp(@RequestBody User user){
		User registUser = userService.getByEmail(user.getEmail());
		if (null != registUser) {
			return result(ExceptionMsg.EmailUsed);
		}
		User nameUser = userService.getByUserName(user.getUsername());
		if (null != nameUser) {
			return result(ExceptionMsg.UserNameUsed);
		}
		user.setPassword(getPwd(user.getPassword()));
		user.setCreateTime(LocalDateTime.now());
		user.setModifyTime(LocalDateTime.now());
		userService.save(user);
		getSession().setAttribute(Const.LOGIN_SESSION_KEY, user);
		return result();
	}
}
