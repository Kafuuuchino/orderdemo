package com.zz.dao;

import com.zz.entity.ShopOrder;

public interface ShopOrderMapper {
    int deleteByPrimaryKey(String shopOrderId);

    int insert(ShopOrder record);

    int insertSelective(ShopOrder record);

    ShopOrder selectByPrimaryKey(String shopOrderId);

    int updateByPrimaryKeySelective(ShopOrder record);

    int updateByPrimaryKey(ShopOrder record);
}