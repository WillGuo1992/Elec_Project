package com.itheima.elec.web.action;

import java.lang.reflect.ParameterizedType;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.itheima.elec.utils.TUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@SuppressWarnings("serial")
public class BaseAction<T> extends ActionSupport implements ModelDriven<T>,ServletRequestAware,ServletResponseAware{
	
	T t;
	protected HttpServletRequest request;
	protected HttpServletResponse response;
	@SuppressWarnings("unchecked")
	public BaseAction(){
		@SuppressWarnings("rawtypes")
		Class class1 = TUtil.getActualType(this.getClass());
		try {
			t = (T) class1.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	public T getModel() {
		return t;
	}
	public void setServletResponse(HttpServletResponse arg0) {
		this.response = arg0;
	}

	public void setServletRequest(HttpServletRequest arg0) {
		this.request = arg0;
	}
}
