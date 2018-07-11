package com.cn.truth.dataobject;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
//@Table(name = "news_comment_info")
public class NewsCommentInfo {

    /** 评论Id */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer commentId;
    /** 新闻id */
    private Integer newsId;

    /** 新闻链接 */
    private String newsUrl;

    /** 用户openid */
    private String userOpenid;

    /** 用户评论 */
    private String comment;

    /** 评论创建时间 */
    private Date commentCreateTime;

    /** 评论点赞数 */
    private Integer thumbs = 0;



}
