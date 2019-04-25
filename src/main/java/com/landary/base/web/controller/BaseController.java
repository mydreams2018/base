package com.landary.base.web.controller;

import com.landary.base.domain.MdJobLog;
import com.landary.base.service.MdJobLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/mdJobLog")
public class BaseController {
    @Autowired
    private MdJobLogService mdJobLogService;

    @RequestMapping(value = "/selectByPrimaryKey")
    public MdJobLog selectByPrimaryKey(@RequestParam long id){
       return mdJobLogService.selectByPrimaryKey(id);
    }

    @RequestMapping(value = "/deleteByPrimaryKey")
    public int deleteByPrimaryKey(@RequestParam long id){
        return mdJobLogService.deleteByPrimaryKey(id);
    }

}