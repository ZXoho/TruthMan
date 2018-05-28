package com.cn.truth.converter;

import com.cn.truth.VO.UserCommentVO;
import com.cn.truth.dataobject.NewsCommentInfo;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NewsCommentInfo2UserCommentVO {

    public static UserCommentVO convert(NewsCommentInfo newsCommentInfo) {
        UserCommentVO userCommentVO = new UserCommentVO();
        BeanUtils.copyProperties(newsCommentInfo, userCommentVO);
        return userCommentVO;
    }

    public static List<UserCommentVO> convert(List<NewsCommentInfo> newsCommentInfoList) {
        List<UserCommentVO> userCommentVOList = new ArrayList<>();
        userCommentVOList = newsCommentInfoList.stream().map(e -> convert(e)).collect(Collectors.toList());
        return userCommentVOList;
    }
}
