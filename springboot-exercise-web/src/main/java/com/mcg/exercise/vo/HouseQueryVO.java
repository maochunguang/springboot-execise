package com.mcg.exercise.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author maocg
 * @date 2022-08-04 08:59
 */
@Data
public class HouseQueryVO {
    @ApiModelProperty(value = "房屋主键")
    private Long id;

    @ApiModelProperty(value = "房屋地址")
    private String houseAddress;

    @ApiModelProperty(value = "小区名字")
    private String communityName;
}
