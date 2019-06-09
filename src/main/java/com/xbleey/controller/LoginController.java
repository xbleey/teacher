/**
 * Copyright (C), 2019-2019, XXX有限公司
 * FileName: LoginController
 * Author:   11580
 * Date:     2019/6/9 0009 11:09
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xbleey.controller;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 11580
 * @create 2019/6/9 0009
 * @since 1.0.0
 */
@Controller
public class LoginController {

    @PostMapping(value = "/login")
    public String login(@RequestParam(value = "username") String userName, @RequestParam(value = "password") String passWord, Model model) {
        if (userName.equals("123") && passWord.equals("123")) {
            return "index";
        } else {
            model.addAttribute("message","登录失败！帐号或密码错误");
            return "login";
        }
    }
}
 

