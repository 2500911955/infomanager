package com.yc.po;

import java.io.Serializable;
import java.util.Date;

public class PersonnelInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer pid; // 编号

	private String uid; // 单位ID

	private String pname; // 姓名

	private String psex; // 性别

	private String ppassword; // 密码

	private String pphoto; // 头像

	private String pphone; // 电话

	private String pplace; // 籍贯

	private String padress; // 居住地址

	private Date pbirthday; // 出身日期

	private String pschool; // 毕业学校

	private String pculture; // 文化程度

	private Date pgraduationdate; // 毕业时间

	private String pmajor; // 专业

	private String ppost; // 工作岗位

	private Date pjoindate; // 参加工作时间

	private String pqualification; // 任职资格

	private Date pqualificationDate; // 任职资格时间

	private String pidentity; // 身份

	private String pidcord; // 身份证

	private String pset; // 系列

	private String plevel; // 级别

	private String premark; // 备注

	private String pstarts; // 是否员工

	private Unit unit; // 单位表

	public Unit getUnit() {
		return unit;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid == null ? null : uid.trim();
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname == null ? null : pname.trim();
	}

	public String getPsex() {
		return psex;
	}

	public void setPsex(String psex) {
		this.psex = psex == null ? null : psex.trim();
	}

	public String getPpassword() {
		return ppassword;
	}

	public void setPpassword(String ppassword) {
		this.ppassword = ppassword == null ? null : ppassword.trim();
	}

	public String getPphoto() {
		return pphoto;
	}

	public void setPphoto(String pphoto) {
		this.pphoto = pphoto == null ? null : pphoto.trim();
	}

	public String getPphone() {
		return pphone;
	}

	public void setPphone(String pphone) {
		this.pphone = pphone == null ? null : pphone.trim();
	}

	public String getPplace() {
		return pplace;
	}

	public void setPplace(String pplace) {
		this.pplace = pplace == null ? null : pplace.trim();
	}

	public String getPadress() {
		return padress;
	}

	public void setPadress(String padress) {
		this.padress = padress == null ? null : padress.trim();
	}

	public Date getPbirthday() {
		return pbirthday;
	}

	public void setPbirthday(Date pbirthday) {
		this.pbirthday = pbirthday;
	}

	public String getPschool() {
		return pschool;
	}

	public void setPschool(String pschool) {
		this.pschool = pschool == null ? null : pschool.trim();
	}

	public String getPculture() {
		return pculture;
	}

	public void setPculture(String pculture) {
		this.pculture = pculture == null ? null : pculture.trim();
	}

	public Date getPgraduationdate() {
		return pgraduationdate;
	}

	public void setPgraduationdate(Date pgraduationdate) {
		this.pgraduationdate = pgraduationdate;
	}

	public String getPmajor() {
		return pmajor;
	}

	public void setPmajor(String pmajor) {
		this.pmajor = pmajor == null ? null : pmajor.trim();
	}

	public String getPpost() {
		return ppost;
	}

	public void setPpost(String ppost) {
		this.ppost = ppost == null ? null : ppost.trim();
	}

	public Date getPjoindate() {
		return pjoindate;
	}

	public void setPjoindate(Date pjoindate) {
		this.pjoindate = pjoindate;
	}

	public String getPqualification() {
		return pqualification;
	}

	public void setPqualification(String pqualification) {
		this.pqualification = pqualification == null ? null : pqualification.trim();
	}

	public Date getPqualificationDate() {
		return pqualificationDate;
	}

	public void setPqualificationDate(Date pqualificationDate) {
		this.pqualificationDate = pqualificationDate;
	}

	public String getPidentity() {
		return pidentity;
	}

	public void setPidentity(String pidentity) {
		this.pidentity = pidentity == null ? null : pidentity.trim();
	}

	public String getPidcord() {
		return pidcord;
	}

	public void setPidcord(String pidcord) {
		this.pidcord = pidcord == null ? null : pidcord.trim();
	}

	public String getPset() {
		return pset;
	}

	public void setPset(String pset) {
		this.pset = pset == null ? null : pset.trim();
	}

	public String getPlevel() {
		return plevel;
	}

	public void setPlevel(String plevel) {
		this.plevel = plevel == null ? null : plevel.trim();
	}

	public String getPremark() {
		return premark;
	}

	public void setPremark(String premark) {
		this.premark = premark == null ? null : premark.trim();
	}

	public String getPstarts() {
		return pstarts;
	}

	public void setPstarts(String pstarts) {
		this.pstarts = pstarts == null ? null : pstarts.trim();
	}

	@Override
	public String toString() {
		return "PersonnelInfo [pid=" + pid + ", uid=" + uid + ", pname=" + pname + ", psex=" + psex + ", ppassword="
				+ ppassword + ", pphoto=" + pphoto + ", pphone=" + pphone + ", pplace=" + pplace + ", padress="
				+ padress + ", pbirthday=" + pbirthday + ", pschool=" + pschool + ", pculture=" + pculture
				+ ", pgraduationdate=" + pgraduationdate + ", pmajor=" + pmajor + ", ppost=" + ppost + ", pjoindate="
				+ pjoindate + ", pqualification=" + pqualification + ", pqualificationDate=" + pqualificationDate
				+ ", pidentity=" + pidentity + ", pidcord=" + pidcord + ", pset=" + pset + ", plevel=" + plevel
				+ ", premark=" + premark + ", pstarts=" + pstarts + ", unit=" + unit + "]";
	}

}