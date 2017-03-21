package com.itheima.elec.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itheima.elec.dao.IElecTextDao;
import com.itheima.elec.domain.ElecText;
import com.itheima.elec.service.IElecTextService;

@Service(IElecTextService.SERVICE_NAME)
@Transactional
public class ElecTextServiceImpl implements IElecTextService{

	@Resource(name=IElecTextDao.SERVICE_NAME)
	IElecTextDao elecTextDao;
	
	public void saveElecText(ElecText elecText) {
		elecTextDao.save(elecText);
	}


}
