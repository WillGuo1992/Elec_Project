package com.itheima.elec.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.itheima.elec.dao.ICommonDao;
import com.itheima.elec.utils.TUtil;

public class CommonDaoImpl<T> extends HibernateDaoSupport  implements ICommonDao<T> {

	@Resource(name="sessionFactory")
	public void setDi(SessionFactory sessionFactory){ 
		System.out.println("sessionFactory:"+sessionFactory);
		this.setSessionFactory(sessionFactory);
	}
	public void save(T entity) {
		this.getHibernateTemplate().save(entity);
	}
	public void update(T entity) {
		this.getHibernateTemplate().update(entity);
	}
	public T findObjectByID(Serializable iD) {
		@SuppressWarnings("rawtypes")
		Class class1 = TUtil.getActualType(this.getClass());
		@SuppressWarnings("unchecked")
		T t = (T) this.getHibernateTemplate().get(class1, iD);
		return t; 
	}
	public void deleteObjectByID(Serializable... Ids) {
		if(Ids!=null &&Ids.length>0){
			for(Serializable id : Ids){
				T t = findObjectByID(id);
				this.getHibernateTemplate().delete(t);
			}
			
		}
	}
	public void deleteObjectByCollection(List<T> list) {
		this.getHibernateTemplate().deleteAll(list);
	}
}
