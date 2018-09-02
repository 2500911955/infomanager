package com.yc.po;

import java.io.Serializable;
import java.util.Date;

/**
 * 成果表
 * 
 * @author c语言
 *
 */
public class Achievement implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer aid; // 编号

	private Integer said; // 项目id

	private String ageneralize; // 成功推广情况

	private String asbstractlevel; // 成果级别

	private String aaccessory; // 附件

	private Date aauditsuccess; // 成功审核时间

	private String asbstract; // 成果内容简介

	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public Integer getSaid() {
		return said;
	}

	public void setSaid(Integer said) {
		this.said = said;
	}

	public String getAsbstract() {
		return asbstract;
	}

	public void setAsbstract(String asbstract) {
		this.asbstract = asbstract == null ? null : asbstract.trim();
	}

	public String getAgeneralize() {
		return ageneralize;
	}

	public void setAgeneralize(String ageneralize) {
		this.ageneralize = ageneralize == null ? null : ageneralize.trim();
	}

	public String getAsbstractlevel() {
		return asbstractlevel;
	}

	public void setAsbstractlevel(String asbstractlevel) {
		this.asbstractlevel = asbstractlevel == null ? null : asbstractlevel.trim();
	}

	public String getAaccessory() {
		return aaccessory;
	}

	public void setAaccessory(String aaccessory) {
		this.aaccessory = aaccessory == null ? null : aaccessory.trim();
	}

	public Date getAauditsuccess() {
		return aauditsuccess;
	}

	public void setAauditsuccess(Date aauditsuccess) {
		this.aauditsuccess = aauditsuccess;
	}

	@Override
	public String toString() {
		return "Achievement [aid=" + aid + ", said=" + said + ", asbstract=" + asbstract + ", ageneralize="
				+ ageneralize + ", asbstractlevel=" + asbstractlevel + ", aaccessory=" + aaccessory + ", aauditsuccess="
				+ aauditsuccess + "]";
	}

}