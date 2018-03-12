package com.pd.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description:
 * @author: youpd@asiainfo.com
 * @create: 2018-03-09 17:23
 */
@Controller
@RequestMapping("/shrio")
public class ShiroHandler {
    @RequestMapping("/login")
    public String login(@RequestParam("userName") String userName, @RequestParam("passWord") String passWord) {
        Subject subject = SecurityUtils.getSubject();
        if (!subject.isAuthenticated()) {
            UsernamePasswordToken token = new UsernamePasswordToken(userName, passWord);
            token.setRememberMe(true);
            subject.login(token);

        }
        return "sucess";
    }

    @RequestMapping("/loginout")
    public String login() {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return "sucess";
    }
}
