package com.itheima.elec.web.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.itheima.elec.domain.ElecCommonMsg;
import com.itheima.elec.domain.ElecText;
import com.itheima.elec.service.IElecCommonMsgService;
import com.itheima.elec.service.IElecTextService;
import com.itheima.elec.utils.ValueUtils;

@SuppressWarnings("serial")
@Controller("elecCommonMsgAction")
@Scope(value="prototype")
public class ElecCommonMsgAction extends BaseAction<ElecCommonMsg>{
	
	ElecCommonMsg commonMsg = this.getModel();

	@Resource(name=IElecCommonMsgService.SERVICE_NAME)
	IElecCommonMsgService elecCommonMsgService;
	
	public String home() {
		ElecCommonMsg commonMsg = elecCommonMsgService.findCommonMsg();
		ValueUtils.putValueStack(commonMsg);
		return "home";
	}
	
	public String save(){
		elecCommonMsgService.saveCommonMsg(commonMsg);
		return "savePending";
	}
	
	public String actingView(){
		ElecCommonMsg commonMsg = elecCommonMsgService.findCommonMsg();
		ValueUtils.putValueStack(commonMsg);
		return "actingView";
	}
}
