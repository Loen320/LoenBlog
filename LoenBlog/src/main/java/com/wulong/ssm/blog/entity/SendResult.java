package com.wulong.ssm.blog.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author loen
 */
@Data
public class SendResult implements Serializable{

    private static final long serialVersionUID = -5547643789077379691L;

    private Integer articleId;

    private String result;

    private String timeStamp;

    private String resultJson;

    private Integer residueNum;

}