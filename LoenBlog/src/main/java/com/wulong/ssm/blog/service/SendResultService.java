package com.wulong.ssm.blog.service;

import com.wulong.ssm.blog.entity.SendResult;

/**
 * @Author: loen
 * @date: 2020/8/21 16:16
 * @Description: 地址发送至百度收录结果接口
 */
public interface SendResultService {
    /**
     * 登记发送结果
     * @param sendResult
     * @return
     */
    int insertSendResult(SendResult sendResult);

    /**
     * 查询当天剩余可发送地址数目
     * @param timestamp
     * @return
     */
    SendResult getSendResultLast(String timestamp);
}
