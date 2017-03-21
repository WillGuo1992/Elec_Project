package com.itheima.elec.dao.impl;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.itheima.elec.dao.ICommonDao;

public class CommonDaoImpl<T> extends HibernateDaoSupport  implements ICommonDao<T> {

	@Resource(name="sessionFactory")
	public void setDi(SessionFactory sessionFactory){ 
		System.out.println("sessionFactory:"+sessionFactory);
		this.setSessionFactory(sessionFactory);
	}
	public void save(T entity) {
		this.getHibernateTemplate().save(entity);
	}

}
