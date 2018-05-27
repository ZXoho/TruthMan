package com.cn.truth.service.impl;

import com.cn.truth.VO.NewsCommentVO;
import com.cn.truth.dao.NewsCommentDao;
import com.cn.truth.dataobject.NewsCommentInfo;
import com.cn.truth.service.NewsCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsCommentServiceImpl implements NewsCommentService {

    @Autowired
    private NewsCommentDao newsCommentDao;

    @Override
    public NewsCommentInfo create(NewsCommentInfo newsCommentInfo) {
        NewsCommentInfo result = new NewsCommentInfo();
        result = newsCommentDao.save(newsCommentInfo);
        return result;
    }

    @Override
    public void delete(Integer commentId) {

    }

    @Override
    public List<NewsCommentVO> list(String userOpenid) {
        return null;
    }
}
