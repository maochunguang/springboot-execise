package com.mcg.exercise.service.impl;

import com.mcg.exercise.converter.UserConverter;
import com.mcg.exercise.dao.UserMapper;
import com.mcg.exercise.entity.User;
import com.mcg.exercise.operate.service.OperateService;
import com.mcg.exercise.service.IUserService;
import com.mcg.exercise.vo.UserVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private OperateService operateService;

    @Override
    public User queryUserById(Long id) {
        log.info("queryUserById operate");
        operateService.operateLog();
        return userMapper.selectByPrimaryKey(id).orElse(null);
    }

    @Override
    public Long saveUser(UserVO userVO) {
        User user = UserConverter.INSTANCE.userVOToUser(userVO);
        userMapper.insertSelective(user);
        return user.getId();
    }
}
