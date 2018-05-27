package com.cn.truth.form;

import lombok.Data;

@Data
public class NewsCommentForm {

    /** 用户评论内容 */
    private String comment;

    /** 新闻Id */
    private Integer newsId;

    /** 新闻链接 */
    private String newsUrl;

    /** 用户openid */
    private String userOpenid;

}
