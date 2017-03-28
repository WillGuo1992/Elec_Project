package com.itheima.elec.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.itheima.elec.dao.IElecCommonMsgDao;
import com.itheima.elec.dao.IElecSystemDDLDao;
import com.itheima.elec.dao.IElecTextDao;
import com.itheima.elec.domain.ElecCommonMsg;
import com.itheima.elec.domain.ElecSystemDDL;
import com.itheima.elec.domain.ElecText;

@Repository(IElecSystemDDLDao.SERVICE_NAME) 
public class ElecSystemDDLDaoImpl extends CommonDaoImpl<ElecSystemDDL> implements IElecSystemDDLDao{

	public List<ElecSystemDDL> findSystemDDLListByDistinct() {
		List<ElecSystemDDL> list = new ArrayList<ElecSystemDDL>();
		String hql="select distinct o.keyword from ElecSystemDDL o";
		List<Object> listObj = getHibernateTemplate().find(hql);
		for(Object obj : listObj){
			ElecSystemDDL elecSystemDDL = new ElecSystemDDL();
			elecSystemDDL.setKeyword(obj.toString());
			list.add(elecSystemDDL);
		}
		return list;
	}
	
}
