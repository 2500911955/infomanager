package com.yc.dao;

import com.yc.po.Auth;

public interface AuthMapper {
    int deleteByPrimaryKey(Integer aid);

    int insert(Auth record);

    int insertSelective(Auth record);

    Auth selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(Auth record);

    int updateByPrimaryKey(Auth record);
}