package com.cn.thruth.dataobject;

import com.cn.thruth.enums.ArticleStatusEnum;
import lombok.Data;
import javax.persistence.Id;

import javax.persistence.Entity;
import java.util.Date;

@Data
@Entity
public class ArticleInfo {

    @Id
    private String articleId;

     /** 文章种类 */
    private Integer articleType;

    /** 文章状态 默认0为上架，1为下架 */
    private Integer articleStatus = ArticleStatusEnum.UP.getCode();

    /** 文章标题 */
    private String articleTitle;

    /** 文章内容 */
    private String articleContent;

    /** 文章创建时间 */
    private Date createTime;

    /** 文章更新时间 */
    private Date updateTime;




}
