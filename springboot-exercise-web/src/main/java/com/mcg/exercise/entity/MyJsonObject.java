package com.mcg.exercise.entity;

import lombok.Data;

/**
 * @author maocg
 * @date 2022-08-01 17:26
 */
@Data
public class MyJsonObject<T> {
    private T t;
    private String javaType;
}
