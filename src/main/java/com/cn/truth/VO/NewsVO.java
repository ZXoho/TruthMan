package com.cn.truth.VO;

import lombok.Data;

import java.util.Date;

/** 新闻试图类 */

@Data
public class NewsVO {

    /** 新闻链接 */
    private String newsUrl;

    /** 新闻上传时间 */
    private Date newsCreateTime;

}
