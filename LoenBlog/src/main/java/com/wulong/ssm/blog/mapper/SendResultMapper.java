package com.wulong.ssm.blog.mapper;

import com.wulong.ssm.blog.entity.SendResult;

/**
 * @Author: loen
 * @date: 2020/8/21 16:22
 * @Description:
 */
public interface SendResultMapper {
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
