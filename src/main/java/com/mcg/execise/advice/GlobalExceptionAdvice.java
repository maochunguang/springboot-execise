package com.mcg.execise.advice;

import com.mcg.execise.entity.ResponseVO;
import com.mcg.execise.enums.ResponseEnum;
import com.mcg.execise.exception.BusinessException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author mao
 * Date：2020/12/27
 * Description：
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionAdvice {
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public ResponseVO errorHandler(Exception e) {
        log.error("not cached exception", e);
        return new ResponseVO<>(ResponseEnum.UNKNOWN_ERROR);
    }

    @ResponseBody
    @ExceptionHandler(value = BusinessException.class)
    public ResponseVO businessErrorHandler(BusinessException e) {
        log.error("business unExcepted Exception", e);
        return new ResponseVO<>(ResponseEnum.BUSINESS_ERROR);
    }
}
