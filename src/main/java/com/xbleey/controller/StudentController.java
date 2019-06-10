/**
 * Copyright (C), 2019-2019, XXX有限公司
 * FileName: StudentController
 * Author:   11580
 * Date:     2019/6/10 0010 10:00
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xbleey.controller;

import com.xbleey.dao.StudentDao;
import com.xbleey.entity.Student;
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
 * @create 2019/6/10 0010
 * @since 1.0.0
 */
@Controller
public class StudentController {
    @Resource
    StudentDao studentDao;

    @GetMapping(value = "/students")
    public String students(Model model) {
        List<Student> students = studentDao.findAll();
        model.addAttribute("students", students);
        return "/students";
    }

    @GetMapping(value = "/student")
    public String addStudent() {
        return "/student/add";
    }

    @PutMapping(value = "/student")
    public String updateStudent(Student student) {
        System.out.println(student);
        studentDao.updateByStuId(student.getStuName(), student.getStuForCourse(), student.getStuForGradeId(), student.getStuBeginTime(), student.getStuPhone(), student.getStuId());
        return "redirect:/students";
    }

    @PostMapping(value = "/student")
    public String submitStudent(Student student) {
        System.out.println(student.toString());
        studentDao.save(student);
        return "redirect:/students";
    }

    @GetMapping(value = "/student/{id}")
    public String editStudent(Model model, @PathVariable(value = "id") Integer stuId) {
        Student student = studentDao.getOne(stuId);
        model.addAttribute("student", student);
        return "/student/add";
    }

    @DeleteMapping(value = "/student/{id}")
    public String deleteStudent(@PathVariable(value = "id") Integer stuId) {
        studentDao.deleteByStuId(stuId);
        return "redirect:/students";
    }
}
 

