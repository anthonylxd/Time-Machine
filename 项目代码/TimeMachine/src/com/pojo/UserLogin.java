package com.pojo;

import java.sql.Date;

public class UserLogin {
	private String uid;
	private String username;
	private String firpass;
	private String secpass;
	private String regemail;
	private String ustatus;
	private String phone;
	private Date uregtime;
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirpass() {
		return firpass;
	}
	public void setFirpass(String firpass) {
		this.firpass = firpass;
	}
	public String getSecpass() {
		return secpass;
	}
	public void setSecpass(String secpass) {
		this.secpass = secpass;
	}
	public String getRegemail() {
		return regemail;
	}
	public void setRegemail(String regemail) {
		this.regemail = regemail;
	}
	public String getUstatus() {
		return ustatus;
	}
	public void setUstatus(String ustatus) {
		this.ustatus = ustatus;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getUregtime() {
		return uregtime;
	}
	public void setUregtime(Date uregtime) {
		this.uregtime = uregtime;
	}
	
}
