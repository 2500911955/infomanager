package com.yc.po;

import java.io.Serializable;

/**
 * 用户角色表
 * 
 * @author c语言
 *
 */
public class UserRole implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer uid; // 编号

	private Integer pid; // 员工编号

	private Integer rid; // 角色编号

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public Integer getRid() {
		return rid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
	}

	@Override
	public String toString() {
		return "UserRole [uid=" + uid + ", pid=" + pid + ", rid=" + rid + "]";
	}

}