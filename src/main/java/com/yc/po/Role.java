package com.yc.po;

import java.io.Serializable;

/**
 * 角色表
 * 
 * @author c语言
 *
 */
public class Role implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer rid; // 编号

	private String rname; // 角色名

	public Integer getRid() {
		return rid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname == null ? null : rname.trim();
	}

	@Override
	public String toString() {
		return "Role [rid=" + rid + ", rname=" + rname + "]";
	}

}