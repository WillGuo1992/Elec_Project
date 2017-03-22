package com.itheima.elec.dao;

import java.io.Serializable;
import java.util.List;

import com.itheima.elec.domain.ElecText;

public interface ICommonDao<T> {
	void save(T entity);
	void update(T et);
	T findObjectByID(Serializable iD);
	void deleteObjectByID(Serializable... Id);
	void deleteObjectByCollection(List<T> list);
}
