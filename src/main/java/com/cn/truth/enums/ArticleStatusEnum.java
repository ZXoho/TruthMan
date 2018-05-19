package com.cn.truth.enums;

import lombok.Getter;

@Getter
public enum ArticleStatusEnum {

    UP(0, "上架"),
    DOWN(1, "下架"),
    ;

    private Integer code;

    private String msg;



    ArticleStatusEnum(Integer code, String msg){

        this.code = code;
        this.msg = msg;
    }

}
