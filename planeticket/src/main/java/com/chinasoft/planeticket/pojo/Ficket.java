package com.chinasoft.planeticket.pojo;

import java.sql.Date;

public class Ficket {
	/**
	 * id
	 */
	private int tid; 
	/**
	 * 出发地
	 */
	private String tstartplace; 
	/**
	 * 到达地
	 */
	private String tendplace;
	/**
	 * 仓位
	 */
	private String tcabin;
	/**
	 * 日期
	 */
	private Date tdate;
	/**
	 * 座位
	 */
	private String tsit;
	/**
	 * 儿童
	 */
	private String tchidren;
	/**
	 * 婴儿
	 */
	private String baby;
	/**
	 * 价格
	 */
	private String tprice;
	/**
	 * /乘客姓名
	 */
	private String tname;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTstartplace() {
		return tstartplace;
	}
	public void setTstartplace(String tstartplace) {
		this.tstartplace = tstartplace;
	}
	public String getTendplace() {
		return tendplace;
	}
	public void setTendplace(String tendplace) {
		this.tendplace = tendplace;
	}
	public String getTcabin() {
		return tcabin;
	}
	public void setTcabin(String tcabin) {
		this.tcabin = tcabin;
	}
	public Date getTdate() {
		return tdate;
	}
	public void setTdate(Date tdate) {
		this.tdate = tdate;
	}
	public String getTsit() {
		return tsit;
	}
	public void setTsit(String tsit) {
		this.tsit = tsit;
	}
	public String getTchidren() {
		return tchidren;
	}
	public void setTchidren(String tchidren) {
		this.tchidren = tchidren;
	}
	public String getBaby() {
		return baby;
	}
	public void setBaby(String baby) {
		this.baby = baby;
	}
	public String getTprice() {
		return tprice;
	}
	public void setTprice(String tprice) {
		this.tprice = tprice;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	@Override
	public String toString() {
		return "Ficket [tid=" + tid + ", tstartplace=" + tstartplace + ", tendplace=" + tendplace + ", tcabin=" + tcabin
				+ ", tdate=" + tdate + ", tsit=" + tsit + ", tchidren=" + tchidren + ", baby=" + baby + ", tprice="
				+ tprice + ", tname=" + tname + "]";
	}

	
	
}



