/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.lark.etb.web.controller.base;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringEscapeUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.ui.Model;

import com.alibaba.fastjson.JSONObject;

/**
 * 控制器 基础类，放一些基础工具 
 * @author liguogang
 * @version $Id: BaseController.java, v 0.1 2016年4月4日 上午12:42:55 liguogang Exp $
 */
public class BaseController {
    private static final Logger logger          = LogManager.getLogger(BaseController.class);

    private static final String JSONP_CALLBACK  = "callback";

    private static final String RESPONSE_RESULT = "result";

    private static final String JSON_SUFFIX     = ".json";

    private static final String DO_SUFFIX       = ".do";

    /***
     * 
     * 
     * @param request
     * @param response
     * @param model
     * @param data
     */
    protected void autoResponse(HttpServletRequest request, HttpServletResponse response, Model model, Object data) {
        try {
            if (null == model) {
                this.responseJson(request, response, data);
                return;
            }

            if (null == request) {
                model.addAttribute(RESPONSE_RESULT, data);
                return;
            }

            if (isResponseJSON(request)) {
                this.responseJson(request, response, data);
            } else {
                model.addAttribute(RESPONSE_RESULT, data);
            }
        } catch (Exception e) {
            logger.error("autoResponse,N", e);
        }
    }

    /***
     * 响应json 或 jsonp
     * 
     * @param request
     * @param response
     * @param data
     * @throws IOException
     */
    protected void responseJson(HttpServletRequest request, HttpServletResponse response, Object data) throws IOException {
        String callback = this.callback(request);
        PrintWriter writer = response.getWriter();
        writer.print("\r\t");
        String jsonStr = this.toJson(data);

        if (null == callback) {
            writer.print(jsonStr);
        } else {
            writer.print(callback);
            writer.print("(");
            writer.print(jsonStr);
            writer.print(")");
        }

        writer.flush();
        writer.close();
    }
    
    /***
     * 转化为json
     * 
     * @param data
     * @return
     */
    private String toJson(Object data) {
        if (null == data) {
            return "";
        }

        String result = null;

        if (data instanceof String) {
            result = (String) data;
        } else {
            result = JSONObject.toJSONString(data);
        }

        return result;
    }

    /***
     * response json的判断
     * 
     * @param request
     * @return
     */
    private boolean isResponseJSON(HttpServletRequest request) {
        if (null == request) {
            return false;
        }

        String requestUrl = request.getRequestURI();
        if (requestUrl.endsWith(JSON_SUFFIX)) {
            return true;
        }

        if (requestUrl.endsWith(DO_SUFFIX)) {
            return true;
        }

        return false;
    }
    
    /***
     * 从request中后去jsonp的 callback函数
     * 
     * @param request
     * @return
     */
    private String callback(HttpServletRequest request) {
        if (null == request) {
            return null;
        }
        String callback = request.getParameter(JSONP_CALLBACK);

        if (null == callback) {
            return callback;
        }

        return StringEscapeUtils.escapeHtml(callback);

    }
}
