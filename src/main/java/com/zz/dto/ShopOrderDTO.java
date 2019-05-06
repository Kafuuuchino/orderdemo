package com.zz.dto;

import com.zz.entity.ShopRecord;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
@Data
public class ShopOrderDTO {
    private String shopOrderCode;

    private Long shopOrderRemarks;

    private String shopOrderUser;

    private BigDecimal shopOrderTotalprice;

    private Long shopOrderStatus;

    private String shopOrderName;

    private String shopOrderCompanyid;

    private String shopOrderUserCard;

    private List<ShopRecord> shopRecordList;
}
