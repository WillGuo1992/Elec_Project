package com.itheima.elec.domain;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class ElecCommonMsg implements Serializable{
	private String comID;
	private String stationRun;
	private String devRun;
	private Date createDate;
	public String getComID() {
		return comID;
	}
	public void setComID(String comID) {
		this.comID = comID;
	}
	public String getStationRun() {
		return stationRun;
	}
	public void setStationRun(String stationRun) {
		this.stationRun = stationRun;
	}
	public String getDevRun() {
		return devRun;
	}
	public void setDevRun(String devRun) {
		this.devRun = devRun;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	@Override
	public String toString() {
		return "ElecCommonMsg [comID=" + comID + ", stationRun=" + stationRun
				+ ", devRun=" + devRun + ", createDate=" + createDate + "]";
	}

}
