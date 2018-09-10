package com.yc.service;

import java.util.List;

import com.yc.po.PersonnelInfo;

public interface PersonnelInfoService {

	List<PersonnelInfo> findAll();

	int deleteById(Integer pid);
	
	PersonnelInfo isLogin(String username,String password);

}
