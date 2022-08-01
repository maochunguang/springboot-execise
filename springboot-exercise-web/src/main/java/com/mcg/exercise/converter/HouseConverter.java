package com.mcg.exercise.converter;

import com.mcg.exercise.entity.House;
import com.mcg.exercise.vo.HouseVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * @author maocg
 * @date 2022-07-31 18:03
 */
@Mapper
public interface HouseConverter {
    HouseConverter INSTANCE = Mappers.getMapper(HouseConverter.class);


    @Mappings({
    })
    House houseVOToHouse(HouseVO houseVO);
}
