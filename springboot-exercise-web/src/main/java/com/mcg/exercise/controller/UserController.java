package com.mcg.exercise.controller;

import com.mcg.exercise.vo.ResponseVO;
import com.mcg.exercise.entity.User;
import com.mcg.exercise.service.IUserService;
import com.mcg.exercise.vo.UserVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author mao
 * Date：2020/12/27
 * Description：
 */
@Api(value = "用户数据管理接口")
@RestController
@RequestMapping("/user")
public class UserController {
    private final IUserService userService;

    @Autowired
    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @ApiOperation("查询用户数据")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户id", required = true, dataType = "long", paramType = "query"),
    })
    @GetMapping("/queryUser")
    public ResponseVO<User> queryUser(@RequestParam("id") Long id) {
        return ResponseVO.success(userService.queryUserById(id));
    }
    @ApiOperation("用户数据保存接口")
    @PostMapping(value = "/save", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseVO<Long> saveUser(@RequestBody UserVO userVO) {
        return ResponseVO.success(userService.saveUser(userVO));
    }
}
