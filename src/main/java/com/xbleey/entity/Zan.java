/**
 * Copyright (C), 2019-2019, XXX有限公司
 * FileName: Zan
 * Author:   11580
 * Date:     2019/6/10 0010 17:15
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xbleey.entity;

import javax.persistence.*;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 11580
 * @create 2019/6/10 0010
 * @since 1.0.0
 */
@Entity
@Table(name = "zan")
public class Zan {
    @Id
    @Column(name = "zan_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer zanId;
    @Column(name = "zan_level")
    private Integer zanLevel;
    @Column(name = "zan_stu_id")
    private Integer zanStuId;
    @Column(name = "zan_teacher_name")
    private String zanTeacherName;

    public Integer getZanId() {
        return zanId;
    }

    public void setZanId(Integer zanId) {
        this.zanId = zanId;
    }

    public Integer getZanLevel() {
        return zanLevel;
    }

    public void setZanLevel(Integer zanLevel) {
        this.zanLevel = zanLevel;
    }

    public Integer getZanStuId() {
        return zanStuId;
    }

    public void setZanStuId(Integer zanStuId) {
        this.zanStuId = zanStuId;
    }

    public String getZanTeacherName() {
        return zanTeacherName;
    }

    public void setZanTeacherName(String zanTeacherName) {
        this.zanTeacherName = zanTeacherName;
    }

    @Override
    public String toString() {
        return "Zan{" +
                "zanId=" + zanId +
                ", zanLevel=" + zanLevel +
                ", zanStuId=" + zanStuId +
                ", zanTeacherName='" + zanTeacherName + '\'' +
                '}';
    }
}
 

