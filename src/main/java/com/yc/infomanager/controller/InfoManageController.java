package com.yc.infomanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InfoManageController {
	String prefix = "infomanage";
	
	@RequestMapping("/infomanage")
	public String infoManage() {
		return prefix + "/infomanage";
	}
}
