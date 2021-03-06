package com.gistmap.web;

import com.gistmap.comm.RelativeDateFormat;
import com.gistmap.entity.StoryVO;
import com.gistmap.service.StoryService;
import com.gistmap.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


/**
 * @desc : User Controller
 * @author : gistmap
 * @date : 2017/9/6  22:25
 */

@Controller
@RequestMapping("/user")
public class UserController extends BaseController{

    @Autowired
    private UserService userService;
    @Autowired
    private StoryService storyService;

    @GetMapping("/")
    public String index(Map<String,Object> model){
        Long uid = getUserId();
        List<StoryVO> list = storyService.list(uid);
        list.forEach(vo ->{
            vo.setDateStr(RelativeDateFormat.format(vo.getCreateTime()));
        });
        model.put("stories",list);
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
