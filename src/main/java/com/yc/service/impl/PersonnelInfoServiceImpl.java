package com.yc.service.impl;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.dao.PersonnelInfoMapper;
import com.yc.po.PersonnelInfo;
import com.yc.service.PersonnelInfoService;

@Service
@MapperScan("com.yc.dao")
public class PersonnelInfoServiceImpl implements PersonnelInfoService {
	@Autowired
	PersonnelInfoMapper personnelInfoMapper;

	@Override
	public List<PersonnelInfo> findAll() {
		return personnelInfoMapper.findAll();
	}

	@Override
	public int deleteById(Integer pid) {
		return personnelInfoMapper.deleteByKey(pid);
	}

}
