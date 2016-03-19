/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.lark.ets.common.model.inf;

/**
 * 返回结果的附件
 * 
 * @author liguogang
 * @version $Id: ResultInfo.java, v 0.1 2016年3月19日 下午11:22:04 liguogang Exp $
 */
public interface ResultAttachment {
    /***
     * 返回的结果码
     * 
     * @return
     */
    String getCode();

    /***
     * 对返回结果的描述
     * 
     * @return
     */
    String getDesc();

    /***
     * 结果是否成功
     * 
     * @return
     */
    boolean isSuccess();

    /***
     * 是否终止主流程继续往下执行
     * 
     * @return
     */
    boolean isInterrupt();
}
