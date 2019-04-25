package com.landary.base.service;

import com.landary.base.domain.Employee;

import java.util.List;

public interface EmployeeService {
    int deleteByPrimaryKey(Integer id);

    int insert(Employee record);

    Employee selectByPrimaryKey(Integer id);

    List<Employee> selectAll();

    int updateByPrimaryKey(Employee record);
}
