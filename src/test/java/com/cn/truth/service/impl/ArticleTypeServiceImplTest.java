package com.cn.truth.service.impl;

import com.cn.truth.dao.ArticleTypeInfoDao;
import com.cn.truth.dataobject.ArticleTypeInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ArticleTypeServiceImplTest {

    @Autowired
    private ArticleTypeInfoDao articleTypeInfoDao;
    @Test
    public void create() {

        ArticleTypeInfo articleType = new ArticleTypeInfo();
        articleType.setArticleType(1);
        articleType.setTypeName("养生");
        articleTypeInfoDao.save(articleType);
    }

    @Test
    public void delete() {
    }

    @Test
    public void index() {
    }

    @Test
    public void findOne() {
    }

    @Test
    public void findAll() {
    }
}