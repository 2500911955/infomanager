package com.yc.dao;

import com.yc.po.Scienceincentive;

public interface ScienceincentiveMapper {
    int deleteByPrimaryKey(Integer siid);

    int insert(Scienceincentive record);

    int insertSelective(Scienceincentive record);

    Scienceincentive selectByPrimaryKey(Integer siid);

    int updateByPrimaryKeySelective(Scienceincentive record);

    int updateByPrimaryKey(Scienceincentive record);
}