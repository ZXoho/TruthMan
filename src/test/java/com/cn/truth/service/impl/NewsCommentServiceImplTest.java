package com.cn.truth.service.impl;

import com.cn.truth.dao.NewsCommentDao;
import com.cn.truth.dataobject.NewsCommentInfo;
import com.cn.truth.service.NewsCommentService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NewsCommentServiceImplTest {

    @Autowired
    private NewsCommentService newsCommentService;

    @Test
    public void create() {
        NewsCommentInfo newsCommentInfo = new NewsCommentInfo();
        newsCommentInfo.setComment("我要跟你生猴子");
        newsCommentInfo.setNewsId(2);
        newsCommentInfo.setNewsUrl("https://github.com/thinkgem/jeesite");
        newsCommentInfo.setUserOpenid("s4fgvc56s4z");
        NewsCommentInfo result = newsCommentService.create(newsCommentInfo);
        System.out.println(result);
        Assert.assertNotNull(result);

    }

    @Test
    public void delete() {
       newsCommentService.delete(1);

    }

    @Test
    public void userCommentList() {
        List<NewsCommentInfo> result = new ArrayList<>();
        result = newsCommentService.userCommentList("s4fgvc56s4z");
        Assert.assertNotNull(result);
        System.out.println(result);
    }

    @Test
    public void newsCommentList() {
        List<NewsCommentInfo> result = new ArrayList<>();
        result = newsCommentService.newsCommentList(2);
        Assert.assertNotNull(result);
        System.out.println(result);
    }
}