/**
 * Copyright (C), 2019-2019, XXX有限公司
 * FileName: ZanShow
 * Author:   11580
 * Date:     2019/6/10 0010 17:59
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xbleey.entity;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 11580
 * @create 2019/6/10 0010
 * @since 1.0.0
 */
public class ZanShow {
    private Zan zan;
    private Student student;

    public ZanShow(Zan zan, Student student) {
        this.zan = zan;
        this.student = student;
    }

    public Zan getZan() {
        return zan;
    }

    public void setZan(Zan zan) {
        this.zan = zan;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
 

