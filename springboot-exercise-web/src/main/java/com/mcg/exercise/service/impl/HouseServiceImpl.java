package com.mcg.exercise.service.impl;

import com.mcg.exercise.converter.HouseConverter;
import com.mcg.exercise.dao.HouseMapper;
import com.mcg.exercise.entity.House;
import com.mcg.exercise.service.IHouseService;
import com.mcg.exercise.vo.HouseVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author maocg
 * @date 2022-07-31 17:49
 */
@Service
@Slf4j
public class HouseServiceImpl implements IHouseService {
    @Resource
    private HouseMapper houseMapper;

    @Override
    public House queryHouseById(Long id) {
        return houseMapper.selectByPrimaryKey(id).get();
    }

    @Override
    public Long saveHouse(HouseVO houseVO) {
        House house = HouseConverter.INSTANCE.houseVOToHouse(houseVO);
        houseMapper.insertSelective(house);
        return house.getId();
    }
}
