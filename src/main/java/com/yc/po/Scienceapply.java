package com.yc.po;

import java.io.Serializable;

/**
 * 科技项目立项申报表
 * 
 * @author c语言
 *
 */
public class Scienceapply implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer said; // 编号
	private Integer pid	;//申报员编号
	private String saname; // 项目名称
	private String saclass; // 类别
	private String uid; // 申报单位 单位ID
	private String sagroup; // 项目组长
	private String saexpenditure; // 申报经费
	private String sacontent; // 内容
	private String saremark; // 备注
	private String saaccessory; // 附件
	private String sadepartIdea; // 部门领导审批意见
	private String sascienceIdea; // 科技人员初审意见
 	private String sastate; // 立项状态
 	private String states;  //项目整体流程

	public Integer getSaid() {
		return said;
	}

	public void setSaid(Integer said) {
		this.said = said;
	}

	public String getSaname() {
		return saname;
	}

	public void setSaname(String saname) {
		this.saname = saname == null ? null : saname.trim();
	}

	public String getSaclass() {
		return saclass;
	}

	public void setSaclass(String saclass) {
		this.saclass = saclass == null ? null : saclass.trim();
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid == null ? null : uid.trim();
	}

	public String getSagroup() {
		return sagroup;
	}

	public void setSagroup(String sagroup) {
		this.sagroup = sagroup == null ? null : sagroup.trim();
	}

	public String getSaexpenditure() {
		return saexpenditure;
	}

	public void setSaexpenditure(String saexpenditure) {
		this.saexpenditure = saexpenditure == null ? null : saexpenditure.trim();
	}

	public String getSacontent() {
		return sacontent;
	}

	public void setSacontent(String sacontent) {
		this.sacontent = sacontent == null ? null : sacontent.trim();
	}

	public String getSaremark() {
		return saremark;
	}

	public void setSaremark(String saremark) {
		this.saremark = saremark == null ? null : saremark.trim();
	}

	public String getSaaccessory() {
		return saaccessory;
	}

	public void setSaaccessory(String saaccessory) {
		this.saaccessory = saaccessory == null ? null : saaccessory.trim();
	}

	public String getSadepartIdea() {
		return sadepartIdea;
	}

	public void setSadepartIdea(String sadepartIdea) {
		this.sadepartIdea = sadepartIdea == null ? null : sadepartIdea.trim();
	}

	public String getSascienceIdea() {
		return sascienceIdea;
	}

	public void setSascienceIdea(String sascienceIdea) {
		this.sascienceIdea = sascienceIdea == null ? null : sascienceIdea.trim();
	}

	public String getSastate() {
		return sastate;
	}

	public void setSastate(String sastate) {
		this.sastate = sastate == null ? null : sastate.trim();
	}

	
	public Scienceapply() {
		super();
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getStates() {
		return states;
	}

	public void setStates(String states) {
		this.states = states;
	}

	public Scienceapply(Integer said, Integer pid, String saname, String saclass, String uid, String sagroup,
			String saexpenditure, String sacontent, String saremark, String saaccessory, String sadepartIdea,
			String sascienceIdea, String sastate, String states) {
		super();
		this.said = said;
		this.pid = pid;
		this.saname = saname;
		this.saclass = saclass;
		this.uid = uid;
		this.sagroup = sagroup;
		this.saexpenditure = saexpenditure;
		this.sacontent = sacontent;
		this.saremark = saremark;
		this.saaccessory = saaccessory;
		this.sadepartIdea = sadepartIdea;
		this.sascienceIdea = sascienceIdea;
		this.sastate = sastate;
		this.states = states;
	}

	@Override
	public String toString() {
		return "Scienceapply [said=" + said + ", pid=" + pid + ", saname=" + saname + ", saclass=" + saclass + ", uid="
				+ uid + ", sagroup=" + sagroup + ", saexpenditure=" + saexpenditure + ", sacontent=" + sacontent
				+ ", saremark=" + saremark + ", saaccessory=" + saaccessory + ", sadepartIdea=" + sadepartIdea
				+ ", sascienceIdea=" + sascienceIdea + ", sastate=" + sastate + ", states=" + states + "]";
	}

}