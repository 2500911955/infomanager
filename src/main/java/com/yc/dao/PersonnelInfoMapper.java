package com.yc.dao;

import java.util.List;

import com.yc.po.PersonnelInfo;

public interface PersonnelInfoMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(PersonnelInfo record);

    int insertSelective(PersonnelInfo record);

    PersonnelInfo selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(PersonnelInfo record);

    int updateByPrimaryKey(PersonnelInfo record);

	List findPerson();
}