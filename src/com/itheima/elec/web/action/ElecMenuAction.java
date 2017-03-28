package com.itheima.elec.web.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.itheima.elec.domain.ElecCommonMsg;
import com.itheima.elec.domain.ElecText;
import com.itheima.elec.service.IElecCommonMsgService;
import com.itheima.elec.service.IElecTextService;
import com.itheima.elec.utils.ValueUtils;
import com.itheima.elec.web.form.MenuForm;

@SuppressWarnings("serial")
@Controller("elecMenuAction")
@Scope(value="prototype")
public class ElecMenuAction extends BaseAction<MenuForm>{
	
	MenuForm menuForm = this.getModel();
	
	@Resource(name=IElecCommonMsgService.SERVICE_NAME)
	IElecCommonMsgService elecCommonMsgService;
	
	public String menuHome(){
		System.out.println(menuForm.getName()+"    "+menuForm.getPassword());
		return "menuHome";
	}
	
	public String title(){
		return "title";
	}
	
	public String left(){
		return "left";
	}
	
	public String change(){
		return "change";
	}
	
	public String loading(){
		ElecCommonMsg commonMsg = elecCommonMsgService.findCommonMsg();
		ValueUtils.putValueStack(commonMsg);
		return "loading";
	}
	
	public String logout(){
		this.request.getSession().invalidate();
		return "logout";
	}
	public String alermStation(){
		ElecCommonMsg commonMsg = elecCommonMsgService.findCommonMsg();
		ValueUtils.putValueStack(commonMsg);
		return "alermStation";
	}
	public String alermDevice(){
		ElecCommonMsg commonMsg = elecCommonMsgService.findCommonMsg();
		ValueUtils.putValueStack(commonMsg);
		return "alermDevice";
	}
}
