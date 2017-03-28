package com.itheima.elec.service;

import com.itheima.elec.domain.ElecCommonMsg;
import com.itheima.elec.domain.ElecText;

public interface IElecCommonMsgService {
	public static final String SERVICE_NAME = "com.itheima.elec.service.impl.ElecCommonMsgServiceImpl";
	void saveElecCommonMsg(ElecCommonMsg commonMsg);
	public ElecCommonMsg findCommonMsg();
	public void saveCommonMsg(ElecCommonMsg commonMsg) ;
	
}
