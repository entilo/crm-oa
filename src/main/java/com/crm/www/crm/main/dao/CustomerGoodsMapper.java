package com.crm.www.crm.main.dao;

import com.crm.www.entity.CustomerGoods;

public interface CustomerGoodsMapper {
    int deleteByPrimaryKey(Integer cartId);

    int insert(CustomerGoods record);

    int insertSelective(CustomerGoods record);

    CustomerGoods selectByPrimaryKey(Integer cartId);

    int updateByPrimaryKeySelective(CustomerGoods record);

    int updateByPrimaryKey(CustomerGoods record);
}