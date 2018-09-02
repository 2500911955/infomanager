package com.yc.infomanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yc.infomanager.annotation.Log;

@Controller
public class UserController {
	String prefix = "page";
	

	@Log("登录")
	@RequestMapping("/login")
	public String login() {
		return prefix+"/index";
	}
	
	@GetMapping("/main")
	String main() {
		return prefix+"/main";
	}
	
	@RequestMapping("/sys/user/personal")
	public String personal() {
		return prefix+"/personal";
	}
	
	@RequestMapping("user/updatePeronal")
	public String updatePersonal() {
		return null;
	}
	
	@GetMapping("user/resetPwd")
	public String resetPwd( Model model) {
		return prefix + "/reset_pwd";
	}

	
	@PostMapping("user/adminResetPwd")
	public String resetPwd() {
		return null;
	}
}
