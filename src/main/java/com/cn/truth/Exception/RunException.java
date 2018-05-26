package com.cn.truth.Exception;

import com.cn.truth.enums.ResultEnum;

public class RunException extends RuntimeException {

    private Integer code;

    public RunException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());

        this.code = resultEnum.getCode();
    }


}
