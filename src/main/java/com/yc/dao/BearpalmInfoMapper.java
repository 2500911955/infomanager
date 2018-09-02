package com.yc.dao;

import com.yc.po.BearpalmInfo;

public interface BearpalmInfoMapper {
    int deleteByPrimaryKey(Integer bid);

    int insert(BearpalmInfo record);

    int insertSelective(BearpalmInfo record);

    BearpalmInfo selectByPrimaryKey(Integer bid);

    int updateByPrimaryKeySelective(BearpalmInfo record);

    int updateByPrimaryKey(BearpalmInfo record);
}