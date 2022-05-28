package com.mcg.exercise.exception;

import com.mcg.exercise.enums.ResponseEnum;

/**
 * @author mao
 * Date：2020/12/27
 * Description：
 */
public class BusinessException extends Exception {

    public BusinessException(ResponseEnum responseEnum) {
        super(responseEnum.getDesc());
    }
}
