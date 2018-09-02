package com.yc.dao;

import com.yc.po.Unit;

public interface UnitMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(Unit record);

    int insertSelective(Unit record);

    Unit selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(Unit record);

    int updateByPrimaryKey(Unit record);
}