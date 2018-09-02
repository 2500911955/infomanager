package com.yc.infomanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstPageController {
	String prefix = "first";

	@RequestMapping("first/science")
	public String science() {
		return prefix + "/science";
	}
	
	@RequestMapping("first/transaction")
	public String transaction() {
		return prefix + "/transaction";
	}
	
	@RequestMapping("first/office")
	public String office() {
		return prefix + "/office";
	}
	
	@RequestMapping("first/navigation")
	public String navigation() {
		return prefix + "/navigation";
	}
}
