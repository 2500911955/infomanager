package com.yc.dao;

import com.yc.po.Recommend;

public interface RecommendMapper {
    int deleteByPrimaryKey(Integer rid);

    int insert(Recommend record);

    int insertSelective(Recommend record);

    Recommend selectByPrimaryKey(Integer rid);

    int updateByPrimaryKeySelective(Recommend record);

    int updateByPrimaryKey(Recommend record);
}