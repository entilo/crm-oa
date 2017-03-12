package com.crm.www.crm.main.dao;

import com.crm.www.entity.UserCustomer;

public interface UserCustomerMapper {
    int deleteByPrimaryKey(Integer relationId);

    int insert(UserCustomer record);

    int insertSelective(UserCustomer record);

    UserCustomer selectByPrimaryKey(Integer relationId);

    int updateByPrimaryKeySelective(UserCustomer record);

    int updateByPrimaryKey(UserCustomer record);
}