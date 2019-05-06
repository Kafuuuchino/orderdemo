package com.zz.entity;

import java.math.BigDecimal;

public class ShopRecord {
    private String shopRecordSparesId;

    private BigDecimal shopRecordPrice;

    private Long shopRecordNumber;

    private String shopRecordUnit;

    private BigDecimal shopRecordDiscount;

    private String mealId;

    private BigDecimal shopRecordActualprice;

    private String shopOrderId;

    public String getShopRecordSparesId() {
        return shopRecordSparesId;
    }

    public void setShopRecordSparesId(String shopRecordSparesId) {
        this.shopRecordSparesId = shopRecordSparesId == null ? null : shopRecordSparesId.trim();
    }

    public BigDecimal getShopRecordPrice() {
        return shopRecordPrice;
    }

    public void setShopRecordPrice(BigDecimal shopRecordPrice) {
        this.shopRecordPrice = shopRecordPrice;
    }

    public Long getShopRecordNumber() {
        return shopRecordNumber;
    }

    public void setShopRecordNumber(Long shopRecordNumber) {
        this.shopRecordNumber = shopRecordNumber;
    }

    public String getShopRecordUnit() {
        return shopRecordUnit;
    }

    public void setShopRecordUnit(String shopRecordUnit) {
        this.shopRecordUnit = shopRecordUnit == null ? null : shopRecordUnit.trim();
    }

    public BigDecimal getShopRecordDiscount() {
        return shopRecordDiscount;
    }

    public void setShopRecordDiscount(BigDecimal shopRecordDiscount) {
        this.shopRecordDiscount = shopRecordDiscount;
    }

    public String getMealId() {
        return mealId;
    }

    public void setMealId(String mealId) {
        this.mealId = mealId == null ? null : mealId.trim();
    }

    public BigDecimal getShopRecordActualprice() {
        return shopRecordActualprice;
    }

    public void setShopRecordActualprice(BigDecimal shopRecordActualprice) {
        this.shopRecordActualprice = shopRecordActualprice;
    }

    public String getShopOrderId() {
        return shopOrderId;
    }

    public void setShopOrderId(String shopOrderId) {
        this.shopOrderId = shopOrderId == null ? null : shopOrderId.trim();
    }
}