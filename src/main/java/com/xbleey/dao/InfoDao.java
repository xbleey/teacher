/**
 * Copyright (C), 2019-2019, XXX有限公司
 * FileName: InfoDao
 * Author:   11580
 * Date:     2019/6/10 0010 14:51
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xbleey.dao;

import com.xbleey.entity.Info;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 11580
 * @create 2019/6/10 0010
 * @since 1.0.0
 */
public interface InfoDao extends JpaRepository<Info, Integer> {
    @Transactional
    public void deleteByInfoId(Integer infoId);
}
 

