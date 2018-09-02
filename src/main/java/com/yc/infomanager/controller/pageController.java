package com.yc.infomanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class pageController {
	@RequestMapping("/main")
	public String goMain(){
		return "main";
	}
	
	//申报系统跳转页面
	@RequestMapping("declare/findInfo")
	public String gofindInfo(){
		return "declare/findInfo";
	}
	@RequestMapping("declare/InfoManager")
	public String goInfoManager(){
		return "declare/InfoManager";
	}
	@RequestMapping("declare/setUp")
	public String gosetUp(){
		return "declare/setUp";
	}
	@RequestMapping("declare/implement")
	public String goImplement(){
		return "declare/implement";
	}
	@RequestMapping("declare/check")
	public String goCheck(){
		return "declare/check";
	}
	@RequestMapping("declare/achievement")
	public String goAchievement(){
		return "declare/achievement";
	}
	@RequestMapping("declare/award")
	public String goAward(){
		return "declare/award";
	}
	@RequestMapping("declare/projectView")
	public String goprojectView(){
		return "declare/projectView";
	}
	
	//科技人才模块跳转页面
	@RequestMapping("talents/findtalents")
	public String gofindtalens(){
		return "talents/findtalents";
	}
	@RequestMapping("talents/talentsmanage")
	public String gotalentsmanage(){
		return "talents/talentsmanage";
	}
	@RequestMapping("talents/add")
	public String gotalentsadd(){
		return "talents/add";
	}
	@RequestMapping("talents/edit")
	public String gotalentsedit(){
		return "talents/edit";
	}
	
	//科技项目关经理模块跳转页面
	@RequestMapping("projects/findproject")
	public String gofindproject(){
		return "projects/findproject";
	}
	@RequestMapping("projects/projectmanage")
	public String goprojectmanage(){
		return "projects/projectmanage";
	}
	@RequestMapping("projects/add")
	public String goprojectadd(){
		return "projects/add";
	}
	@RequestMapping("projects/edit")
	public String goprojectsedit(){
		return "projects/edit";
	}
	@RequestMapping("projects/projectstats")
	public String goprojectstats(){
		return "projects/projectstats";
	}
}
