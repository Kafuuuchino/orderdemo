package com.zz.service.Imp;

import com.zz.dao.ShopRecordMapper;
import com.zz.entity.ShopRecord;
import com.zz.service.RecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RecordServiceImp implements RecordService {

    @Resource
    ShopRecordMapper shopRecordMapper;

    @Override
    public void insert(ShopRecord shopRecord) {
        shopRecordMapper.insert(shopRecord);
    }
}
