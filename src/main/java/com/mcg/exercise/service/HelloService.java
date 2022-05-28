package com.mcg.exercise.service;

import com.mcg.exercise.dao.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author mao
 * Date：2021/1/3
 * Description：
 */
@Service
public class HelloService {
    @Resource
    private UserMapper userMapper;

    public void sayHello() {

    }
}
