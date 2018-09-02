package com.yc.infomanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.yc.service.PersonnelInfoService;

@Controller
public class TalentsController { //科技人才模块跳转页面
		@Autowired
		PersonnelInfoService personnelInfoService;
	
		@SuppressWarnings("rawtypes")
		@GetMapping("/talents/list")
		@ResponseBody
		public String findPerson(@RequestParam(value = "n", defaultValue = "1") Integer n,
				@RequestParam(value = "size", defaultValue = "1") Integer size) {
			System.out.println("adaa111");
			PageInfo pageInfo = personnelInfoService.findPerson(n, size);
			System.out.println(pageInfo);
			return JSONObject.toJSONString(pageInfo);
		}
}
