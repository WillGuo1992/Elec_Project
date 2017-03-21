package com.itheima.elec.service;

import com.itheima.elec.domain.ElecText;

public interface IElecTextService {
	public static final String SERVICE_NAME = "com.itheima.elec.service.impl.ElecTextServiceImpl";
	void saveElecText(ElecText elecText);
}
