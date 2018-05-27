package com.cn.truth.service;

import com.cn.truth.VO.NewsCommentVO;
import com.cn.truth.dataobject.NewsCommentInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface  NewsCommentService {

    /** 用户上传评论 */
    NewsCommentInfo create(NewsCommentInfo newsCommentInfo);

    /** 用户删除评论 */
    void delete(Integer commentId);

    /** 用户获取已评论 */
    List<NewsCommentVO> list(String userOpenid);
}
