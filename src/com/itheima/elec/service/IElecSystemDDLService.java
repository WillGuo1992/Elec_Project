package com.itheima.elec.service;

import com.itheima.elec.domain.ElecCommonMsg;
import com.itheima.elec.domain.ElecSystemDDL;
import com.itheima.elec.domain.ElecText;

public interface IElecSystemDDLService {
	public static final String SERVICE_NAME = "com.itheima.elec.service.impl.ElecSystemDDLService";
//	void saveElecCommonMsg(ElecCommonMsg commonMsg);
//	public ElecCommonMsg findCommonMsg();
//	public void saveCommonMsg(ElecCommonMsg commonMsg) ;

	java.util.List<ElecSystemDDL> findSystemDDLListByDistinct();
	
}
