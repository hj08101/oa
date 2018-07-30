package com.hj.oa.service.impl;


import com.hj.oa.dao.IBaseDao;
import com.hj.oa.service.IBaseService;

public abstract class BaseServiceImpl<T> implements IBaseService<T> {
	
	public abstract IBaseDao<T> getBaseDao();

	@Override
	public int deleteByPrimaryKey(Long id) {
		return getBaseDao().deleteByPrimaryKey(id);
	}

	@Override
	public int insert(T entity) {
		return getBaseDao().insert(entity);
	}

	@Override
	public int insertSelective(T entity) {
		return getBaseDao().insertSelective(entity);
	}

	@Override
	public T selectByPrimaryKey(Long id) {
		return getBaseDao().selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(T entity) {
		return getBaseDao().updateByPrimaryKeySelective(entity);
	}

	@Override
	public int updateByPrimaryKey(T entity) {
		return getBaseDao().updateByPrimaryKey(entity);
	}
}
