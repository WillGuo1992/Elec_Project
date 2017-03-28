package com.itheima.elec.domain;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class ElecSystemDDL implements Serializable{
	private int seqID;
	private String keyword;
	private int ddlCode;
	private String ddlName;
	
	public int getSeqID() {
		return seqID;
	}
	public void setSeqID(int seqID) {
		this.seqID = seqID;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public int getDdlCode() {
		return ddlCode;
	}
	public void setDdlCode(int ddlCode) {
		this.ddlCode = ddlCode;
	}
	public String getDdlName() {
		return ddlName;
	}
	public void setDdlName(String ddlName) {
		this.ddlName = ddlName;
	}
	@Override
	public String toString() {
		return "ElecSystemDDL [seqID=" + seqID + ", keyword=" + keyword
				+ ", ddlCode=" + ddlCode + ", ddlName=" + ddlName + "]";
	}
	
}
