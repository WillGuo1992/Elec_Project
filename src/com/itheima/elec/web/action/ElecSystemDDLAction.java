package com.itheima.elec.web.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.itheima.elec.domain.ElecCommonMsg;
import com.itheima.elec.domain.ElecSystemDDL;
import com.itheima.elec.domain.ElecText;
import com.itheima.elec.service.IElecCommonMsgService;
import com.itheima.elec.service.IElecSystemDDLService;
import com.itheima.elec.service.IElecTextService;
import com.itheima.elec.utils.ValueUtils;

@SuppressWarnings("serial")
@Controller("elecSystemDDLAction")
@Scope(value="prototype")
public class ElecSystemDDLAction extends BaseAction<ElecSystemDDL>{
	
	ElecSystemDDL elecSystemDDL = this.getModel();

	@Resource(name=IElecSystemDDLService.SERVICE_NAME)
	IElecSystemDDLService elecSystemDDLService;
	
	public String dictionaryIndex(){
		List<ElecSystemDDL> list = elecSystemDDLService.findSystemDDLListByDistinct();
		request.setAttribute("list", list);
		return "home";
	}
	public String dictionaryEdit(){
		return "dictionaryEdit";
	}
}
