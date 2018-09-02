package com.yc.service.impl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.dao.BearpalmInfoMapper;
import com.yc.service.BearpalmInfoService;

@Service
@MapperScan("com.yc.dao")
public class BearpalmInfoServiceImpl implements BearpalmInfoService {
	@Autowired
	BearpalmInfoMapper bearpalmInfoMapper;
}
