package com.cn.truth.util;

import com.cn.truth.VO.ResultVO;

public class ResultVOUtil {

    public static ResultVO success(Object object) {

        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(object);
        return resultVO;
    }
}
