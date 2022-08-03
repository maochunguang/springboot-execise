package com.mcg.exercise.converter;

import com.mcg.exercise.entity.House;
import com.mcg.exercise.entity.User;
import com.mcg.exercise.vo.HouseVO;
import com.mcg.exercise.vo.UserVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * @author maocg
 * @date 2022-07-31 18:03
 */
@Mapper
public interface UserConverter {
    UserConverter INSTANCE = Mappers.getMapper(UserConverter.class);


    @Mappings({
    })
    User userVOToUser(UserVO userVO);
}
