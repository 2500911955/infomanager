package com.yc.po;

import java.io.Serializable;

/**
 * 单位表
 * 
 * @author c语言
 *
 */
public class Unit implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer uid; // 单位id

	private String uname; // 单位名称

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname == null ? null : uname.trim();
	}

	@Override
	public String toString() {
		return "Unit [uid=" + uid + ", uname=" + uname + "]";
	}

}