package com.cn.thruth.service;

import com.cn.thruth.dataobject.ArticleInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ArticleService {

    /** 查找文章 */
    ArticleInfo findOne(String articleId);

    /** 添加文章 */
    ArticleInfo create(ArticleInfo article);

    /** 查找所有文章 */
    List<ArticleInfo> findAll();

    /** 修改文章 */
    ArticleInfo index(ArticleInfo article, String articleId);

    /** 删除文章 */
    void delete(String articleId);

    /** 上架文章 */
    ArticleInfo upArticle(String articleId);

    /** 下架文章 */
    ArticleInfo downArticle(String articleId);
}
