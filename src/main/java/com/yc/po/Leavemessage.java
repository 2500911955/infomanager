package com.yc.po;

import java.io.Serializable;
import java.util.Date;

/**
 * 留言表
 * 
 * @author c语言
 *
 */
public class Leavemessage implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer lid; // 留言编号

	private Integer pid; // 用户id

	private String lmessage; // 留言信息

	private String lreply; // 回复信息

	private Date lmessagedate; // 留言时间

	private Date lreplaydate; // 回复时间

	public Integer getLid() {
		return lid;
	}

	public void setLid(Integer lid) {
		this.lid = lid;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getLmessage() {
		return lmessage;
	}

	public void setLmessage(String lmessage) {
		this.lmessage = lmessage == null ? null : lmessage.trim();
	}

	public String getLreply() {
		return lreply;
	}

	public void setLreply(String lreply) {
		this.lreply = lreply == null ? null : lreply.trim();
	}

	public Date getLmessagedate() {
		return lmessagedate;
	}

	public void setLmessagedate(Date lmessagedate) {
		this.lmessagedate = lmessagedate;
	}

	public Date getLreplaydate() {
		return lreplaydate;
	}

	public void setLreplaydate(Date lreplaydate) {
		this.lreplaydate = lreplaydate;
	}
}