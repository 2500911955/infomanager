package com.yc.service.impl;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.dao.ScienceapplyMapper;
import com.yc.po.JsonModel;
import com.yc.po.Scienceapply;
import com.yc.service.ScienceapplyService;

@Service
@MapperScan("com.yc.dao")
public class ScienceapplyServiceImpl implements ScienceapplyService {
	@Autowired
	ScienceapplyMapper scienceapplyMapper;

	@Override
	public JsonModel applyProject(Scienceapply scienceapply) {
		int result = scienceapplyMapper.insertSelective(scienceapply);
		JsonModel jm = new JsonModel();
		if (result > 0) {
			jm.setCode(1);
			jm.setMsg("提交成功！");
		} else {
			jm.setCode(0);
			jm.setMsg("提交失败！");
		}
		return jm;
	}

	@Override
	public JsonModel findAllApply(Integer pid) {
		List<Scienceapply> allApply = scienceapplyMapper.findAllApply(pid);
		JsonModel jm = new JsonModel();
		jm.setObj(allApply);
		return jm;
	}

	@Override
	public Scienceapply findApplyById(Integer id) {
		Scienceapply scienceapply = scienceapplyMapper.selectByPrimaryKey(id);
		return scienceapply;
	}

	@Override
	public JsonModel updateApply(Scienceapply scienceapply) {
		JsonModel jm = new JsonModel(); 
		int result = scienceapplyMapper.updateByPrimaryKeySelective(scienceapply);
		if (result > 0 ){
			jm.setCode(1);
			jm.setMsg("操作成功");
		} else {
			jm.setCode(0);
			jm.setMsg("操作失败");
		}
		return jm;
	}

	@Override
	public JsonModel findAllSuccess(Integer pid) {
		List<Scienceapply> Applysuccess = scienceapplyMapper.findAllsuccess(pid);
		JsonModel jm = new JsonModel();
		jm.setObj(Applysuccess);
		return jm;
	}
	
}
