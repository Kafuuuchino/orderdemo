package com.zz.dao;

import com.zz.entity.ShopRecord;

public interface ShopRecordMapper {
    int deleteByPrimaryKey(String shopRecordSparesId);

    int insert(ShopRecord record);

    int insertSelective(ShopRecord record);

    ShopRecord selectByPrimaryKey(String shopRecordSparesId);

    int updateByPrimaryKeySelective(ShopRecord record);

    int updateByPrimaryKey(ShopRecord record);
}