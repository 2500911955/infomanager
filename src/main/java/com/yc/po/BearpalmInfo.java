package com.yc.po;

import java.io.Serializable;
import java.util.Date;

/**
 * 获奖情况表
 * 
 * @param bname
 */
public class BearpalmInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer bid; // 编号

	private Integer pid; // 人才编号

	private Date bdate; // 获奖时间

	private String blevel; // 获奖级别

	private String bname; // 获奖名称

	public Integer getBid() {
		return bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public Date getBdate() {
		return bdate;
	}

	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}

	public String getBlevel() {
		return blevel;
	}

	public void setBlevel(String blevel) {
		this.blevel = blevel == null ? null : blevel.trim();
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname == null ? null : bname.trim();
	}

	@Override
	public String toString() {
		return "BearpalmInfo [bid=" + bid + ", pid=" + pid + ", bdate=" + bdate + ", blevel=" + blevel + ", bname="
				+ bname + "]";
	}

}