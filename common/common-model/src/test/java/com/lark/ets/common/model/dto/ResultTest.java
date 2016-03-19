/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.lark.ets.common.model.dto;

import org.junit.Test;

import com.lark.ets.common.model.enums.ResultAttachmentEnum;
import com.lark.ets.common.model.unittest.UTConstant;

/**
 * 
 * @author liguogang
 * @version $Id: ResultTest.java, v 0.1 2016年3月19日 下午11:47:53 liguogang Exp $
 */
public class ResultTest {
    @Test
    public void attachment() {
        Result<String> result = new Result<String>();
        result.setData("result test");
        result.attachment(ResultAttachmentEnum.SYSETM_ERROR.getAttachment());
        System.out.println(UTConstant.PASS_INFO + result);

        Result<Integer> intResult = new Result<Integer>();

        intResult.copyAttachment(result);

        System.out.println(UTConstant.PASS_INFO + intResult);
    }

}
