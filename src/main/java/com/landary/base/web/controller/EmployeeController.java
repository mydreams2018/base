package com.landary.base.web.controller;

import com.landary.base.domain.Employee;
import com.landary.base.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/deleteByPrimaryKey")
    public int deleteByPrimaryKey(@RequestParam Integer id){
        return employeeService.deleteByPrimaryKey(id);
    }
    @RequestMapping(value = "/selectByPrimaryKey")
    public Employee selectByPrimaryKey(@RequestParam Integer id) {
        return employeeService.selectByPrimaryKey(id);
    }
}