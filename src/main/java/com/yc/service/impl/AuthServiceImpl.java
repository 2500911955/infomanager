package com.yc.service.impl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.dao.AuthMapper;
import com.yc.service.AuthService;

@Service
@MapperScan("com.yc.dao")
public class AuthServiceImpl implements AuthService {
	@Autowired
	AuthMapper authMapper;
}
