package com.mcg.exercise.controller;

import com.mcg.exercise.entity.ResponseVO;
import com.mcg.exercise.entity.User;
import com.mcg.exercise.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mao
 * Date：2020/12/27
 * Description：
 */
@RestController
@RequestMapping("/user")
public class UserController {
    private final IUserService userService;

    @Autowired
    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @GetMapping("/queryUser")
    public ResponseVO<User> queryUser(@RequestParam("id") Long id) {
        return ResponseVO.success(userService.queryUserById(id));
    }
}
