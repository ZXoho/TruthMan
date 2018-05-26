package com.cn.truth.enums;

import lombok.Getter;

@Getter
public enum ResultEnum {

    NEWS_TYPE_ERROR(1, "新闻状态错误"),

    UPLOAD_FAIL(2, "上传失败"),
    ;

    private Integer code;

    private String msg;

     ResultEnum (Integer code, String msg) {
         this.code = code;
         this.msg = msg;
     }
}
