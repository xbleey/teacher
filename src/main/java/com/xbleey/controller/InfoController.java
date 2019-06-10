/**
 * Copyright (C), 2019-2019, XXX有限公司
 * FileName: InfoController
 * Author:   11580
 * Date:     2019/6/10 0010 15:01
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xbleey.controller;

import com.xbleey.dao.InfoDao;
import com.xbleey.entity.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 11580
 * @create 2019/6/10 0010
 * @since 1.0.0
 */
@Controller
public class InfoController {
    @Autowired
    InfoDao infoDao;

    @GetMapping(value = "infos")
    public String infos(Model model){
        List<Info> infos = infoDao.findAll();
        model.addAttribute("infos",infos);
        return "infos";
    }
}
 

