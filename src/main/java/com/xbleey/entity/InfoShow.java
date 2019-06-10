/**
 * Copyright (C), 2019-2019, XXX有限公司
 * FileName: InfoShow
 * Author:   11580
 * Date:     2019/6/10 0010 16:56
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xbleey.entity;

import javax.persistence.Entity;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 11580
 * @create 2019/6/10 0010
 * @since 1.0.0
 */
public class InfoShow {
    private Info info;
    private Student student;

    public InfoShow(Info info, Student student) {
        this.info = info;
        this.student = student;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
 

