package com.gistmap.web;

import com.gistmap.comm.Const;
import com.gistmap.comm.ExceptionMsg;
import com.gistmap.comm.Response;
import com.gistmap.comm.ResponseData;
import com.gistmap.mapper.UserMapper;
import com.gistmap.entity.User;
import com.gistmap.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import java.time.LocalDateTime;
import java.util.Map;


/**
 * @Desc : User Controller
 * @User : gistmap
 * @Date : 2017/9/6  22:25
 */

@Controller
public class UserController extends BaseController{

    @Autowired
    private UserService userService;

    @PostMapping("/regist/Email")
    public Response signUp(User user){
        User registUser = userService.findByEmail(user.getEmail());
        if (null != registUser) {
            return result(ExceptionMsg.EmailUsed);
        }
        User nameUser = userService.findByUserName(user.getUsername());
        if (null != nameUser) {
            return result(ExceptionMsg.UserNameUsed);
        }
        user.setPassword(getPwd(user.getPassword()));
        user.setCreateTime(LocalDateTime.now());
        user.setModifyTime(LocalDateTime.now());
        userService.save(user);
        return result();
    }

    @PostMapping("/login")
    public Response signIn(User user) {

        User loginUser = userService.findByEmailOrName(user.getUsername(),user.getEmail());

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
    }
    @PostMapping("/regist/Phone")
    public Response create(User user) {



        return result();
    }



}
