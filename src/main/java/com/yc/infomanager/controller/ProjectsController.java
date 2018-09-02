package com.yc.infomanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProjectsController {
		//科技项目管理模块跳转页面
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
