package com.cn.truth.VO;

import lombok.Data;

import java.util.Date;

@Data
public class NewsCommentVO {

    /** 用户openid */
    private String userOpenid;

    /** 用户评论 */
    private String comment;

    /** 评论创建时间 */
    private Date commentCreateTime;

    /** 评论Id */
    private Integer commentId;
}
