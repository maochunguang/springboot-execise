package com.mcg.exercise.vo;

import com.mcg.exercise.entity.ExpressInfo;
import com.mcg.exercise.entity.HouseInfo;
import lombok.Data;

import javax.annotation.Generated;
import java.util.Date;

/**
 * @author maocg
 * @date 2022-07-31 17:47
 */
@Data
public class HouseVO {
    private Long id;

    private String houseAddress;

    private HouseInfo houseInfo;
    private ExpressInfo expressInfo;

    private String communityName;

    private String streetName;

    private Date createTime;

    private Date updateTime;

}
