package com.cn.truth.dao;

import com.cn.truth.dataobject.ArticleTypeInfo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleTypeInfoDao extends JpaRepository<ArticleTypeInfo, String> {

    ArticleTypeInfo findByArticleType(Integer type);
}
