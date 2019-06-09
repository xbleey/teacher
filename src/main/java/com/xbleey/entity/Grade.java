/**
 * Copyright (C), 2019-2019, XXX有限公司
 * FileName: Grade
 * Author:   11580
 * Date:     2019/6/8 0008 20:55
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
@Table(name = "grade")
public class Grade {
    @Id
    @Column(name = "grade_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gradeId;
    @Column(name = "grade_name")
    private String gradeName;
    @Column(name = "grade_number")
    private Integer gradeNumber;
    @Column(name = "grade_open_time")
    private Date gradeOpenTime;
    @Column(name = "grade_end_time")
    private Date gradeEndTime;
    @Column(name = "grade_type")
    private String gradeType;

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public Integer getGradeNumber() {
        return gradeNumber;
    }

    public void setGradeNumber(Integer gradeNumber) {
        this.gradeNumber = gradeNumber;
    }

    public Date getGradeOpenTime() {
        return gradeOpenTime;
    }

    public void setGradeOpenTime(Date gradeOpenTime) {
        this.gradeOpenTime = gradeOpenTime;
    }

    public Date getGradeEndTime() {
        return gradeEndTime;
    }

    public void setGradeEndTime(Date gradeEndTime) {
        this.gradeEndTime = gradeEndTime;
    }

    public String getGradeType() {
        return gradeType;
    }

    public void setGradeType(String gradeType) {
        this.gradeType = gradeType;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "gradeId=" + gradeId +
                ", gradeName='" + gradeName + '\'' +
                ", gradeNumber=" + gradeNumber +
                ", gradeOpenTime=" + gradeOpenTime +
                ", gradeEndTime=" + gradeEndTime +
                ", gradeType='" + gradeType + '\'' +
                '}';
    }
}
 

