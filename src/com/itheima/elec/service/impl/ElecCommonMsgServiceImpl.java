package com.itheima.elec.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.itheima.elec.dao.IElecCommonMsgDao;
import com.itheima.elec.dao.IElecTextDao;
import com.itheima.elec.domain.ElecCommonMsg;
import com.itheima.elec.domain.ElecText;
import com.itheima.elec.service.IElecCommonMsgService;
import com.itheima.elec.service.IElecTextService;

@Service(IElecCommonMsgService.SERVICE_NAME)
@Transactional
public class ElecCommonMsgServiceImpl implements IElecCommonMsgService{

	@Resource(name=IElecCommonMsgDao.SERVICE_NAME)
	IElecCommonMsgDao commonMsgDao;

	public void saveElecCommonMsg(ElecCommonMsg commonMsg) {
		commonMsgDao.save(commonMsg);		
	}
 
	public ElecCommonMsg findCommonMsg(){
		ElecCommonMsg commonMsg = new ElecCommonMsg();
		List<ElecCommonMsg> list = commonMsgDao.findCollectionByConditionNoPage("", null, null);
		if(list!=null&&list.size()>0){
			commonMsg = list.get(0);
		}
		return commonMsg;
	}
	@Transactional(isolation=Isolation.DEFAULT,propagation=Propagation.REQUIRED,readOnly=false)
	public void saveCommonMsg(ElecCommonMsg commonMsg) {
		List<ElecCommonMsg> list = commonMsgDao.findCollectionByConditionNoPage("", null, null);
		if(list!=null&&list.size()>0){
			ElecCommonMsg elecCommonMsg = list.get(0);
			elecCommonMsg.setStationRun(commonMsg.getStationRun());
			elecCommonMsg.setDevRun(commonMsg.getDevRun());
			elecCommonMsg.setCreateDate(new Date());
			commonMsgDao.update(elecCommonMsg);
		}
		else{
			commonMsg.setCreateDate(new Date());
			saveElecCommonMsg(commonMsg);
		}
	}

}
