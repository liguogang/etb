/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.lark.ets.common.model.dto;

import java.io.Serializable;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;

/**
 * 
 * @author liguogang
 * @version $Id: Request.java, v 0.1 2016年3月19日 下午11:35:53 liguogang Exp $
 */
public class Request<T> implements Serializable {
    /**  */
    private static final long   serialVersionUID = 1L;
    // 请求的参数
    private T                   param;
    // 请求参数中的扩展参数
    private Map<String, Object> extendParms;
    // 请求参数中的透传数据,要求回传到response
    private Map<String, Object> transData;

    public T getParam() {
        return param;
    }

    public void setParam(T param) {
        this.param = param;
    }

    public Map<String, Object> getExtendParms() {
        return extendParms;
    }

    public void setExtendParms(Map<String, Object> extendParms) {
        this.extendParms = extendParms;
    }

    public Map<String, Object> getTransData() {
        return transData;
    }

    public void setTransData(Map<String, Object> transData) {
        this.transData = transData;
    }

    public String toString() {
        return JSONObject.toJSONString(this);
    }

}
