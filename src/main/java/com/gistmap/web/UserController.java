package com.gistmap.web;

import com.gistmap.comm.Const;
import com.gistmap.comm.ExceptionMsg;
import com.gistmap.comm.Response;
import com.gistmap.comm.ResponseData;
import com.gistmap.entity.Music;
import com.gistmap.entity.User;
import com.gistmap.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import java.time.LocalDateTime;


/**
 * @Desc : User Controller
 * @User : gistmap
 * @Date : 2017/9/6  22:25
 */

@Controller
@RequestMapping("/user")
public class UserController extends BaseController{

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String user(){
        return "user";
    }


    /*@PostMapping("/login")
    public Response signIn(User user) {

        User loginUser = userService.getByEmailOrName(user.getUsername(),user.getEmail());

        if (loginUser == null) {
            return result(ExceptionMsg.LoginNameNotExists);
        }
        else if ( !loginUser.getPassword().equals((getPwd(user.getPassword())))){
            return result(ExceptionMsg.LoginNameOrPassWordError);
        }
        Cookie cookie = new Cookie(Const.LOGIN_SESSION_KEY,cookieSign(loginUser.getId().toString()));
        cookie.setMaxAge(Const.COOKIE_TIMEOUT);
        cookie.setPath("/");

        if ( null != getSession().getAttribute(Const.LAST_REFERER) ){
            //跳转之前页面
        }
        return new ResponseData(ExceptionMsg.SUCCESS,"");
    }*/


}
