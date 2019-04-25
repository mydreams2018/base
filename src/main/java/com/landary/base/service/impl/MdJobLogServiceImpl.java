package com.landary.base.service.impl;

import com.landary.base.domain.MdJobLog;
import com.landary.base.mapper.MdJobLogMapper;
import com.landary.base.service.MdJobLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MdJobLogServiceImpl implements MdJobLogService {
    @Autowired
    private MdJobLogMapper mdJobLogMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        int i = mdJobLogMapper.deleteByPrimaryKey(id);
        int a = 2/0;
        return i;
    }

    @Override
    public int insert(MdJobLog record) {
        return mdJobLogMapper.insert(record);
    }

    @Override
    public MdJobLog selectByPrimaryKey(Long id) {
        return mdJobLogMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<MdJobLog> selectAll() {
        return mdJobLogMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(MdJobLog record) {
        return mdJobLogMapper.updateByPrimaryKey(record);
    }
}
