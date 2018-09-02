package com.yc.dao;

import com.yc.po.RoleAuth;

public interface RoleAuthMapper {
    int deleteByPrimaryKey(Integer raid);

    int insert(RoleAuth record);

    int insertSelective(RoleAuth record);

    RoleAuth selectByPrimaryKey(Integer raid);

    int updateByPrimaryKeySelective(RoleAuth record);

    int updateByPrimaryKey(RoleAuth record);
}