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
	private String tplace; 
	/**
	 * 到达地
	 */
	private String tdestination;
	/**
	 * 仓位
	 */
	private String tcabin;
	/**
	 * 日期
	 */
	private Date tDate;
	/**
	 * 座位
	 */
	private String tseat;
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
	public String getTplace() {
		return tplace;
	}
	public void setTplace(String tplace) {
		this.tplace = tplace;
	}
	public String getTdestination() {
		return tdestination;
	}
	public void setTdestination(String tdestination) {
		this.tdestination = tdestination;
	}
	public String getTcabin() {
		return tcabin;
	}
	public void setTcabin(String tcabin) {
		this.tcabin = tcabin;
	}
	public Date gettDate() {
		return tDate;
	}
	public void settDate(Date tDate) {
		this.tDate = tDate;
	}
	public String getTseat() {
		return tseat;
	}
	public void setTseat(String tseat) {
		this.tseat = tseat;
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
		return "Ficket [tid=" + tid + ", tplace=" + tplace + ", tdestination=" + tdestination + ", tcabin=" + tcabin
				+ ", tDate=" + tDate + ", tseat=" + tseat + ", tchidren=" + tchidren + ", baby=" + baby + ", tprice="
				+ tprice + ", tname=" + tname + "]";
	}
}
