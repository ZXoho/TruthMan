package com.cn.truth.service.impl;



import com.cn.truth.dao.NewsInfoDao;
import com.cn.truth.dataobject.NewsInfo;

import com.cn.truth.service.NewsService;
import com.cn.truth.service.mapper.NewsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsInfoDao newsInfoDao;
    @Autowired
    private NewsMapper newsMapper;

    @Override
    public NewsInfo create(NewsInfo news) {
        NewsInfo result = newsInfoDao.save(news);
        return result;
    }

    @Override

    public void delete(Integer newsId) {
        newsInfoDao.deleteByNewsId(newsId);

    }

    @Override
    public NewsInfo yes(Integer newsId) {
        NewsInfo news = newsInfoDao.findByNewsId(newsId);
        if(news.getNewsType() == 0) {
            news.setNewsType(1);
            NewsInfo result = newsInfoDao.save(news);
            return result;
        } else {
            return null;

        }

    }

    @Override
    public NewsInfo no(Integer newsId) {
        NewsInfo news = newsInfoDao.findByNewsId(newsId);
        if(news.getNewsType() == 1) {
            news.setNewsType(0);
            NewsInfo result = newsInfoDao.save(news);
            return result;
        }else {
            return null;
        }

    }

    @Override
    public NewsInfo selectUnsolvedNew() {
        NewsInfo result = newsMapper.selectUnsolvedNews();
        return result;
    }
}
