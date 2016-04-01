/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.lark.ets.common.model.enums;

import com.lark.ets.common.model.dto.ResultAttachmentTest;
import com.lark.ets.common.model.inf.ResponseAttachment;

/**
 * 
 * @author liguogang
 * @version $Id: ResultAttachmentEnum.java, v 0.1 2016年3月19日 下午11:51:44 liguogang Exp $
 */
public enum ResultAttachmentEnum {

    SYSETM_ERROR("0", "系统未知错误", true, false);

    private final ResultAttachmentTest attachment;

    private ResultAttachmentEnum(String code, String desc, boolean isInterrupt, boolean isSuccess) {
        attachment = new ResultAttachmentTest();
        attachment.setCode(code);
        attachment.setDesc(desc);
        attachment.setInterrupt(isInterrupt);
        attachment.setSuccess(isSuccess);
    }

    public final ResponseAttachment getAttachment() {
        return this.attachment;
    }
}
