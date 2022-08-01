package com.mcg.exercise.service;

import com.mcg.exercise.entity.House;
import com.mcg.exercise.entity.User;

/**
 * @author maocg
 * @date 2022-05-28 23:05
 */
public interface IHouseService {
    /**
     * 查询user
     * @param id 主键
     * @return User
     */
    House queryHouseById(Long id);

    /**
     * 保存house
     * @param house 数据
     * @return 主键
     */
    Long saveHouse(House house);
}
