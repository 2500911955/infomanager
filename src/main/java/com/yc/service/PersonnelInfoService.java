package com.yc.service;

import com.github.pagehelper.PageInfo;

public interface PersonnelInfoService {

	@SuppressWarnings("rawtypes")
	PageInfo findPerson(Integer n, Integer size);

}
