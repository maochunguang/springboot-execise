package com.mcg.execise.controller;

import com.mcg.execise.enums.ResponseEnum;
import com.mcg.execise.exception.BusinessException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mao
 * Date：2020/12/27
 * Description：
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/say")
    public String sayHello() {
        return "hello world!";
    }

    @GetMapping("/sayEx")
    public String sayHelloException(@RequestParam(required = false) String name) throws BusinessException {
        if (name == null) {
            throw new BusinessException(ResponseEnum.BUSINESS_ERROR);
        }
        return "hello world!";
    }
}
