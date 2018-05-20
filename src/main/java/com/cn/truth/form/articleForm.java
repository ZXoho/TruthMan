package com.cn.truth.form;

import lombok.Data;

@Data
public class articleForm {

    /** 文章标题 */
    private String title;

    /** 文章种类 */
    private Integer type;

    /** 文章内容 */
    private String content;

}
