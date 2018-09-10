package com.yc.infomanager.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yc.po.JsonModel;
import com.yc.po.PersonnelInfo;
import com.yc.po.Scienceapply;
import com.yc.service.ScienceapplyService;

@Controller
public class ExamineController {
	@Autowired
	private ScienceapplyService applyService;
	
	//处理下载的方法
	@RequestMapping("examine/download")
	public void download(String path,HttpServletResponse response){
		int begin = path.indexOf("_") +1;
		String filename = path.substring(begin);
        File file = new File(path);
        if(file.exists()){ //判断文件父目录是否存在
            response.setContentType("application/force-download");
            response.setHeader("Content-Disposition", "attachment;fileName=" + filename);
            
            byte[] buffer = new byte[1024];
            FileInputStream fis = null; //文件输入流
            BufferedInputStream bis = null;
            
            OutputStream os = null; //输出流
            try {
                os = response.getOutputStream();
                fis = new FileInputStream(file); 
                bis = new BufferedInputStream(fis);
                int i = bis.read(buffer);
                while(i != -1){
                    os.write(buffer);
                    i = bis.read(buffer);
                }
                System.out.println(filename + "下载成功...");
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                bis.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
	}
	
	/*@ModelAttribute
	public Map ModelAttribute(String id ,Map map) {
		if (id != null && !"".equals(id)){
			Scienceapply apply = applyService.findApplyById(Integer.parseInt(id));
			map.put("apply", apply);
		}
		System.out.println(map);
		return map;
	}*/
	String prefix = "examine";
	
	@RequestMapping("/examine/decide")
	public String decide() {
		return prefix+"/decide";
	}

	//查找全部单个员工的所有立项
	@GetMapping("/examine/findAllApply")
	@ResponseBody
	public Object findAllApply(Map map,HttpSession session) {
		PersonnelInfo person = (PersonnelInfo) session.getAttribute("loginPerson");
		Integer pid = person.getPid();
		JsonModel jm = applyService.findAllApply(pid);
		return jm.getObj();
	}

	//立项审批
	@RequestMapping("/examine/applyexamine")
	@ResponseBody
	public Object applyexamine(Scienceapply scienceapply,HttpSession session,String state,HttpServletResponse response) throws IOException {
		System.out.println(state);
		scienceapply.setStates(state);
		scienceapply.setSastate(state);
		System.out.println(scienceapply);
		JsonModel jm = applyService.updateApply(scienceapply);
		return jm.getMsg();
	}
	
	//立项审批操作页面
	@GetMapping("/examine/read")
	public String read(Map<String,Object> map,String id) {
		System.out.println("id"+id);
		Scienceapply apply = applyService.findApplyById(Integer.parseInt(id));
		String path= apply.getSaaccessory();
		String[] files = path.split("-");
		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
		Map<String, Object> temp;  
		for (String file : files) {
			int begin = file.indexOf("_") +1;
			String filename = file.substring(begin);
			temp = new HashMap<>();
			temp.put("path", file);
			temp.put("filename", filename);
			list.add(temp);
			/*System.out.println("file" + file);
			System.out.println(list);*/
		}
		map.put("apply", apply);
		map.put("files", list);
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
