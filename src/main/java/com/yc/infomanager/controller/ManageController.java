package com.yc.infomanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ManageController {
	String prefix = "manage";

	@RequestMapping("manage/flow")
	public String flow() {
		return prefix + "/flow";
	}
	
	@RequestMapping("manage/flow/add")
	public String addflow() {
		return prefix + "/addflow";
	}
	
	@RequestMapping("manage/download")
	public String download() {
		return prefix + "/download";
	}

	@RequestMapping("manage/usermanager")
	public String usermanager() {
		return prefix + "/usermanager";
	}

	@RequestMapping("manage/authmanager")
	public String authmanager() {
		return prefix + "/authmanager";
	}
	
	@RequestMapping("manage/authmanage/add")
	public String addmanager() {
		return prefix + "/addrole";
	}
}
