package com.yc.po;

import java.io.Serializable;

/**
 * 权限表
 * 
 * @author c语言
 *
 */
public class Auth implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer aid; // 编号

	private String aname; // 权限名

	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname == null ? null : aname.trim();
	}

	@Override
	public String toString() {
		return "Auth [aid=" + aid + ", aname=" + aname + "]";
	}

}