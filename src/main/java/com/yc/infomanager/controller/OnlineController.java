package com.yc.infomanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OnlineController {
	String prefix = "online";
	
	@RequestMapping("online/download")
	public String download() {
		return prefix+"/file";
	}
	
	@RequestMapping("online/contact")
	public String contact() {
		return prefix + "/contact";
	}
}
