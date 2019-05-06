package com.zz.controller;

import com.zz.dto.ShopOrderDTO;
import com.zz.entity.ShopOrder;
import com.zz.entity.ShopRecord;
import com.zz.exception.ShopOrderCodeNotExistException;
import com.zz.service.OrderService;
import com.zz.service.RecordService;
import com.zz.util.ResultVOUtil;
import com.zz.util.UniqueKeyUtil;
import com.zz.vo.ResultVO;
import com.zz.vo.ShopOrderIdVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


@RestController
@Slf4j
public class OrderController {

    @Resource
    OrderService orderService;

    @Resource
    RecordService recordService;

    @RequestMapping("test1")
    public ResultVO test1(@RequestBody ShopOrderDTO shopOrderDTO){
        ShopOrder shopOrder = new ShopOrder();
        BeanUtils.copyProperties(shopOrderDTO,shopOrder);
        shopOrder.setShopOrderId(UniqueKeyUtil.CreateUniqueKey());
        if(shopOrder.getShopOrderCode()==null){
            throw new ShopOrderCodeNotExistException(shopOrder.getShopOrderId());
        }
        orderService.insert(shopOrder);

        List<ShopRecord> shopRecordList = shopOrderDTO.getShopRecordList();
        for(ShopRecord record:shopRecordList){
            record.setShopOrderId(shopOrder.getShopOrderId());
            recordService.insert(record);
        }
        ShopOrderIdVO orderId = new ShopOrderIdVO();
        orderId.setShopOrderId(shopOrder.getShopOrderId());
        log.debug("debug测试日志消息");
        log.info("info 测试日志信息");
        log.error("info 测试日志信息");
        log.warn("warn 测试日志信息");
        return ResultVOUtil.SUCCESS(orderId);
    }

    @RequestMapping("test2")
    public void test2(@RequestBody ShopOrderDTO shopOrderDTO){
        System.out.println(shopOrderDTO);
    }

}
