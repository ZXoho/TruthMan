package com.cn.truth.service.mapper;


import com.cn.truth.dataobject.NewsInfo;
import org.springframework.stereotype.Service;

@Service
public interface NewsMapper {

    NewsInfo selectUnsolvedNews();
}
