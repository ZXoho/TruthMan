package com.cn.truth.VO;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class NewsCommentVO implements Serializable{

    private static final long serialVersionUID = -2261426463700719601L;
    /** 用户openid */
    private String userOpenid;

    /** 用户评论 */
    private String comment;

    /** 评论创建时间 */
    private Date commentCreateTime;

    /** 评论Id */
    private Integer commentId;

   /** 点赞数 */
    private Integer thumbs;
}
