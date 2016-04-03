/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.lark.etb.web.controller.buy;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lark.etb.web.controller.base.BaseController;
import com.lark.ets.buy.client.OrderServiceClient;

/**
 * 
 * @author liguogang
 * @version $Id: OrderController.java, v 0.1 2016年3月19日 下午4:05:43 liguogang Exp $
 */
@Controller
@RequestMapping("order")
public class OrderController extends BaseController implements InitializingBean {
    private final static Logger logger = LogManager.getLogger(OrderController.class);

    @Value("${env}")
    private String              env;

    private OrderServiceClient  orderService;

    @RequestMapping("query/{id}.*")
    public String queryOrder(HttpServletRequest request,HttpServletResponse response,Model model,@PathVariable String id) {
        logger.info("orderController,test,enter,id=[" + id + "]");
        Map<String, String> data = new HashMap<String, String>();
        data.put("id", id);
        data.put("env", env);
        
        this.autoResponse(request, response, model, data);
        return "buy/order";
    }

    @RequestMapping("list")
    public void list() {
        logger.info("orderController,test,enter");
    }

    public void afterPropertiesSet() throws Exception {
        logger.debug("init,debug OrderController,env=" + env);
        logger.info("init,info OrderController,env=" + env);
        logger.warn("init,warn OrderController,env=" + env);
        logger.error("init,error OrderController,env=" + env);
    }

    public OrderServiceClient getOrderService() {
        return orderService;
    }

    public void setOrderService(OrderServiceClient orderService) {
        this.orderService = orderService;
    }

}
