package com.landary.base.service;

import com.landary.base.domain.MdJobLog;

import java.util.List;

public interface MdJobLogService {
    int deleteByPrimaryKey(Long id);

    int insert(MdJobLog record);

    MdJobLog selectByPrimaryKey(Long id);

    List<MdJobLog> selectAll();

    int updateByPrimaryKey(MdJobLog record);
}
