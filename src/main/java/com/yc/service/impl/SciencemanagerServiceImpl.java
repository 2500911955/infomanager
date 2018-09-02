package com.yc.service.impl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.dao.SciencemanagerMapper;
import com.yc.service.SciencemanagerService;

@Service
@MapperScan("com.yc.dao")
public class SciencemanagerServiceImpl implements SciencemanagerService {
	@Autowired
	SciencemanagerMapper sciencemanagerMapper;
}
