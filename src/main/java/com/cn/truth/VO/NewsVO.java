package com.cn.truth.VO;

import lombok.Data;

import java.util.Date;

/** 新闻视图类 */

@Data
public class NewsVO {

    /** 新闻链接 */
    private String newsUrl;

    /** 新闻上传时间 */
    private Date newsCreateTime;

    /** 上传用户openid */
    private String userOpenid;

}
