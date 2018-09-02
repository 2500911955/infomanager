package com.yc.po;

import java.io.Serializable;

/**
 * 角色权限表
 * 
 * @author c语言
 *
 */
public class RoleAuth implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer raid; // 编号

	private Integer rid; // 角色编号

	private Integer aid; // 权限编号

	private String raurl; // 角色权限地址

	private String raname; // 角色权限地址

	public Integer getRaid() {
		return raid;
	}

	public void setRaid(Integer raid) {
		this.raid = raid;
	}

	public Integer getRid() {
		return rid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
	}

	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public String getRaname() {
		return raname;
	}

	public void setRaname(String raname) {
		this.raname = raname == null ? null : raname.trim();
	}

	public String getRaurl() {
		return raurl;
	}

	public void setRaurl(String raurl) {
		this.raurl = raurl == null ? null : raurl.trim();
	}

	@Override
	public String toString() {
		return "RoleAuth [raid=" + raid + ", rid=" + rid + ", aid=" + aid + ", raurl=" + raurl + ", raname=" + raname
				+ "]";
	}

}