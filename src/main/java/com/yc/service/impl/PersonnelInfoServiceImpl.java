package com.yc.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yc.dao.PersonnelInfoMapper;
import com.yc.po.PersonnelInfo;
import com.yc.service.PersonnelInfoService;

@Service
@MapperScan("com.yc.dao")
public class PersonnelInfoServiceImpl implements PersonnelInfoService {
	@Autowired
	private PersonnelInfoMapper PersonnelInfoMapper;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public PageInfo findPerson(Integer n, Integer size) {
		Page<Object> page = PageHelper.startPage(n, size);
		page.setOrderBy("id");
		List person = PersonnelInfoMapper.findPerson();
		PageInfo pageInfo = new PageInfo<PersonnelInfo>(person);
		return pageInfo;
	}

	//登录处理
	@Override
	public PersonnelInfo isLogin(String username,String password) {
		return PersonnelInfoMapper.isLogin(username, password);
	}

}
