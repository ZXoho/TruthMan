package com.cn.truth.service.impl;

import com.cn.truth.dataobject.NewsInfo;
import com.cn.truth.service.NewsService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NewsServiceImplTest {

    @Autowired
    private NewsService newsService;
    @Test
    public void create() {
        NewsInfo news = new NewsInfo();
        news.setNewsUrl("https://unbug.github.io/");
        //news.setNewsId(1);
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
        PageRequest pageRequest = new PageRequest(0,2);
        Page<NewsInfo> result = newsService.selectUnsolvedNews(0, pageRequest);
        Assert.assertNotNull(result);
    }
}