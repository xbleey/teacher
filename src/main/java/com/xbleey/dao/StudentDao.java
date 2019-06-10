/**
 * Copyright (C), 2019-2019, XXX有限公司
 * FileName: StudentDao
 * Author:   11580
 * Date:     2019/6/8 0008 21:13
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xbleey.dao;

import com.xbleey.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 11580
 * @create 2019/6/8 0008
 * @since 1.0.0
 */
public interface StudentDao extends JpaRepository<Student, Integer> {
    @Transactional
    public void deleteByStuId(Integer stuId);

    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(value = "update Student e set stu_name=?1, stu_for_course=?2, stu_for_grade_id=?3, stu_begin_time=?4, stu_phone=?5 where stu_id=?6")
    public void updateByStuId(String stuName, String stuForCourse, Integer stuForGradeId, Date stuBeginTime, Long stuPhone, Integer stuId);
}