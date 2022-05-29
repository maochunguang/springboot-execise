package com.mcg.exercise.advice;

import com.mcg.exercise.entity.ResponseVO;
import com.mcg.exercise.enums.ResponseEnum;
import com.mcg.exercise.exception.BusinessException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author mao
 * Date：2020/12/27
 * Description：全局异常处理
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionAdvice {
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public ResponseVO<Object> errorHandler(Exception e) {
        log.error("not cached exception", e);
        return new ResponseVO<>(ResponseEnum.UNKNOWN_ERROR);
    }

    @ResponseBody
    @ExceptionHandler(value = BusinessException.class)
    public ResponseVO<Object> businessErrorHandler(BusinessException e) {
        log.error("business unExcepted Exception", e);
        return new ResponseVO<>(ResponseEnum.BUSINESS_ERROR);
    }
}
