package com.mcg.execise.extension.annotation;

import com.mcg.execise.enums.DataSourceType;

import java.lang.annotation.*;

/**
 * @author mao
 * @date 2021/1/17
 * @description 数据源切换注解
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface DataSource {

    DataSourceType value() default DataSourceType.MASTER;
}
