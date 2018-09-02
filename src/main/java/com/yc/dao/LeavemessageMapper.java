package com.yc.dao;

import com.yc.po.Leavemessage;

public interface LeavemessageMapper {
    int deleteByPrimaryKey(Integer lid);

    int insert(Leavemessage record);

    int insertSelective(Leavemessage record);

    Leavemessage selectByPrimaryKey(Integer lid);

    int updateByPrimaryKeySelective(Leavemessage record);

    int updateByPrimaryKey(Leavemessage record);
}