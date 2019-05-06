package com.zz.service.Imp;

import com.zz.dao.ShopOrderMapper;
import com.zz.entity.ShopOrder;
import com.zz.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrderServiceImp implements OrderService {

    @Resource
    ShopOrderMapper shopOrderMapper;


    @Override
    public void insert(ShopOrder shopOrder) {
        shopOrderMapper.insert(shopOrder);
    }
}
