package com.cn.truth.dao;

import com.cn.truth.dataobject.NewsInfo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class NewsInfoDaoTest {

    @Autowired
    private NewsInfoDao newsInfoDao;

    @Test
    public void findByNewsId() {
        NewsInfo result = newsInfoDao.findByNewsId(1);
        System.out.println(result);
    }

    @Test
    public void deleteByNewsId() {
        newsInfoDao.deleteByNewsId(1);
    }


}