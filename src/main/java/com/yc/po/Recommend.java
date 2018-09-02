package com.yc.po;

import java.io.Serializable;
import java.util.Date;

/**
 * 推荐表
 * 
 * @author c语言
 *
 */
public class Recommend implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer rid; // 编号

	private Integer pid; // 人才编号 对应人才表id

	private Date rdate; // 推荐时间

	private String rlevel; // 推荐级别

	private String rname; // 推荐名称

	public Integer getRid() {
		return rid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public Date getRdate() {
		return rdate;
	}

	public void setRdate(Date rdate) {
		this.rdate = rdate;
	}

	public String getRlevel() {
		return rlevel;
	}

	public void setRlevel(String rlevel) {
		this.rlevel = rlevel == null ? null : rlevel.trim();
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname == null ? null : rname.trim();
	}

	@Override
	public String toString() {
		return "Recommend [rid=" + rid + ", pid=" + pid + ", rdate=" + rdate + ", rlevel=" + rlevel + ", rname=" + rname
				+ "]";
	}

}