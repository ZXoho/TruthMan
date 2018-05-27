package com.cn.truth.converter;

import com.cn.truth.dataobject.NewsCommentInfo;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NewsCommentInfo2NewsCommentVO {

    public static NewsInfo2NewsVO convert(NewsCommentInfo NewsCommentInfo) {
        NewsInfo2NewsVO newsInfo2NewsVO = new NewsInfo2NewsVO();
        BeanUtils.copyProperties(NewsCommentInfo, newsInfo2NewsVO);
        return newsInfo2NewsVO;
    }

    public static List<NewsInfo2NewsVO> convert(List<NewsCommentInfo> newsCommentInfoList) {
        List<NewsInfo2NewsVO> newsInfo2NewsVOList = new ArrayList<>();
        newsInfo2NewsVOList = newsCommentInfoList.stream().map(e -> convert(e))
                           .collect(Collectors.toList());
        return newsInfo2NewsVOList;

    }
}
