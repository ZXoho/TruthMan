package com.cn.thruth.dao;

import com.cn.thruth.dataobject.ArticleInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleInfoDao extends JpaRepository<ArticleInfo, String> {

    ArticleInfo findArticleInfoByArticleId(String articleId);
}
