package com.yc.infomanager.controller;


import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yc.po.PersonnelInfo;
import com.yc.service.PersonnelInfoService;

@Controller
public class UserController {
	@Autowired
	private PersonnelInfoService personalService;
	
	String prefix = "page";
	
    //登录处理
	@RequestMapping("/login")
	public String login(String username,String password,HttpSession session) {
		PersonnelInfo person = personalService.isLogin(username, password);
		if(person != null) {
			session.setAttribute("loginPerson", person);
			System.out.println(session.getAttribute("loginPerson"));
			return prefix+"/index";
		}else {
			return "index";
		}
	}
	
	@GetMapping("/main")
	String main() {
		return prefix+"/main";
	}
	
	//查看个人信息
	@RequestMapping("/sys/user/personal")
	public String personal() {
		return prefix+"/personal";
	}
	
	/*@RequestMapping("user/updatePeronal")
	public String updatePersonal(PersonnelInfo person) {
		System.out.println("hHaa"+person);
		return null;
	}*/
	
	/*//重置密码
	@GetMapping("user/resetPwd")
	public String resetPwd(Model model,HttpSession session) {
		//取出当前登录用户
		return prefix + "/reset_pwd";
	}
*/
	
	@PostMapping("user/adminResetPwd")
	public String resetPwd() {
		return null;
	}
}
