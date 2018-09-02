package com.yc.dao;

import com.yc.po.UserRole;

public interface UserRoleMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(UserRole record);

    int insertSelective(UserRole record);

    UserRole selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);
}