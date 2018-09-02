package com.yc.service.impl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.dao.RecommendMapper;
import com.yc.service.RecommendService;

@Service
@MapperScan("com.yc.dao")
public class RecommendServiceImpl implements RecommendService {
	@Autowired
	RecommendMapper recommendMapper;
}
