package com.mcg.exercise.controller;

import com.mcg.exercise.converter.HouseConverter;
import com.mcg.exercise.entity.House;
import com.mcg.exercise.entity.ResponseVO;
import com.mcg.exercise.entity.User;
import com.mcg.exercise.service.IUserService;
import com.mcg.exercise.vo.HouseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping(value = "/save", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseVO<Long> saveUser(@RequestBody User user) {
        return ResponseVO.success(userService.saveUser(user));
    }
}
