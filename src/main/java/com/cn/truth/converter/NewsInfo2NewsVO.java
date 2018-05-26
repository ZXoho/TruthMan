package com.cn.truth.converter;

import com.cn.truth.VO.NewsVO;
import com.cn.truth.dataobject.NewsInfo;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NewsInfo2NewsVO {

    public static NewsVO convert(NewsInfo newsInfo) {

        NewsVO newsVO = new NewsVO();
        BeanUtils.copyProperties(newsInfo, newsVO);
        return newsVO;
    }

    public static List<NewsVO> convert(List<NewsInfo> newsInfoList){

        return newsInfoList.stream().map(e -> convert(e))
                .collect(Collectors.toList());

    }

}
