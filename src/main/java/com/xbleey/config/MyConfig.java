/**
 * Copyright (C), 2019-2019, XXX有限公司
 * FileName: MyConfig
 * Author:   11580
 * Date:     2019/6/8 0008 21:29
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xbleey.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 11580
 * @create 2019/6/8 0008
 * @since 1.0.0
 */
@Configuration
public class MyConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/go").setViewName("login");
        registry.addViewController("/").setViewName("forward:/go");
        registry.addViewController("/index").setViewName("index");
    }
}
 

