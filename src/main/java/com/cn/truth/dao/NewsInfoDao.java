package com.cn.truth.dao;

import com.cn.truth.dataobject.NewsInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

public interface NewsInfoDao extends JpaRepository<NewsInfo, String> {

    NewsInfo findByNewsId(Integer newsId);

    @Transactional
    int deleteByNewsId(Integer newsId);
}
