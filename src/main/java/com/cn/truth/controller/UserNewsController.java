package com.cn.truth.controller;

import com.cn.truth.Exception.RunException;
import com.cn.truth.VO.NewsVO;
import com.cn.truth.VO.ResultVO;
import com.cn.truth.converter.NewsInfo2NewsVO;
import com.cn.truth.dataobject.NewsInfo;
import com.cn.truth.enums.ResultEnum;
import com.cn.truth.service.NewsService;
import com.cn.truth.util.ResultVOUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user/news")
@Slf4j
public class UserNewsController {

    @Autowired
    private NewsService newsService;

    @GetMapping("/create")
    public NewsVO create(@RequestParam("newsUrl") String newsUrl,
                         @RequestParam(value = "newsType", defaultValue = "0") Integer newsType) {
        NewsInfo news = new NewsInfo();
        news.setNewsUrl(newsUrl);
        news.setNewsType(newsType);
        NewsInfo result = newsService.create(news);
        if (result != null) {
            NewsVO newsVO = new NewsVO();
            newsVO.setNewsUrl(result.getNewsUrl());
            newsVO.setNewsCreateTime(result.getNewsCreateTime());
            return newsVO;
        } else {
            log.error("【上传新闻】 上传失败");
            throw new RunException(ResultEnum.UPLOAD_FAIL);
        }
    }


    @GetMapping("/list")
    public ResultVO list(){
        List<NewsInfo> newsInfoList = new ArrayList<>();
        newsInfoList = newsService.selectUnsolvedNews();
        List<NewsVO> newsVOList = NewsInfo2NewsVO.convert(newsInfoList);
        return ResultVOUtil.success(newsVOList);
    }
}




