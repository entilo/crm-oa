package com.crm.www.dao;

import java.util.List;

public interface BaseDao<T> {

	// 增加一条数据
	public Integer insert(T t);

	// 删除一条数据
	public Integer deleteById(Integer id);

	// 更新
	public Integer update(T t);

	// 查询所有
	public List<T> getAll();

}
