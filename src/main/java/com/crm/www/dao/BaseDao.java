package com.crm.www.dao;

import java.sql.SQLException;
import java.util.List;

public interface BaseDao<T> {

	// 增加一条数据
	public Integer insert(T t) throws SQLException;

	// 删除一条数据
	public Integer deleteById(Integer id) throws SQLException;

	// 更新
	public Integer update(T t) throws SQLException;

	// 查询所有
	public List<T> getAll() throws SQLException;

	// 查詢單條數據
	public T getById(Integer id) throws SQLException;

}
