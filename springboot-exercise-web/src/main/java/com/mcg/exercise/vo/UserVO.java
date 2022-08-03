package com.mcg.exercise.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author maocg
 * @date 2022-08-03 23:10
 */
@ApiModel("UserVO")
@Data
public class UserVO {
    @ApiModelProperty(value = "主键id")
    private Long id;

    @ApiModelProperty(value = "用户昵称")
    private String userNick;

    @ApiModelProperty(value = "登录名")
    private String loginName;

    @ApiModelProperty(value = "登录密码")
    private String password;

    @ApiModelProperty(value = "用户描述")
    private String description;

    @ApiModelProperty(value = "用户标签")
    private List<String> tags;

    @ApiModelProperty(value = "头像地址")
    private String avatarUrl;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;
}
