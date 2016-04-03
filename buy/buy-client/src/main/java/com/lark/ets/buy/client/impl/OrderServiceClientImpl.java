/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.lark.ets.buy.client.impl;

import com.lark.ets.buy.client.OrderServiceClient;

/**
 * 
 * @author liguogang
 * @version $Id: OrderServiceClientImpl.java, v 0.1 2016年4月2日 上午10:37:47 liguogang Exp $
 */
public class OrderServiceClientImpl implements OrderServiceClient{
    
    private String systemName;
    
    public void createOrder(){
        
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }
    
}
