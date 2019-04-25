package com.landary.base.mapper;

import com.landary.base.domain.MdJobLog;
import java.util.List;

public interface MdJobLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MdJobLog record);

    MdJobLog selectByPrimaryKey(Long id);

    List<MdJobLog> selectAll();

    int updateByPrimaryKey(MdJobLog record);
}