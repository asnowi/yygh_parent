package com.atguigu.yygh.hosp.controller;

import com.atguigu.yygh.common.result.Result;
import com.atguigu.yygh.hosp.service.IHospitalSetService;
import com.atguigu.yygh.model.hosp.HospitalSet;
import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author gaoguanqi
 * @version 1.0
 * @date 2021/3/12 8:49
 */
@Api(tags = "hospital设置管理")
@RestController
@RequestMapping("/admin/hosp/hospitalSet")
public class HospitalSetController {

    @Autowired
    private IHospitalSetService hospitalSetService;

    @ApiOperation(value = "获取所有医院设置")
    @GetMapping
    public Result findAllHospitalSet(){
        List<HospitalSet> list = hospitalSetService.list();
        if(CollectionUtils.isEmpty(list)){
            return Result.ok();
        }else {
            return Result.ok();
        }
    }
}
