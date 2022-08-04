package com.mcg.exercise.controller;

import com.mcg.exercise.entity.House;
import com.mcg.exercise.extension.swagger.ApiQueryModel;
import com.mcg.exercise.vo.HouseQueryVO;
import com.mcg.exercise.vo.ResponseVO;
import com.mcg.exercise.service.IHouseService;
import com.mcg.exercise.vo.HouseVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author mao
 * Date：2020/12/27
 * Description：
 */
@Api(value = "房屋数据管理接口")
@RestController
@RequestMapping("/house")
public class HouseController {
    private final IHouseService houseService;

    @Autowired
    public HouseController(IHouseService houseService) {
        this.houseService = houseService;
    }
    @ApiOperation("房屋数据查询接口")
    @GetMapping("/query")
    public ResponseVO<House> queryHouse(@RequestParam("id") Long id) {
        return ResponseVO.success(houseService.queryHouseById(id));
    }
    @ApiOperation("房屋数据保存接口")
    @PostMapping(value = "/save", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseVO<Long> saveUser(@RequestBody HouseVO houseVO) {
        return ResponseVO.success(houseService.saveHouse(houseVO));
    }

    @ApiOperation("房屋数据查询接口")
    @GetMapping("/queryByCondition")
    public ResponseVO<List<House>> queryHouseByCondition(@ApiQueryModel HouseQueryVO queryVO) {
        return ResponseVO.success(houseService.queryHouseByCondition(queryVO));
    }
}
