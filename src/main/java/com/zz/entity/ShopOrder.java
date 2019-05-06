package com.zz.entity;

import java.math.BigDecimal;

public class ShopOrder {
    private String shopOrderId;

    private String shopOrderCode;

    private Long shopOrderRemarks;

    private String shopOrderUser;

    private BigDecimal shopOrderTotalprice;

    private Long shopOrderStatus;

    private String shopOrderName;

    private String shopOrderCompanyid;

    private String shopOrderUserCard;

    public String getShopOrderId() {
        return shopOrderId;
    }

    public void setShopOrderId(String shopOrderId) {
        this.shopOrderId = shopOrderId == null ? null : shopOrderId.trim();
    }

    public String getShopOrderCode() {
        return shopOrderCode;
    }

    public void setShopOrderCode(String shopOrderCode) {
        this.shopOrderCode = shopOrderCode == null ? null : shopOrderCode.trim();
    }

    public Long getShopOrderRemarks() {
        return shopOrderRemarks;
    }

    public void setShopOrderRemarks(Long shopOrderRemarks) {
        this.shopOrderRemarks = shopOrderRemarks;
    }

    public String getShopOrderUser() {
        return shopOrderUser;
    }

    public void setShopOrderUser(String shopOrderUser) {
        this.shopOrderUser = shopOrderUser == null ? null : shopOrderUser.trim();
    }

    public BigDecimal getShopOrderTotalprice() {
        return shopOrderTotalprice;
    }

    public void setShopOrderTotalprice(BigDecimal shopOrderTotalprice) {
        this.shopOrderTotalprice = shopOrderTotalprice;
    }

    public Long getShopOrderStatus() {
        return shopOrderStatus;
    }

    public void setShopOrderStatus(Long shopOrderStatus) {
        this.shopOrderStatus = shopOrderStatus;
    }

    public String getShopOrderName() {
        return shopOrderName;
    }

    public void setShopOrderName(String shopOrderName) {
        this.shopOrderName = shopOrderName == null ? null : shopOrderName.trim();
    }

    public String getShopOrderCompanyid() {
        return shopOrderCompanyid;
    }

    public void setShopOrderCompanyid(String shopOrderCompanyid) {
        this.shopOrderCompanyid = shopOrderCompanyid == null ? null : shopOrderCompanyid.trim();
    }

    public String getShopOrderUserCard() {
        return shopOrderUserCard;
    }

    public void setShopOrderUserCard(String shopOrderUserCard) {
        this.shopOrderUserCard = shopOrderUserCard == null ? null : shopOrderUserCard.trim();
    }
}