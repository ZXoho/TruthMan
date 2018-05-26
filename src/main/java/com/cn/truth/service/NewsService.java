package com.cn.truth.service;

import com.cn.truth.dataobject.NewsInfo;
import org.springframework.stereotype.Service;


@Service
public interface NewsService {

    /** 添加新闻 */
    NewsInfo create(NewsInfo news);

    /** 删除新闻 */

    void delete(Integer newsId);

    /** 修改为已辟谣 */
    NewsInfo yes(Integer newsId);

    /** 修改为未辟谣 */
    NewsInfo no(Integer newsId);

    /**
     * 查询未辟谣新闻
     * 接口在mapper中
     */
    NewsInfo selectUnsolvedNew();

}
