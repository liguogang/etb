/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.lark.etb.buy.service;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.lark.ets.buy.service.OrderService;


/**
 * 
 * @author liguogang
 * @version $Id: OrderServiceImpl.java, v 0.1 2016年4月2日 上午10:50:33 liguogang Exp $
 */
@Service()
public class OrderServiceImpl implements OrderService,InitializingBean{
    private final static Logger logger = LogManager.getLogger(OrderServiceImpl.class);
    @Value("${env}")
    private String env;
    
    @Value("${buy.version}")
    private String version;
    
    public void createOrder(){
        
    }
    
    public void afterPropertiesSet() throws Exception{
        logger.info("afterPropertiesSet,env={}",env);
        logger.info("afterPropertiesSet,buy.version={}",version);
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }
}
