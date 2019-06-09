/**
 * Copyright (C), 2019-2019, XXX有限公司
 * FileName: GradeDao
 * Author:   11580
 * Date:     2019/6/8 0008 21:12
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xbleey.dao;

import com.xbleey.entity.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 11580
 * @create 2019/6/8 0008
 * @since 1.0.0
 */
public interface GradeDao extends JpaRepository<Grade,Integer> {
    public List<Grade> findByGradeId(Integer gradeId);

    @Transactional
    public void deleteByGradeId(Integer gradeId);

    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(value = "update grade e set grade_name=?1, grade_number=?2, grade_open_time=?3, grade_end_time=?4, grade_type=?5 where grade_id=?6",nativeQuery = true)
    public int  updateGradeByGradeId(String gradeName, Integer gradeNumber, Date gradeOpenTime, Date gradeEndTime, String gradeType, Integer gradeId);
}
 

