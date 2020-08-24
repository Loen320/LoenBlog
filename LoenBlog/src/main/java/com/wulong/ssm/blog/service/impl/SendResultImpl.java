package com.wulong.ssm.blog.service.impl;

import com.wulong.ssm.blog.entity.SendResult;
import com.wulong.ssm.blog.mapper.SendResultMapper;
import com.wulong.ssm.blog.service.SendResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: loen
 * @date: 2020/8/21 16:20
 * @Description:
 */
@Service
public class SendResultImpl implements SendResultService {
    @Autowired
    private SendResultMapper sendResultMapper;

    @Override
    public int insertSendResult(SendResult sendResult) {
        return sendResultMapper.insertSendResult(sendResult);
    }

    @Override
    public SendResult getSendResultLast(String timestamp) {
        return sendResultMapper.getSendResultLast(timestamp);
    }
}
