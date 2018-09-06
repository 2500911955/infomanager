package com.yc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.yc.po.Unit;

public interface UnitMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(Unit record);

    int insertSelective(Unit record);

    Unit selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(Unit record);

    int updateByPrimaryKey(Unit record);

    @Select("select * from unit")
	List<Unit> findAll();
}