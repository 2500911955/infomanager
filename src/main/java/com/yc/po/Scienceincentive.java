package com.yc.po;

import java.io.Serializable;

/**
 * 科技奖励申请
 * 
 * @author c语言
 *
 */
public class Scienceincentive implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer siid; // 编号

	private Integer said; // 科技项目id

	private Integer aid; // 成果id

	private String silevel; // 奖励级别

	private String siregister; // 奖励登记

	private String sisccessory; // 附件

	public Integer getSiid() {
		return siid;
	}

	public void setSiid(Integer siid) {
		this.siid = siid;
	}

	public Integer getSaid() {
		return said;
	}

	public void setSaid(Integer said) {
		this.said = said;
	}

	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public String getSilevel() {
		return silevel;
	}

	public void setSilevel(String silevel) {
		this.silevel = silevel == null ? null : silevel.trim();
	}

	public String getSiregister() {
		return siregister;
	}

	public void setSiregister(String siregister) {
		this.siregister = siregister == null ? null : siregister.trim();
	}

	public String getSisccessory() {
		return sisccessory;
	}

	public void setSisccessory(String sisccessory) {
		this.sisccessory = sisccessory == null ? null : sisccessory.trim();
	}

	@Override
	public String toString() {
		return "Scienceincentive [siid=" + siid + ", said=" + said + ", aid=" + aid + ", silevel=" + silevel
				+ ", siregister=" + siregister + ", sisccessory=" + sisccessory + "]";
	}

}