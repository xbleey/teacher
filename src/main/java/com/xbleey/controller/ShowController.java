/**
 * Copyright (C), 2019-2019, XXX有限公司
 * FileName: ShowController
 * Author:   11580
 * Date:     2019/6/10 0010 22:55
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xbleey.controller;

import com.xbleey.dao.InfoDao;
import com.xbleey.dao.StudentDao;
import com.xbleey.entity.Info;
import com.xbleey.entity.InfoShow;
import com.xbleey.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Collections;
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
public class ShowController {

    @Autowired
    InfoDao infoDao;
    @Autowired
    StudentDao studentDao;

    @GetMapping(value = "/show")
    public String show(Model model) {
        ArrayList<InfoShow> infoShows = new ArrayList<>();
        List<Info> infos = infoDao.findAll();
        for (Info i : infos) {
            if (i.getInfoStuId() != null) {
                infoShows.add(new InfoShow(i, studentDao.getOne(i.getInfoStuId())));
            } else {
                Student student = new Student();
                student.setStuName("匿名用户");
                infoShows.add(new InfoShow(i, student));
            }
        }
        Collections.reverse(infoShows);
        model.addAttribute("infoShows",infoShows);
        return "show";
    }

}
 

