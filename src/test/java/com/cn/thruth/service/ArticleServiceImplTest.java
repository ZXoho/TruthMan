package com.cn.truth.service;

import com.cn.truth.dao.ArticleInfoDao;
import com.cn.truth.dataobject.ArticleInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.xml.ws.Action;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ArticleServiceImplTest {

    @Autowired
    private ArticleInfoDao articleInfoDao;

    @Test
    public void findOne() {
    }

    @Test
    public void create() {
        ArticleInfo article = new ArticleInfo();
        article.setArticleId("5234");
        article.setArticleType(1);
        article.setArticleStatus(0);
        article.setArticleTitle("红牛配小龙虾要变丑");
        article.setArticleContent("<h1>这是假新闻</h1>");
        ArticleInfo result = articleInfoDao.save(article);
        Assert.assertNotNull(result);
    }

    @Test
    public void findAll() {
    }

    @Test
    public void index() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void upArticle() {
    }

    @Test
    public void downArticle() {
    }
}