package com.cn.truth.enums;

public enum NewsTypeEnum {

    NEWS_NOT_SOLVE(0, "新闻待处理"),

    NEWS_SOLVED(1, "新闻已处理"),

    NEWS_NOT_ALLOW(2, "新闻敏感"),
    ;

    private Integer code;

    private String msg;

    NewsTypeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
