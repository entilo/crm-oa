package com.crm.www.crm.main.dao;

import com.crm.www.entity.ActionDetail;

public interface ActionDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ActionDetail record);

    int insertSelective(ActionDetail record);

    ActionDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ActionDetail record);

    int updateByPrimaryKey(ActionDetail record);
}