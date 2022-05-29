package com.mcg.exercise.configuration;

import com.mcg.exercise.filter.CostTimeFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author mao
 * Date：2021/1/1
 * Description：所有过滤器设置类
 */
@Configuration
public class FilterConfiguration {
    @Bean
    public FilterRegistrationBean<CostTimeFilter> registerFilter() {
        FilterRegistrationBean<CostTimeFilter> registration = new FilterRegistrationBean<>();
        registration.setFilter(new CostTimeFilter());
        registration.addUrlPatterns("/*");
        registration.setName("CostTimeFilter");
        registration.setOrder(1);
        return registration;
    }
}
