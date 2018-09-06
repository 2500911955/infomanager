package com.yc.dao;

import java.util.List;

<<<<<<< HEAD
import org.apache.ibatis.annotations.Update;
=======
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
>>>>>>> branch 'master' of https://github.com/2500911955/infomanager.git

import com.yc.po.PersonnelInfo;

public interface PersonnelInfoMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(PersonnelInfo record);

    int insertSelective(PersonnelInfo record);

    PersonnelInfo selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(PersonnelInfo record);

    int updateByPrimaryKey(PersonnelInfo record);

<<<<<<< HEAD
	List<PersonnelInfo> findAll();

	@Update("UPDATE personnel_info SET pstarts = 1 WHERE pid = #{pid}")
	int deleteByKey(Integer pid);
=======
	List findPerson();
	
	@Select("select * from personnel_info where pname = #{username} and ppassword = #{password}")
	PersonnelInfo isLogin(@Param("username")String username,@Param("password")String password);
>>>>>>> branch 'master' of https://github.com/2500911955/infomanager.git
}