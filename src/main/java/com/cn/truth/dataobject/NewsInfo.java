package com.cn.truth.dataobject;

import lombok.Data;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class NewsInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer newsId;

    /** 上传用户openid */
    private String userOpenid;

    /** 新闻类型 默认0为待辟谣， 1为已辟谣 */
    private Integer newsType;

    /** 新闻链接 */
    private String newsUrl;

    /** 新闻上传时间 */
    private Date newsCreateTime;

    /** 新闻辟谣时间 */
    private Date newsUpdateTime;
}
