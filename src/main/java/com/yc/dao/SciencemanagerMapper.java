package com.yc.dao;

import com.yc.po.Sciencemanager;

public interface SciencemanagerMapper {
    int deleteByPrimaryKey(Integer smid);

    int insert(Sciencemanager record);

    int insertSelective(Sciencemanager record);

    Sciencemanager selectByPrimaryKey(Integer smid);

    int updateByPrimaryKeySelective(Sciencemanager record);

    int updateByPrimaryKey(Sciencemanager record);
}