package com.yc.infomanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.yc.po.PersonnelInfo;
import com.yc.po.Unit;
import com.yc.service.PersonnelInfoService;
import com.yc.service.UnitService;

@Controller
public class TalentsController { // 科技人才模块跳转页面
	@Autowired
	PersonnelInfoService personnelInfoService;
	@Autowired
	UnitService unitService;

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

	@GetMapping("/talents/add")
	public String talentsAdd() {
		return "/talents/add";
	}

	@GetMapping("/talents/talentsmanage")
	public String talentsManage() {
		return "/talents/talentsmanage";
	}

	@PostMapping("/talents/remove")
	@ResponseBody
	public int talentsRemove(String pid) {
		int data = personnelInfoService.deleteById(Integer.valueOf(pid));
		return data;
	}

	@PostMapping("/talents/findUnit")
	@ResponseBody
	public String talentsfindUnit() {
		List<Unit> list = unitService.findUnit();
		return JSONObject.toJSONString(list);
	}
}
