package com.mcg.exercise.service;

import com.mcg.exercise.entity.User;

/**
 * @author maocg
 * @date 2022-05-28 23:05
 */
public interface IUserService {
    /**
     * 查询user
     * @param id 主键
     * @return User
     */
    User queryUserById(Long id);
}
