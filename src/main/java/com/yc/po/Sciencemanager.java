package com.yc.po;

import java.io.Serializable;
import java.util.Date;

/**
 * 科技项目管理表
 * 
 * @author c语言
 *
 */
public class Sciencemanager implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer smid; // 编号

	private Integer said; // 项目编号

	private String smname; // 项目名称

	private String smunit; // 协作单位

	private Date smbeginDate; // 合同起始日期

	private Date smfinishDate; // 合同完成日期

	private String smfristprincipal; // 甲方负责人

	private String smsecondprincipal; // 乙方负责人

	private String sminvest; // 项目投资

	private String smpaycase; // 支付情况

	private String smaccessory; // 附件

	private String smstate; // 验收状态

	public Integer getSmid() {
		return smid;
	}

	public void setSmid(Integer smid) {
		this.smid = smid;
	}

	public Integer getSaid() {
		return said;
	}

	public void setSaid(Integer said) {
		this.said = said;
	}

	public String getSmname() {
		return smname;
	}

	public void setSmname(String smname) {
		this.smname = smname == null ? null : smname.trim();
	}

	public String getSmunit() {
		return smunit;
	}

	public void setSmunit(String smunit) {
		this.smunit = smunit == null ? null : smunit.trim();
	}

	public Date getSmbeginDate() {
		return smbeginDate;
	}

	public void setSmbeginDate(Date smbeginDate) {
		this.smbeginDate = smbeginDate;
	}

	public Date getSmfinishDate() {
		return smfinishDate;
	}

	public void setSmfinishDate(Date smfinishDate) {
		this.smfinishDate = smfinishDate;
	}

	public String getSmfristprincipal() {
		return smfristprincipal;
	}

	public void setSmfristprincipal(String smfristprincipal) {
		this.smfristprincipal = smfristprincipal == null ? null : smfristprincipal.trim();
	}

	public String getSmsecondprincipal() {
		return smsecondprincipal;
	}

	public void setSmsecondprincipal(String smsecondprincipal) {
		this.smsecondprincipal = smsecondprincipal == null ? null : smsecondprincipal.trim();
	}

	public String getSminvest() {
		return sminvest;
	}

	public void setSminvest(String sminvest) {
		this.sminvest = sminvest == null ? null : sminvest.trim();
	}

	public String getSmpaycase() {
		return smpaycase;
	}

	public void setSmpaycase(String smpaycase) {
		this.smpaycase = smpaycase == null ? null : smpaycase.trim();
	}

	public String getSmaccessory() {
		return smaccessory;
	}

	public void setSmaccessory(String smaccessory) {
		this.smaccessory = smaccessory == null ? null : smaccessory.trim();
	}

	public String getSmstate() {
		return smstate;
	}

	public void setSmstate(String smstate) {
		this.smstate = smstate == null ? null : smstate.trim();
	}

	@Override
	public String toString() {
		return "Sciencemanager [smid=" + smid + ", said=" + said + ", smname=" + smname + ", smunit=" + smunit
				+ ", smbeginDate=" + smbeginDate + ", smfinishDate=" + smfinishDate + ", smfristprincipal="
				+ smfristprincipal + ", smsecondprincipal=" + smsecondprincipal + ", sminvest=" + sminvest
				+ ", smpaycase=" + smpaycase + ", smaccessory=" + smaccessory + ", smstate=" + smstate + "]";
	}

}