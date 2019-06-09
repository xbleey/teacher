/**
 * Copyright (C), 2019-2019, XXX有限公司
 * FileName: Student
 * Author:   11580
 * Date:     2019/6/8 0008 21:00
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xbleey.entity;

import javax.persistence.*;
import java.sql.Date;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 11580
 * @create 2019/6/8 0008
 * @since 1.0.0
 */
@Entity
@Table(name = "student")
public class Student {
    @Id
    @Column(name = "stu_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer stuId;
    @Column(name = "stu_name")
    private String stuName;
    @Column(name = "stu_for_course")
    private String stuForCourse;
    @Column(name = "stu_for_grade_id")
    private Integer stuForGradeId;
    @Column(name = "stu_begin_time")
    private Date stuBeginTime;
    @Column(name = "stu_phone")
    private Long stuPhone;

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuForCourse() {
        return stuForCourse;
    }

    public void setStuForCourse(String stuForCourse) {
        this.stuForCourse = stuForCourse;
    }

    public Integer getStuForGradeId() {
        return stuForGradeId;
    }

    public void setStuForGradeId(Integer stuForGradeId) {
        this.stuForGradeId = stuForGradeId;
    }

    public Date getStuBeginTime() {
        return stuBeginTime;
    }

    public void setStuBeginTime(Date stuBeginTime) {
        this.stuBeginTime = stuBeginTime;
    }

    public Long getStuPhone() {
        return stuPhone;
    }

    public void setStuPhone(Long stuPhone) {
        this.stuPhone = stuPhone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", stuForCourse='" + stuForCourse + '\'' +
                ", stuForGradeId=" + stuForGradeId +
                ", stuBeginTime=" + stuBeginTime +
                ", stuPhone=" + stuPhone +
                '}';
    }
}
 

