package com.mcg.execise.extension.annotation;

import java.lang.annotation.*;

/**
 * 自定义注解，防止表单重复体提交
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RepeatSubmit {

}