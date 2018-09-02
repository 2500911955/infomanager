package com.yc.service.impl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.dao.ScienceapplyMapper;
import com.yc.service.ScienceapplyService;

@Service
@MapperScan("com.yc.dao")
public class ScienceapplyServiceImpl implements ScienceapplyService {
	@Autowired
	ScienceapplyMapper scienceapplyMapper;
}
