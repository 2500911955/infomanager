package com.yc.service.impl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.dao.LeavemessageMapper;
import com.yc.service.LeavemessageService;

@Service
@MapperScan("com.yc.dao")
public class LeavemessageServiceImpl implements LeavemessageService {
	@Autowired
	LeavemessageMapper leavemessageMapper;

}
