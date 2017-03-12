package com.crm.www.crm.other.dao;

import com.crm.www.entity.UserAction;

public interface UserActionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserAction record);

    int insertSelective(UserAction record);

    UserAction selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserAction record);

    int updateByPrimaryKey(UserAction record);
}