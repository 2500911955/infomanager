package com.yc.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.dao.PersonnelInfoMapper;
import com.yc.po.PersonnelInfo;
import com.yc.service.PersonnelInfoService;

@Service
@MapperScan("com.yc.dao")
public class PersonnelInfoServiceImpl implements PersonnelInfoService {
	@Autowired
<<<<<<< HEAD
	PersonnelInfoMapper personnelInfoMapper;
=======
	private PersonnelInfoMapper PersonnelInfoMapper;
>>>>>>> branch 'master' of https://github.com/2500911955/infomanager.git

	@Override
	public List<PersonnelInfo> findAll() {
		return personnelInfoMapper.findAll();
	}

	@Override
	public int deleteById(Integer pid) {
		return personnelInfoMapper.deleteByKey(pid);
	}

	//登录处理
	@Override
	public PersonnelInfo isLogin(String username,String password) {
		return PersonnelInfoMapper.isLogin(username, password);
	}

}
