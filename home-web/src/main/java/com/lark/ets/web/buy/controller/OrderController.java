/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.lark.ets.web.buy.controller;

import com.lark.ets.user.client.inf.OrderService;

/**
 * 
 * @author liguogang
 * @version $Id: OrderController.java, v 0.1 2016年3月19日 下午4:05:43 liguogang Exp $
 */
public class OrderController {
    private OrderService orderService;

    public OrderService getOrderService() {
        return orderService;
    }

    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

}
