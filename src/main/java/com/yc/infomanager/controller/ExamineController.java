package com.yc.infomanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExamineController {
	
	String prefix = "examine";
	
	@RequestMapping("examine/decide")
	public String decide() {
		return prefix+"/decide";
	}
	
	@RequestMapping("examine/read")
	public String read() {
		return prefix + "/decidelook";
	}
	
	@RequestMapping("examine/manage")
	public String manage() {
		return prefix+"/manage";
	}
	
	@RequestMapping("examine/managelook")
	public String managelook() {
		return prefix+"/managelook";
	}
	
	@RequestMapping("examine/check")
	public String check() {
		return prefix+"/check";
	}
	
	@RequestMapping("examine/checklook")
	public String checkread() {
		return prefix+"/checklook";
	}
	
	@RequestMapping("examine/result")
	public String result() {
		return prefix+"/result";
	}
	
	@RequestMapping("examine/resultlook")
	public String resultlook() {
		return prefix+"/resultlook";
	}
	
	@RequestMapping("examine/award")
	public String award() {
		return prefix+"/award";
	}
	
	@RequestMapping("examine/awardlook")
	public String awardlook() {
		return prefix+"/awardlook";
	}
	
	@RequestMapping("examine/look")
	public String look() {
		return prefix+"/look";
	}
	
	
}
