/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.lark.etb.web.controller.buy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Controller;

import com.lark.ets.buy.client.OrderServiceClient;

/**
 * 
 * @author liguogang
 * @version $Id: OrderController.java, v 0.1 2016年3月19日 下午4:05:43 liguogang Exp $
 */
@Controller
public class OrderController implements InitializingBean{
    private final static Logger logger = LogManager.getLogger(OrderController.class);
    
    private OrderServiceClient orderService;
    
    public void test(){
        logger.info("orderController,test,enter");
    }
    
    public void afterPropertiesSet() throws Exception{
        logger.info("init,debug OrderController");
        logger.info("init,info OrderController");
        logger.warn("init,warn OrderController");
        logger.error("init,error OrderController");
    }

    public OrderServiceClient getOrderService() {
        return orderService;
    }

    public void setOrderService(OrderServiceClient orderService) {
        this.orderService = orderService;
    }

}
