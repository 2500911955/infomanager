package com.yc.service;

import java.util.List;

import com.yc.po.JsonModel;
import com.yc.po.Scienceapply;

public interface ScienceapplyService {
	//添加立项申请
	public JsonModel applyProject(Scienceapply scienceapply); 
	
	//查找所有立项审批的项目
	public JsonModel findAllApply(Integer pid);
	
	//根据Id查申报项目
	public Scienceapply findApplyById(Integer id);
	
	//修改立项审批 (主要是状态和意见)
	public JsonModel updateApply(Scienceapply scienceapply);
	
	//查找所有通过立项的项目
	public JsonModel findAllSuccess(Integer pid);
}
