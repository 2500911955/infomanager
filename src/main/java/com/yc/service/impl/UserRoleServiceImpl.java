package com.yc.service.impl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.dao.UserRoleMapper;
import com.yc.service.UserRoleService;

@Service
@MapperScan("com.yc.dao")
public class UserRoleServiceImpl implements UserRoleService {
	@Autowired
	UserRoleMapper userRoleMapper;
}
