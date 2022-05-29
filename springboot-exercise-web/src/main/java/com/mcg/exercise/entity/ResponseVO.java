package com.mcg.exercise.entity;

import com.mcg.exercise.enums.ResponseEnum;
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
    public ResponseVO(T data){
        this.data = data;
    }

    public ResponseVO(ResponseEnum responseEnum) {
        this.code = responseEnum.getCode();
        this.message = responseEnum.getDesc();
    }
    public static <T> ResponseVO<T> success(T data){
        ResponseVO<T> responseVO = new ResponseVO<>(data);
        responseVO.setCode(200);
        responseVO.setMessage("Ok");
        return responseVO;
    }
}
