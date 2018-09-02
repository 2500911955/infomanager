package com.yc.service.impl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.dao.AchievementMapper;
import com.yc.service.AchievementService;

@Service
@MapperScan("com.yc.dao")
public class AchievementServiceImpl implements AchievementService {
	@Autowired
	AchievementMapper achievementMapper;
}
