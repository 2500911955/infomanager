package com.yc.dao;

import com.yc.po.Scienceapply;

public interface ScienceapplyMapper {
    int deleteByPrimaryKey(Integer said);

    int insert(Scienceapply record);

    int insertSelective(Scienceapply record);

    Scienceapply selectByPrimaryKey(Integer said);

    int updateByPrimaryKeySelective(Scienceapply record);

    int updateByPrimaryKey(Scienceapply record);
}