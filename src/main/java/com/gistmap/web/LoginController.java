package com.gistmap.web;

import com.gistmap.comm.Const;
import com.gistmap.comm.ExceptionMsg;
import com.gistmap.comm.Response;
import com.gistmap.comm.ResponseData;
import com.gistmap.entity.User;
import com.gistmap.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;

/**
 * @desc :
 * @author : gistmap
 * @date : 2017/10/8  17:32
 */
@RestController
public class LoginController extends BaseController {

	Logger logger = LoggerFactory.getLogger(this.getClass());
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
		user.setName(user.getUsername());
		user.setPassword(getPwd(user.getPassword()));
		user.setCreateTime(LocalDateTime.now());
		user.setModifyTime(LocalDateTime.now());
		userService.save(user);
		getSession().setAttribute(Const.LOGIN_SESSION_KEY, user);
		return result();
	}

	@PostMapping("/signIn")
	public Response signIn(@RequestBody User user, HttpServletResponse response){
		try {
			User loginUser = userService.getByEmailOrName(user.getUsername());
			if (loginUser == null ) {
				return new ResponseData(ExceptionMsg.LoginNameNotExists);
			}else if(!loginUser.getPassword().equals(getPwd(user.getPassword()))){
				return new ResponseData(ExceptionMsg.LoginNameOrPassWordError);
			}
			Cookie cookie = new Cookie(Const.LOGIN_SESSION_KEY, cookieSign(loginUser.getId().toString()));
			cookie.setMaxAge(Const.COOKIE_TIMEOUT);
			cookie.setPath("/");
			response.addCookie(cookie);
			getSession().setAttribute(Const.LOGIN_SESSION_KEY, loginUser);
			String preUrl = "/";
			return new ResponseData(ExceptionMsg.SUCCESS, preUrl);
		} catch (Exception e) {
			logger.error("login failed, ", e);
			return new ResponseData(ExceptionMsg.FAILED);
		}
	}
}
