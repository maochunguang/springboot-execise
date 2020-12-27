package com.mcg.execise.entity;

import com.mcg.execise.enums.ResponseEnum;
import lombok.Data;

/**
 * @author mao
 * Date：2020/12/27
 * Description：
 */
@Data
public class ResponseVO<T> {
    private Integer code;
    private String message;
    private T data;

    public ResponseVO() {
    }

    public ResponseVO(ResponseEnum responseEnum) {
        this.code = responseEnum.getCode();
        this.message = responseEnum.getDesc();
    }
}
