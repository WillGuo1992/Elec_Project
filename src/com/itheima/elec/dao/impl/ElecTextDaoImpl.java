package com.itheima.elec.dao.impl;

import org.springframework.stereotype.Repository;

import com.itheima.elec.dao.IElecTextDao;
import com.itheima.elec.domain.ElecText;

@Repository(IElecTextDao.SERVICE_NAME) 
public class ElecTextDaoImpl extends CommonDaoImpl<ElecText> implements IElecTextDao{
	
}
