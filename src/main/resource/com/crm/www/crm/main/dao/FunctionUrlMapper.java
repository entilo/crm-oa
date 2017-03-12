package com.crm.www.crm.main.dao;

import com.crm.www.entity.FunctionUrl;

public interface FunctionUrlMapper {
    int deleteByPrimaryKey(Integer functionUrlId);

    int insert(FunctionUrl record);

    int insertSelective(FunctionUrl record);

    FunctionUrl selectByPrimaryKey(Integer functionUrlId);

    int updateByPrimaryKeySelective(FunctionUrl record);

    int updateByPrimaryKey(FunctionUrl record);
}