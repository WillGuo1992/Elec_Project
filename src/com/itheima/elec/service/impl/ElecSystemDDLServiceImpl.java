package com.itheima.elec.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itheima.elec.dao.IElecSystemDDLDao;
import com.itheima.elec.dao.IElecTextDao;
import com.itheima.elec.domain.ElecSystemDDL;
import com.itheima.elec.domain.ElecText;
import com.itheima.elec.service.IElecSystemDDLService;
import com.itheima.elec.service.IElecTextService;

@Service(IElecSystemDDLService.SERVICE_NAME)
@Transactional(readOnly=true)
public class ElecSystemDDLServiceImpl implements IElecSystemDDLService{

	@Resource(name=IElecSystemDDLDao.SERVICE_NAME)
	IElecSystemDDLDao elecSystemDDLDao;

	public List<ElecSystemDDL> findSystemDDLListByDistinct() {
		List<ElecSystemDDL> list = elecSystemDDLDao.findSystemDDLListByDistinct();
		return list;
	}
	
}
