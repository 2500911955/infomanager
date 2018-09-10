package com.yc.infomanager.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.yc.po.JsonModel;
import com.yc.po.PersonnelInfo;
import com.yc.po.Scienceapply;
import com.yc.service.ScienceapplyService;
import com.yc.util.FilesUtil;

@Controller
public class DeclareController {
	@Autowired
	private ScienceapplyService applyService;
	
	@ModelAttribute
	public Map declareModel(Map map) {
		/*Scienceapply scienceapply = new Scienceapply();
		map.put("apply", scienceapply);*/
		return map;
	}
		
	//申报系统跳转页面
	@RequestMapping("declare/applyProject")
	public void addProject( /*@RequestParam("file") MultipartFile files,*/Scienceapply scienceapply,HttpServletResponse response,MultipartHttpServletRequest request,HttpSession session) throws IOException{
		System.out.println("apply\t " + scienceapply);
		PersonnelInfo person = (PersonnelInfo) session.getAttribute("loginPerson");
		Integer pid = person.getPid();
		PrintWriter out = response.getWriter();
		response.setHeader("Content-Type", "text/html; charset=UTF-8");
		//获取文件上传路径
		//String filePath = request.getSession().getServletContext().getRealPath("attachment/");
		//C:\Users\Administrator\AppData\Local\Temp\tomcat-docbase.6501161664385609538.8080\attachment
		String filePath = "D:\\attachment\\"; 
		String saaccessory = "";
		List<MultipartFile> files = request.getFiles("file");
		MultipartFile file = null;
		BufferedOutputStream stream = null;
		for (int i = 0; i < files.size(); ++i) {
			file = files.get(i);
			if (!file.isEmpty()) {
				try {
					String fileName = System.currentTimeMillis() + "_" + file.getOriginalFilename();
					String path = filePath + fileName;
					saaccessory += path + "-";
					//System.out.println("第" + i + "个文件的路径:"+path);
					byte[] bytes = file.getBytes();
					FilesUtil.uploadFile(bytes, filePath, fileName);
				} catch (Exception e) {
					stream = null;
					System.out.println("第" + i +"个文件上传失败...");
					out.println("<script>alert('第" + i +"个文件上传失败...');location.href='/declare/setUp';</script>");
				}
			} else {
				System.out.println("第" + i +"个文件上传失败,因为文件是空的...");
				out.println("<script>alert('第" + i +"个文件上传失败,因为文件是空的...');location.href='/declare/setUp';</script>");
			}
		}
		System.out.println(saaccessory);
		scienceapply.setPid(pid);
		scienceapply.setSaaccessory(saaccessory);
		System.out.println("文件上传成功...");
		System.out.println(scienceapply);
		JsonModel jm = applyService.applyProject(scienceapply);
		out.println("<script>alert('"+jm.getMsg()+"');location.href='/declare/setUp';</script>");
		out.flush();
		out.close();
	}
	//申报系统跳转页面
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
