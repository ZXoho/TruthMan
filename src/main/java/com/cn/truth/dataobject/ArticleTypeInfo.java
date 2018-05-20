package com.cn.truth.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class ArticleTypeInfo {

    /** 文章种类编号 */
    @Id
    private Integer articleType;

    /** 种类名称 */
    private String typeName;

    /** 创建时间 */
    private Date createTime;

    /** 更新时间 */
    private Date updateTime;
}
