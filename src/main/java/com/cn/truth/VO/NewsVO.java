package com.cn.truth.VO;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/** 新闻视图类 */

@Data
public class NewsVO implements Serializable {

    private static final long serialVersionUID = 7792580246813818595L;
    /** 新闻链接 */
    private String newsUrl;

    /** 新闻上传时间 */
    private Date newsCreateTime;

    /** 上传用户openid */
    private String userOpenid;

}
