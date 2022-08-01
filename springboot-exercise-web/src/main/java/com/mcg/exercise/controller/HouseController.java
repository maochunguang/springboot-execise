package com.mcg.exercise.controller;

import com.mcg.exercise.converter.HouseConverter;
import com.mcg.exercise.entity.House;
import com.mcg.exercise.entity.ResponseVO;
import com.mcg.exercise.entity.User;
import com.mcg.exercise.service.IHouseService;
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
@RequestMapping("/house")
public class HouseController {
    private final IHouseService houseService;

    @Autowired
    public HouseController(IHouseService houseService) {
        this.houseService = houseService;
    }

    @GetMapping("/query")
    public ResponseVO<House> queryUser(@RequestParam("id") Long id) {
        return ResponseVO.success(houseService.queryHouseById(id));
    }

    @PostMapping(value = "/save", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseVO<Long> saveUser(@RequestBody HouseVO houseVO) {
        House house = HouseConverter.INSTANCE.houseVOToHouse(houseVO);
        return ResponseVO.success(houseService.saveHouse(house));
    }
}
