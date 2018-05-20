package com.cn.truth.service;

import com.cn.truth.dataobject.ArticleInfo;
import com.cn.truth.dataobject.ArticleTypeInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ArticleTypeService {

    /** 添加种类 */
    ArticleTypeInfo create(ArticleTypeInfo articleType);

    /** 删除种类 */
    void delete(Integer articleType);

    /** 修改种类 */
    ArticleTypeInfo index(Integer articleType);

    /** 查找 */
    ArticleTypeInfo findOne(Integer articleType);

    /** 查找所有 */
    List<ArticleTypeInfo> findAll();
}
