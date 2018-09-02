package com.yc.service.impl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.dao.RoleAuthMapper;
import com.yc.service.RoleAuthService;

@Service
@MapperScan("com.yc.dao")
public class RoleAuthServiceImpl implements RoleAuthService {
	@Autowired
	RoleAuthMapper roleAuthMapper;
}
