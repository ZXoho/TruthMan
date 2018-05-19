package com.cn.truth.dao;

import com.cn.truth.dataobject.ArticleInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleInfoDao extends JpaRepository<ArticleInfo, String> {

    ArticleInfo findArticleInfoByArticleId(String articleId);
}
