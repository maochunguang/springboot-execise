package com.mcg.exercise.vo;

import com.mcg.exercise.entity.ExpressInfo;
import com.mcg.exercise.entity.HouseInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.annotation.Generated;
import java.util.Date;

/**
 * @author maocg
 * @date 2022-07-31 17:47
 */
@ApiModel("HouseVO")
@Data
public class HouseVO {
    @ApiModelProperty(value = "房屋主键")
    private Long id;

    @ApiModelProperty(value = "房屋地址")
    private String houseAddress;

    @ApiModelProperty(value = "房屋格局信息")
    private HouseInfo houseInfo;

    @ApiModelProperty(value = "快递信息")
    private ExpressInfo expressInfo;

    @ApiModelProperty(value = "小区名字")
    private String communityName;

    @ApiModelProperty(value = "街道名字")
    private String streetName;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

}
