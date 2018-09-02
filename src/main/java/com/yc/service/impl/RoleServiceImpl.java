package com.yc.service.impl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.dao.RoleMapper;
import com.yc.service.RoleService;

@Service
@MapperScan("com.yc.dao")
public class RoleServiceImpl implements RoleService {
	@Autowired
	RoleMapper roleMapper;
}
