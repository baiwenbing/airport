package com.chinasoft.planeticket.pojo;

public class AdmUser {
	private int admid;
	private String admname;
	private String admpwd;
	private String admper;
	public int getAdmid() {
		return admid;
	}
	public void setAdmid(int admid) {
		this.admid = admid;
	}
	public String getAdmname() {
		return admname;
	}
	public void setAdmname(String admname) {
		this.admname = admname;
	}
	public String getAdmpwd() {
		return admpwd;
	}
	public void setAdmpwd(String admpwd) {
		this.admpwd = admpwd;
	}
	public String getAdmper() {
		return admper;
	}
	public void setAdmper(String admper) {
		this.admper = admper;
	}
	@Override
	public String toString() {
		return "AdmUser [admid=" + admid + ", admname=" + admname + ", admpwd=" + admpwd + ", admper=" + admper + "]";
	}
	
}
