package com.miaoshaproject.service.model;

import java.math.BigDecimal;

/**
 * @author RWM
 * @date 2019/1/10
 */
public class OrderModel {
    // 订单号：2019011000000100
    private String id;

    // 用户ID
    private Integer userId;

    // 商品ID
    private Integer itemId;

    // 商品下单时单价
    private BigDecimal itemPrice;

    // 商品数量
    private Integer amount;

    // 订单金额
    private BigDecimal orderPrice;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }
}
