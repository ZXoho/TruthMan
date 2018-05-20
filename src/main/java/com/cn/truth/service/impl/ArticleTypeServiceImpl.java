package com.cn.truth.service.impl;

import com.cn.truth.dao.ArticleTypeInfoDao;
import com.cn.truth.dataobject.ArticleTypeInfo;
import com.cn.truth.service.ArticleTypeService;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

public class ArticleTypeServiceImpl implements ArticleTypeService {

    @Autowired
    private ArticleTypeInfoDao articleTypeDao;

    @Override
    public ArticleTypeInfo create(ArticleTypeInfo articleType) {
        ArticleTypeInfo result = articleTypeDao.save(articleType);
        return result;
    }

    @Override
    public void delete(Integer articleType) {

    }

    @Override
    public ArticleTypeInfo index(Integer articleType) {
        return null;
    }

    @Override
    public ArticleTypeInfo findOne(Integer articleType) {
        return null;
    }

    @Override
    public List<ArticleTypeInfo> findAll() {
        return null;
    }
}
