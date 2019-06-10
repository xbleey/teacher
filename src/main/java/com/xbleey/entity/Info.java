/**
 * Copyright (C), 2019-2019, XXX有限公司
 * FileName: Info
 * Author:   11580
 * Date:     2019/6/10 0010 14:41
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
@Table(name = "info")
public class Info {
    @Id
    @Column(name = "info_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer infoId;
    @Column(name = "info_mess")
    private String infoMess;
    @Column(name = "info_stu_id")
    private Integer infoStuId;

    public Integer getInfoId() {
        return infoId;
    }

    public void setInfoId(Integer infoId) {
        this.infoId = infoId;
    }

    public String getInfoMess() {
        return infoMess;
    }

    public void setInfoMess(String infoMess) {
        this.infoMess = infoMess;
    }

    public Integer getInfoStuId() {
        return infoStuId;
    }

    public void setInfoStuId(Integer infoStuId) {
        this.infoStuId = infoStuId;
    }

    @Override
    public String toString() {
        return "Info{" +
                "infoId=" + infoId +
                ", infoMess='" + infoMess + '\'' +
                ", infoStuId=" + infoStuId +
                '}';
    }
}
 

