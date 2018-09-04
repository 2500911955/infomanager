package com.yc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.yc.po.PersonnelInfo;

public interface PersonnelInfoMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(PersonnelInfo record);

    int insertSelective(PersonnelInfo record);

    PersonnelInfo selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(PersonnelInfo record);

    int updateByPrimaryKey(PersonnelInfo record);

	List findPerson();
	
	@Select("select * from personnel_info where pname = #{username} and ppassword = #{password}")
	PersonnelInfo isLogin(@Param("username")String username,@Param("password")String password);
}