package com.hj.oa.dao;

public interface IBaseDao<T> {
	int deleteByPrimaryKey(Long id);

	int insert(T entity);

	int insertSelective(T entity);

	T selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(T entity);

	int updateByPrimaryKey(T entity);
}
