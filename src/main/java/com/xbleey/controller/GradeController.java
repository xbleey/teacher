/**
 * Copyright (C), 2019-2019, XXX有限公司
 * FileName: GradeController
 * Author:   11580
 * Date:     2019/6/9 0009 13:02
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xbleey.controller;

import com.xbleey.dao.GradeDao;
import com.xbleey.entity.Grade;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 11580
 * @create 2019/6/9 0009
 * @since 1.0.0
 */
@Controller
public class GradeController {
    @Resource
    GradeDao gradeDao;

    @GetMapping(value = "/grades")
    public String grade(Model model) {
        List<Grade> grades = gradeDao.findAll();
        model.addAttribute("grades", grades);
        return "grades";
    }


    @GetMapping(value = "/grade/{id}")
    public String editGrade(Model model, @PathVariable(value = "id") Integer gradeId) {
        List<Grade> grades = gradeDao.findByGradeId(gradeId);
        if (grades.isEmpty()) {
            return "grades";
        } else {
            model.addAttribute("grade", grades.get(0));
            return "grade/add";
        }
    }

    @DeleteMapping(value = "/grade/{id}")
    public String deleteGrade(Model model, @PathVariable(value = "id") Integer gradeId) {
        gradeDao.deleteByGradeId(gradeId);
        return "redirect:/grades";
    }

    @GetMapping(value = "/grade")
    public String addGrade() {
        return "grade/add";
    }

    @PostMapping(value = "/grade")
    public String submitGrade(Model model, Grade grade) {
        System.out.println(grade.toString());
        if (grade.isAllContain() == null) {
            gradeDao.save(grade);
        }
        return "redirect:/grades";
    }

    @PutMapping(value = "/grade")
    public String updateGrade(Model model, Grade grade) {
        if (grade.isAllContain() == null) {
            gradeDao.updateGradeByGradeId(grade.getGradeName(), grade.getGradeNumber(), grade.getGradeOpenTime(), grade.getGradeEndTime(), grade.getGradeType(), grade.getGradeId());
            System.out.println(grade.toString());
        }
        return "redirect:/grades";
    }
}
 

