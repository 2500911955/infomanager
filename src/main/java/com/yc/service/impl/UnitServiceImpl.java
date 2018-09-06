package com.yc.service.impl;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.dao.UnitMapper;
import com.yc.po.Unit;
import com.yc.service.UnitService;

@Service
@MapperScan("com.yc.dao")
public class UnitServiceImpl implements UnitService {
	@Autowired
	UnitMapper unitMapper;

	@Override
	public List<Unit> findUnit() {
		return unitMapper.findAll();
	}

}
