package com.landary.base.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class MdJobLog {
    private Long id;

    private String jobName;

    private Integer jobId;

    private Date startTime;

    private Date endTime;

    private Byte state;
}