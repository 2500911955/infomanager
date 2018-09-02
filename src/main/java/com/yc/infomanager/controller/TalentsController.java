package com.yc.infomanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.yc.po.PersonnelInfo;
import com.yc.service.PersonnelInfoService;

@Controller
public class TalentsController { // 科技人才模块跳转页面
	@Autowired
	PersonnelInfoService personnelInfoService;

	@GetMapping("/talents/list")
	@ResponseBody
	public String find() {
		List<PersonnelInfo> list = personnelInfoService.findAll();
		return JSONObject.toJSONString(list);
	}

	@GetMapping("/talents/findtalents")
	public String findPerson() {
		return "/talents/findtalents";
	}
}
