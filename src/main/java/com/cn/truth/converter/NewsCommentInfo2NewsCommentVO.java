package com.cn.truth.converter;

import com.cn.truth.VO.NewsCommentVO;
import com.cn.truth.dataobject.NewsCommentInfo;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NewsCommentInfo2NewsCommentVO {

    public static NewsCommentVO convert(NewsCommentInfo NewsCommentInfo) {
        NewsCommentVO newsCommentVO = new NewsCommentVO();
        BeanUtils.copyProperties(NewsCommentInfo, newsCommentVO);
        return newsCommentVO;
    }

    public static List<NewsCommentVO> convert(List<NewsCommentInfo> newsCommentInfoList) {
        List<NewsCommentVO> newsCommentVOList = new ArrayList<>();
        newsCommentVOList = newsCommentInfoList.stream().map(e -> convert(e))
                           .collect(Collectors.toList());
        return newsCommentVOList;

    }
}
