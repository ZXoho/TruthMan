package com.cn.truth.service.impl;

import com.cn.truth.VO.NewsCommentVO;
import com.cn.truth.dao.NewsCommentDao;
import com.cn.truth.dataobject.NewsCommentInfo;
import com.cn.truth.service.NewsCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
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
    @Transactional
    public void delete(Integer commentId) {
        newsCommentDao.deleteByCommentId(commentId);

    }

    @Override
    public List<NewsCommentInfo> userCommentList(String userOpenid) {
        List<NewsCommentInfo> commentInfoList =new ArrayList<>();
        commentInfoList = newsCommentDao.findByUserOpenid(userOpenid);
        return commentInfoList;
    }

    @Override
    public List<NewsCommentInfo> newsCommentList(Integer newsId) {
        List<NewsCommentInfo> newsCommentInfoList = new ArrayList<>();
        newsCommentInfoList = newsCommentDao.findByNewsId(newsId);
        return newsCommentInfoList;
    }
}
