package com.yc.infomanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DeclareController {
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
}
