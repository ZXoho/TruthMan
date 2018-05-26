package com.cn.truth.service.impl;

import com.cn.truth.dataobject.NewsInfo;
import com.cn.truth.service.NewsService;
import com.cn.truth.service.mapper.NewsMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NewsServiceImplTest {

    @Autowired
    private NewsService newsService;
    @Test
    public void create() {
        NewsInfo news = new NewsInfo();
        news.setNewsUrl("http://liveboycams.org/couple-cams/");
        news.setNewsId(1);
        news.setNewsType(0);
        NewsInfo result = newsService.create(news);
        Assert.assertNotNull(result);
    }

    @Test
    public void delete() {
        newsService.delete(1);
    }

    @Test
    public void yes() {
        NewsInfo result = newsService.yes(1);
        Assert.assertNotNull(result);
    }

    @Test
    public void no() {
        NewsInfo result = newsService.no(1);
        Assert.assertNotNull(result);
    }

    @Test
    public void selectUnsolvedNew() {
        NewsInfo result = newsService.selectUnsolvedNew();
        Assert.assertNotNull(result);
    }
}