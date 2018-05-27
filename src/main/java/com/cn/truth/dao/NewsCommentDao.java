package com.cn.truth.dao;


import com.cn.truth.dataobject.NewsCommentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NewsCommentDao extends JpaRepository<NewsCommentInfo, Integer> {
    List<NewsCommentInfo> findByNewsId(Integer newsId);
    List<NewsCommentInfo> findByUserOpenid(String userOpenid);

}
