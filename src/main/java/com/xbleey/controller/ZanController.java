/**
 * Copyright (C), 2019-2019, XXX有限公司
 * FileName: ZanController
 * Author:   11580
 * Date:     2019/6/10 0010 17:47
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xbleey.controller;

import com.xbleey.dao.StudentDao;
import com.xbleey.dao.ZanDao;
import com.xbleey.entity.Student;
import com.xbleey.entity.Zan;
import com.xbleey.entity.ZanShow;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.text.DecimalFormat;
import java.util.ArrayList;
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
public class ZanController {
    @Resource
    ZanDao zanDao;
    @Resource
    StudentDao studentDao;

    @GetMapping(value = "/zans")
    public String zans(Model model) {
        List<Zan> zans = zanDao.findAll();
        ArrayList<ZanShow> zanShows = new ArrayList<>();
        //平均赞数avgZan,总赞数totalZan
        double totalZan = 0;
        for (Zan z : zans) {
            totalZan += z.getZanLevel();
            zanShows.add(new ZanShow(z, studentDao.getOne(z.getZanStuId())));
        }
        DecimalFormat decimalFormat = new DecimalFormat(".00");
        model.addAttribute("avgZan", decimalFormat.format(totalZan / zans.size()));
        model.addAttribute("zanShows", zanShows);
        return "zans";
    }

    @GetMapping(value = "/zan")
    public String getInfo(@RequestParam(value = "gradeId") Integer gradeId, @RequestParam(value = "stuName") String stuName, @RequestParam(value = "teacherName") String teacherName, @RequestParam(value = "zanLevel") Integer zanLevel) {
        System.out.println(gradeId + stuName + teacherName);
        System.out.println(zanLevel);
        List<Student> students = studentDao.findAll();
        for(Student s:students){
            if(s.getStuName().equals(stuName)&&s.getStuForGradeId().equals(gradeId)){
                Zan zan = new Zan();
                zan.setZanLevel(zanLevel);
                zan.setZanStuId(s.getStuId());
                zan.setZanTeacherName(teacherName);
                zanDao.save(zan);
            }
        }
        return "redirect:/show";
    }
}
 

