package com.yc.infomanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TalentsController {
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
}
