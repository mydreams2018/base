package com.landary.base.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Setter
@Getter
public class Employee {
    private Integer id;

    private String username;

    private String realname;

    private String password;

    private Long tel;

    private String email;

    private Long deptid;

    private Date inputtime;

    private Integer state;

    private Boolean admin;
}