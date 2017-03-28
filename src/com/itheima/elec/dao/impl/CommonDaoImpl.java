package com.itheima.elec.dao.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.itheima.elec.dao.ICommonDao;
import com.itheima.elec.utils.TUtil;

public class CommonDaoImpl<T> extends HibernateDaoSupport  implements ICommonDao<T> {

	Class class1 = TUtil.getActualType(this.getClass());
	
	@Resource(name="sessionFactory")
	public void setDi(SessionFactory sessionFactory){ 
		this.setSessionFactory(sessionFactory);
	}
	public void save(T entity) {
		this.getHibernateTemplate().save(entity);
	}
	public void update(T entity) {
		this.getHibernateTemplate().update(entity);
	}
	public T findObjectByID(Serializable iD) {
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
	
	public List<T> findCollectionByConditionNoPage(String condition,
			Object[] params, Map<String, String> orderBy) {
		String hql="";
		hql+= "from "+class1.getSimpleName()+" o where 1=1 ";
		String orderByHql = this.getorderByHql(orderBy);
		String finalhql = hql+ condition + orderByHql;
		List<T> list = this.getHibernateTemplate().find(finalhql, params);
		return list;
	}
	private String getorderByHql(Map<String, String> orderBy) {
		StringBuffer buffer = new StringBuffer();
		if(orderBy!=null && orderBy.size()>0){
			buffer.append(" order by ");
			for(Entry<String, String> entry :orderBy.entrySet()){
				buffer.append(entry.getKey()+" " +entry.getValue()+" ,");
			}
			buffer.deleteCharAt(buffer.length()-1);
		}
		return buffer.toString();
	}

	
}
