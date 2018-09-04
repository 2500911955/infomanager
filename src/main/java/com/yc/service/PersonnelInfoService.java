package com.yc.service;

import com.github.pagehelper.PageInfo;
import com.yc.po.PersonnelInfo;

public interface PersonnelInfoService {

	@SuppressWarnings("rawtypes")
	PageInfo findPerson(Integer n, Integer size);
	
	PersonnelInfo isLogin(String username,String password);

}
