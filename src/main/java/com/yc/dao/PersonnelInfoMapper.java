package com.yc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Update;

import com.yc.po.PersonnelInfo;

public interface PersonnelInfoMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(PersonnelInfo record);

    int insertSelective(PersonnelInfo record);

    PersonnelInfo selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(PersonnelInfo record);

    int updateByPrimaryKey(PersonnelInfo record);

	List<PersonnelInfo> findAll();

	@Update("UPDATE personnel_info SET pstarts = 1 WHERE pid = #{pid}")
	int deleteByKey(Integer pid);
}