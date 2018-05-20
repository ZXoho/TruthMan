package com.cn.truth.service.impl;

import com.cn.truth.dao.ArticleInfoDao;
import com.cn.truth.dataobject.ArticleInfo;
import com.cn.truth.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleInfoDao articleInfoDao;

    @Override
    public ArticleInfo findOne(String articleId) {
        ArticleInfo article = articleInfoDao.findArticleInfoByArticleId(articleId);
        return article;
    }

    @Override
    public ArticleInfo create(ArticleInfo article) {
        ArticleInfo result = articleInfoDao.save(article);
        return result;
    }

    @Override
    public List<ArticleInfo> findAll() {
        return null;
    }

    @Override
    public ArticleInfo index(ArticleInfo article, String articleId) {
        return null;
    }

    @Override
    public void delete(String articleId) {

    }

    @Override
    public ArticleInfo upArticle(String articleId) {
        return null;
    }

    @Override
    public ArticleInfo downArticle(String articleId) {
        return null;
    }
}
