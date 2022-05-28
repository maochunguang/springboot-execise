package com.mcg.exercise.service.impl;

import com.mcg.exercise.dao.UserMapper;
import com.mcg.exercise.entity.User;
import com.mcg.exercise.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author maocg
 * @date 2022-05-28 23:04
 */
@Service
@Slf4j
public class UserServiceImpl implements IUserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User queryUserById(Long id) {
        return userMapper.selectByPrimaryKey(id).orElse(null);
    }
}
