package com.cn.truth.VO;

import lombok.Data;

import java.io.Serializable;

@Data
public class ResultVO<T> implements Serializable {

    private static final long serialVersionUID = -2797410952762818475L;
    //错误码
    private Integer code;

    //提示信息
    private String msg;

    //具体内容
    private T data;


}
